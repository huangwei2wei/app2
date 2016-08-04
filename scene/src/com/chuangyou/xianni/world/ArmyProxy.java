package com.chuangyou.xianni.world;

import java.util.Set;

import com.chuangyou.common.protobuf.pb.PostionMsgProto.PostionMsg;
import com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3;
import com.chuangyou.common.protobuf.pb.army.ArmyInfoReloadMsgProto.ArmyInfoReloadMsg;
import com.chuangyou.common.protobuf.pb.army.PetInfoProto.PetInfoMsg;
import com.chuangyou.common.protobuf.pb.army.PropertyMsgProto.PropertyMsg;
import com.chuangyou.common.protobuf.pb.player.PlayerAttUpdateProto.PlayerAttUpdateMsg;
import com.chuangyou.common.util.Log;
import com.chuangyou.common.util.Vector3;
import com.chuangyou.xianni.campaign.Campaign;
import com.chuangyou.xianni.campaign.CampaignMgr;
import com.chuangyou.xianni.common.Vector3BuilderHelper;
import com.chuangyou.xianni.constant.EnumAttr;
import com.chuangyou.xianni.exec.AbstractActionQueue;
import com.chuangyou.xianni.exec.AbstractCmdTaskQueue;
import com.chuangyou.xianni.exec.CmdTask;
import com.chuangyou.xianni.exec.CmdTaskQueue;
import com.chuangyou.xianni.exec.ThreadManager;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.CenterProtocol;
import com.chuangyou.xianni.role.helper.IDMakerHelper;
import com.chuangyou.xianni.role.objects.Pet;
import com.chuangyou.xianni.role.objects.Player;
import com.chuangyou.xianni.team.NotifyHelper;
import com.chuangyou.xianni.team.TeamMgr;
import com.chuangyou.xianni.warfield.FieldMgr;
import com.chuangyou.xianni.warfield.field.Field;
import com.chuangyou.xianni.warfield.helper.NotifyNearHelper;
import com.chuangyou.xianni.warfield.helper.selectors.PlayerSelectorHelper;

import io.netty.channel.Channel;

/**
 * 部队代理
 */
public class ArmyProxy extends AbstractActionQueue {
	private CmdTaskQueue	cmdTaskQueue;
	private long			playerId;		// 用户ID
	private String			site;			// 站点（跨服用）
	private Channel			channel;		// 连接器
	private int				fieldId;		// 地图ID，用户退出，回写到center
	// private Vector3 position; // 主角位置，用户退出，回写到center

	private Player			player;			// 英雄
	private Pet				pet;			// 宠物

	public ArmyProxy(long playerId, String site, Channel channel, SimplePlayerInfo simplePlayerInfo, Player hero, Pet pet) {
		super(ThreadManager.actionExecutor);
		this.playerId = playerId;
		this.site = site;
		this.channel = channel;
		this.player = hero;
		this.player.setSimpleInfo(simplePlayerInfo);
		this.pet = pet;
		this.cmdTaskQueue = new AbstractCmdTaskQueue(ThreadManager.cmdExecutor);
	}

	/**
	 * 像客户端发送数据包
	 * 
	 * @param packet
	 */
	public void sendPbMessage(PBMessage packet) {
		if (packet == null) {
			return;
		}
		packet.setPlayerId(playerId);
		if (channel == null || channel.isActive() == false) {
			return;
		}
		try {
			channel.write(packet);
			channel.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 切换地图 */
	public void changeField(Field field, Vector3 postion) {
		leave();
		join(field, postion);
		NotifyHelper.notifyInfo(this);
	}

	public void leave() {
		Field field = FieldMgr.getIns().getField(getFieldId());
		if (field != null) {
			field.leaveField(player);
			Vector3 v3 = field.getFieldInfo().getPosition();
			player.setPostion(v3);
			if (pet != null) {
				field.leaveField(pet);
			}
			setFieldId(0);
		}
	}

	public void join(Field field, Vector3 postion) {
		player.setPostion(postion);
		// 接受进场保护
		player.setProtection(true);
		setFieldId(field.id);
		field.enterField(player);
		if (pet != null) {
			pet.setPostion(postion);
			pet.setProtection(true);
			field.enterField(pet);
		}
	}

	/**
	 * 更新宠物信息
	 * 
	 * @param petInfo
	 */
	public void updatePet(PetInfoMsg petInfo) {

		if (pet == null) {
			pet = new Pet(playerId, IDMakerHelper.nextID());
			pet.readPetInfo(petInfo);
			pet.setPostion(player.getPostion());

			player.getField().enterField(pet);

			// PBMessage selfMsg =
			// MessageUtil.buildMessage(Protocol.U_RESP_ATT_SNAP,
			// pet.getAttSnapMsg());
			// this.sendPbMessage(selfMsg);
		} else {
			if (pet.getSkin() != petInfo.getPetTempId()) {
				pet.getField().leaveField(pet);
				pet.destory();
				pet = new Pet(playerId, IDMakerHelper.nextID());
				pet.readPetInfo(petInfo);
				pet.setPostion(player.getPostion());

				player.getField().enterField(pet);

				// PBMessage selfMsg =
				// MessageUtil.buildMessage(Protocol.U_RESP_ATT_SNAP,
				// pet.getAttSnapMsg());
				// this.sendPbMessage(selfMsg);
			} else {
				PlayerAttUpdateMsg.Builder attUpdateMsg = PlayerAttUpdateMsg.newBuilder();
				if (petInfo.getPetSoul() != pet.getPetSoul()) {
					PropertyMsg.Builder proMsg = PropertyMsg.newBuilder();
					proMsg.setType(EnumAttr.PetSoul.getValue());
					proMsg.setTotalPoint(petInfo.getPetSoul());
					attUpdateMsg.addAtt(proMsg);
					pet.setPetSoul(petInfo.getPetSoul());
				}
				if (petInfo.getPetPhysique() != pet.getPetPhysique()) {
					PropertyMsg.Builder proMsg = PropertyMsg.newBuilder();
					proMsg.setType(EnumAttr.PetPhysique.getValue());
					proMsg.setTotalPoint(petInfo.getPetPhysique());
					attUpdateMsg.addAtt(proMsg);
					pet.setPetPhysique(petInfo.getPetPhysique());
				}
				if (petInfo.getPetQuality() != pet.getPetQuality()) {
					PropertyMsg.Builder proMsg = PropertyMsg.newBuilder();
					proMsg.setType(EnumAttr.PetQuality.getValue());
					proMsg.setTotalPoint(petInfo.getPetQuality());
					attUpdateMsg.addAtt(proMsg);
					pet.setPetQuality(petInfo.getPetQuality());
				}
				if (attUpdateMsg.getAttList() != null && attUpdateMsg.getAttList().size() > 0) {
					attUpdateMsg.setPlayerId(pet.getId());

					// PBMessage selfMsg =
					// MessageUtil.buildMessage(Protocol.U_RESP_PLAYER_ATT_UPDATE,
					// attUpdateMsg);
					// this.sendPbMessage(selfMsg);

					Set<Long> nears = pet.getNears(new PlayerSelectorHelper(pet));
					NotifyNearHelper.notifyAttrChange(this, nears, attUpdateMsg.build());
				}
			}
		}

	}

	private static final EnumAttr[] reloadAttrs = { EnumAttr.CUR_SOUL, EnumAttr.CUR_BLOOD };

	public void unload() {
		Field field = FieldMgr.getIns().getField(getFieldId());
		try {
			ArmyInfoReloadMsg.Builder armyReload = ArmyInfoReloadMsg.newBuilder();
			for (EnumAttr attr : reloadAttrs) {
				PropertyMsg.Builder pbulider = PropertyMsg.newBuilder();
				pbulider.setType(attr.getValue());
				pbulider.setTotalPoint(player.getProperty(attr.getValue()));
				armyReload.addPropertys(pbulider.build());
			}

			if (field != null && player.getPostion() != null) {
				PostionMsg.Builder postion = PostionMsg.newBuilder();
				postion.setMapId(this.fieldId);
				postion.setMapKey(field.getMapKey());

				Vector3 curPos = player.getPostion();
				PBVector3.Builder pbPos = Vector3BuilderHelper.build(curPos);
				postion.setPostion(pbPos.build());
				armyReload.setPostion(postion.build());

				Campaign campaign = CampaignMgr.getCampagin(field.getCampaignId());
				if (campaign != null) {
					campaign.unline(this);
				}
				// 离开地图
				field.leaveField(player);
				if (pet != null) {
					field.leaveField(pet);
				}
			}

			PBMessage redata = MessageUtil.buildMessage(CenterProtocol.C_PLAYER_RELOAD_SCENCE_DATA, armyReload);
			sendPbMessage(redata);
		} catch (Exception e) {
			Log.error("unload player error,playerId :" + getPlayerId(), e);
		} finally {
			player.destory();
			if (pet != null) {
				pet.destory();
			}
		}
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public CmdTaskQueue getCmdTaskQueue() {
		return cmdTaskQueue;
	}

	public void enqueue(CmdTask cmdTask) {
		cmdTaskQueue.enqueue(cmdTask);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
