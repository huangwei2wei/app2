package com.chuangyou.xianni.campaign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.chuangyou.common.protobuf.pb.campaign.CampaignInfoMsgProto.CampaignInfoMsg;
import com.chuangyou.common.protobuf.pb.campaign.CampaignStatuMsgProto.CampaignStatuMsg;
import com.chuangyou.common.protobuf.pb.map.SpawnNodeChangeListMsgProto.SpawnNodeChangeListMsg;
import com.chuangyou.common.protobuf.pb.map.SpawnNodeChangeMsgProto.SpawnNodeChangeMsg;
import com.chuangyou.common.protobuf.pb.task.PassFbInnerProto.PassFbInnerMsg;
import com.chuangyou.common.util.Log;
import com.chuangyou.common.util.ThreadSafeRandom;
import com.chuangyou.common.util.Vector3;
import com.chuangyou.xianni.campaign.action.CampaignEnterAction;
import com.chuangyou.xianni.campaign.action.CampaignLeaveAction;
import com.chuangyou.xianni.campaign.action.TransferFieldAction;
import com.chuangyou.xianni.campaign.state.CampaignState;
import com.chuangyou.xianni.campaign.state.ClosedState;
import com.chuangyou.xianni.campaign.state.OpeningState;
import com.chuangyou.xianni.campaign.state.PrepareState;
import com.chuangyou.xianni.campaign.state.StopState;
import com.chuangyou.xianni.constant.EnterMapResult;
import com.chuangyou.xianni.entity.campaign.CampaignTemplateInfo;
import com.chuangyou.xianni.entity.field.FieldInfo;
import com.chuangyou.xianni.entity.spawn.SpawnInfo;
import com.chuangyou.xianni.exec.AbstractActionQueue;
import com.chuangyou.xianni.exec.DelayAction;
import com.chuangyou.xianni.exec.ThreadManager;
import com.chuangyou.xianni.netty.GatewayLinkedSet;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.ClientProtocol;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.role.helper.IDMakerHelper;
import com.chuangyou.xianni.warfield.FieldMgr;
import com.chuangyou.xianni.warfield.field.Field;
import com.chuangyou.xianni.warfield.spawn.SpwanNode;
import com.chuangyou.xianni.warfield.template.FieldTemplateMgr;
import com.chuangyou.xianni.world.ArmyProxy;

/**
 * 基础副本信息
 */
public class Campaign extends AbstractActionQueue {

	public static final int									BORN_POINT			= 1;	// 出生点
	public static final int									REVIVAL_POINT		= 2;	// 复活点
	public static final int									END_POIN			= 3;	// 副本终点
	public static final int									MONSTER_CALLER		= 4;	// 召唤阵
	public static final int									GROUP_CREATER_NODE	= 5;	// 分组节点

	protected ThreadSafeRandom								random;						// 副本随机
	protected int											id;
	protected int											campaignId;
	protected String										name;						// 副本名称
	protected CampaignTemplateInfo							campaignTemplateInfo;		// 副本信息
	protected long											creater;					// 创建人
	protected Map<Long, ArmyProxy>							armys;						// 副本部队
	protected Field											starField;					// 起始地图
	protected Map<Integer, Field>							allFields;					// 副本地图
	protected Map<Integer, Field>							tempFieldMapping;			// 模板ID映射
	protected Map<Integer, Integer>							indexMapping;				// 序号地图映射
	protected long											beginTime;					// 开始时间
	protected CampaignState									state;						// 当前状态
	protected Map<Integer, SpwanNode>						spwanNodes;					// 副本怪物刷新节点
	protected SpwanNode										bornNode;					// 当前副本出生点
	protected SpwanNode										revivalNode;				// 当前副本复活点

	protected Map<Integer, List<SpwanNode>>					changeNodes;				// 发生过状态变更的节点
	protected long											expiredTime;				// 副本过期时间

	protected Map<Integer, Map<Integer, List<SpwanNode>>>	teamNodes;					// 将同组的节点分组<所属召唤阵ID,<分组ID,组成员集>>

	public Campaign(CampaignTemplateInfo tempInfo, ArmyProxy creater) {
		super(ThreadManager.actionExecutor);
		this.id = IDMakerHelper.campaignId();
		this.campaignId = tempInfo.getTemplateId();
		this.campaignTemplateInfo = tempInfo;
		this.armys = new HashMap<>();
		this.allFields = new HashMap<>();
		this.spwanNodes = new HashMap<>();
		this.state = new PrepareState(this);
		this.tempFieldMapping = new HashMap<>();
		this.changeNodes = new HashMap<>();
		this.indexMapping = new HashMap<>();
		this.teamNodes = new HashMap<>();
		this.creater = creater.getPlayerId();
		this.expiredTime = 0;
		this.random = new ThreadSafeRandom();
	}

	/** 地图开始 */
	public void start() {
		state = new OpeningState(this);
		// 获取副本所有地图
		Map<Integer, FieldInfo> finfos = FieldTemplateMgr.getCFieldInfos(campaignId);
		// 创建当前地图
		for (Entry<Integer, FieldInfo> entry : finfos.entrySet()) {
			int index = entry.getKey();
			FieldInfo temp = entry.getValue();
			// 创建地图
			Field f = FieldMgr.getIns().createCampaignField(temp.getMapKey(), temp.getType(), id);
			Map<Integer, SpwanNode> sonNodes = f.getSpawnNodes();
			// 管理节点
			spwanNodes.putAll(sonNodes);
			allFields.put(f.id, f);
			tempFieldMapping.put(f.getMapKey(), f);
			indexMapping.put(temp.getCampaignIndex(), f.id);
			// 设置为初始地图
			if (index == 1) {
				starField = f;
			}
		}
		this.beginTime = System.currentTimeMillis();
	}

	/**
	 * 进入副本
	 */
	public void onPlayerEnter(ArmyProxy army) {
		CampaignEnterAction enterAction = new CampaignEnterAction(this, army, starField);
		enqueue(enterAction);
	}

	/**
	 * 进入副本
	 */
	public void onPlayerEnter(ArmyProxy army, int mapId, Vector3 v3) {
		// 简单判断
		Field field = getEnterField(mapId);
		if (field == null) {
			field = starField;
		}
		CampaignEnterAction enterAction = new CampaignEnterAction(this, army, field, v3);
		enqueue(enterAction);
	}

	/**
	 * 退出副本
	 */
	public void onPlayerLeave(ArmyProxy army) {
		CampaignLeaveAction action = new CampaignLeaveAction(this, army);
		enqueue(action);
	}

	/**
	 * 副本下线
	 */
	public void unline(ArmyProxy army) {
		CampaignLeaveAction action = new CampaignLeaveAction(this, army, true);
		enqueue(action);
	}

	/** 获取副本当前人数 */
	public int getArmyCount() {
		return armys.size();
	}

	/**
	 * 副本结束
	 */
	public void over() {
		state = new StopState(this);
		PassFbInnerMsg.Builder passFbMsg = PassFbInnerMsg.newBuilder();
		passFbMsg.setCampaignId(campaignId);
		
		CampaignStatuMsg.Builder cstatu = CampaignStatuMsg.newBuilder();
		cstatu.setCampaignId(getIndexId());
		cstatu.setStatu(0);// 退出
		PBMessage statuMsg = MessageUtil.buildMessage(Protocol.C_CAMPAIGN_STATU, cstatu);
		for (ArmyProxy army : armys.values()) {
			sendCampaignInfo(army);
			onPlayerLeave(army);
			// 通知center服务器,玩家副本销毁了
			army.sendPbMessage(statuMsg);
			passFbMsg.addPlayers(army.getPlayerId());
		}
		
		PBMessage passFbpkg = MessageUtil.buildMessage(Protocol.C_REQ_PASS_FB, passFbMsg);
		GatewayLinkedSet.send2Server(passFbpkg);
		
		setExpiredTime(System.currentTimeMillis() + 5 * 60 * 1000);
	}

	/** 清理副本信息 */
	public void clearCampaignData() {
		this.clear();
		this.armys.clear();
		this.armys.clear();
		this.armys = null;
		this.starField = null;
		for (Field f : allFields.values()) {
			f.destroy();
		}
		this.allFields.clear();
		this.allFields = null;
		this.spwanNodes.clear();
		this.spwanNodes = null;
		tempFieldMapping.clear();
		indexMapping.clear();
		changeNodes.clear();
		teamNodes.clear();
		CampaignMgr.remove(id);

	}

	public void addArmy(ArmyProxy army) {
		armys.put(army.getPlayerId(), army);
	}

	public void removeArmy(ArmyProxy army) {
		armys.remove(army.getPlayerId());
		if (armys.size() == 0) {
			expiredTime = System.currentTimeMillis() + 30 * 60 * 1000;
		}
	}

	public void setCreater(long creater) {
		this.creater = creater;
	}

	public boolean isEmpty() {
		return armys == null || armys.size() == 0;
	}

	public static class CloseDelayAction extends DelayAction {
		Campaign campaign;

		public CloseDelayAction(Campaign campaign, int delay) {
			super(campaign, delay);
			this.campaign = campaign;
		}

		@Override
		public void execute() {
			campaign.over();
		}
	}

	/* 发送副本信息 */
	public void sendCampaignInfo(ArmyProxy army) {
		CampaignInfoMsg.Builder infoMsg = CampaignInfoMsg.newBuilder();
		infoMsg.setId(id);
		infoMsg.setCount(armys.size());
		infoMsg.setCreaterId(creater);
		infoMsg.setCreateTime(beginTime);
		infoMsg.setState(state.getCode());
		infoMsg.setTempId(campaignId);
		infoMsg.setOpenTime(60 * 60 * 1000);
		if (expiredTime != 0) {
			infoMsg.setBackTime((int) ((expiredTime - System.currentTimeMillis())));
		}
		PBMessage message = MessageUtil.buildMessage(Protocol.U_CAMPAIGN_INFO, infoMsg);
		army.sendPbMessage(message);
	}

	public Field getEnterField(int mapId) {
		if (mapId == 0) {
			return starField;
		} else {
			return allFields.get(mapId);
		}
	}

	/** 穿透地图 */
	public Field findField(ArmyProxy army, int mapKey) {
		// 定点传送
		if (mapKey != 0) {
			return tempFieldMapping.get(mapKey);
		}
		// 下一个地图
		Field field = allFields.get(army.getFieldId());
		if (field == null) {
			Log.error("army get next field is null ,army fieldId:" + army.getFieldId());
			return null;
		}

		int index = field.getFieldInfo().getCampaignIndex();
		return allFields.get(indexMapping.get(index));
	}

	// 传送
	public void teleport(ArmyProxy army, SpawnInfo tempinfo) {
		TransferFieldAction action = new TransferFieldAction(this, army, tempinfo);
		enqueue(action);
	}

	/* 更新节点状态 */
	public void updateSpawnInfo(SpwanNode info) {
		SpawnNodeChangeListMsg.Builder list = SpawnNodeChangeListMsg.newBuilder();
		SpawnNodeChangeMsg.Builder builder = SpawnNodeChangeMsg.newBuilder();
		builder.setNodeId(info.getSpwanId());
		builder.setStatu(info.getState().getCode());
		list.addList(builder);
		PBMessage message = MessageUtil.buildMessage(ClientProtocol.U_CAMPAIGN_NODE_INFO, list);

		for (ArmyProxy army : armys.values()) {

			army.sendPbMessage(message);
		}
		int fieldId = info.getField().id;
		List<SpwanNode> nodes = changeNodes.get(fieldId);
		if (nodes == null) {
			nodes = new ArrayList<>();
		}
		nodes.add(info);
		changeNodes.put(fieldId, nodes);
	}

	/**
	 * 进入地图后，通知该地图变更后节点信息
	 */
	public void noticeChangeNode(ArmyProxy army, Field field) {
		List<SpwanNode> nodes = changeNodes.get(field.id);
		if (nodes != null) {
			SpawnNodeChangeListMsg.Builder list = SpawnNodeChangeListMsg.newBuilder();
			for (SpwanNode node : nodes) {
				SpawnNodeChangeMsg.Builder builder = SpawnNodeChangeMsg.newBuilder();
				builder.setNodeId(node.getSpwanId());
				builder.setStatu(node.getState().getCode());
				list.addList(builder);
			}
			PBMessage message = MessageUtil.buildMessage(ClientProtocol.U_CAMPAIGN_NODE_INFO, list);
			army.sendPbMessage(message);
		}
	}

	public void setSpwanNodes(Map<Integer, SpwanNode> spwanNodes) {
		this.spwanNodes = spwanNodes;
	}

	public void changeRevivalNode(SpwanNode revivalNode) {
		SpwanNode older = this.revivalNode;
		if (older != null) {
			older.stateTransition(new com.chuangyou.xianni.warfield.spawn.OverState(older));
		}
		this.revivalNode = revivalNode;
	}

	public SpwanNode getRevivalNode() {
		return revivalNode;
	}

	public void changeBornNode(SpwanNode bornNode) {
		SpwanNode older = this.bornNode;
		if (older != null) {
			older.stateTransition(new com.chuangyou.xianni.warfield.spawn.OverState(older));
		}
		this.bornNode = bornNode;
	}

	public SpwanNode getBornNode() {
		return bornNode;
	}

	/** 添加副本分组管理 */
	public void addTeamNode(SpwanNode teamNode) {
		int callerId = teamNode.getSpawnInfo().getParam2();//召唤阵id
		int teamId = teamNode.getSpawnInfo().getParam1();
		// 所属该召唤阵的所有刷怪点
		Map<Integer, List<SpwanNode>> callerOwns = teamNodes.get(callerId);
		if (callerOwns == null) {
			callerOwns = new HashMap<>();
			teamNodes.put(callerId, callerOwns);
		}
		List<SpwanNode> teamMembers = callerOwns.get(teamId);
		if (teamMembers == null) {
			teamMembers = new ArrayList<>();
			callerOwns.put(teamId, teamMembers);
		}
		teamMembers.add(teamNode);
	}

	/** 随机某组副本节点 */
	public List<SpwanNode> randomTeamNode(int tagId) {
		Map<Integer, List<SpwanNode>> callerOwns = teamNodes.get(tagId);
		if (callerOwns == null || callerOwns.size() == 0) {
			return null;
		}
		List<Integer> keys = new ArrayList<>();
		keys.addAll(callerOwns.keySet());
		if (keys.size() > 0) {
			return callerOwns.get(keys.get(random.next(keys.size())));
		}
		return null;
	}

	public Field getStarField() {
		return starField;
	}

	public int getIndexId() {
		return this.id;
	}

	public CampaignTemplateInfo getTemp() {
		return campaignTemplateInfo;
	}

	public boolean agreedToEnter(ArmyProxy army) {

		return state.getCode() == CampaignState.PREPARE || state.getCode() == CampaignState.OPENING;
	}

	public boolean isExpried() {
		return isEmpty() && expiredTime != 0 && System.currentTimeMillis() > expiredTime && state.getCode() != CampaignState.STOP;
	}

	public boolean isClear() {
		return state.getCode() == CampaignState.STOP && System.currentTimeMillis() > expiredTime;
	}

	public CampaignState getState() {
		return state;
	}

	public void setExpiredTime(long expiredTime) {
		this.expiredTime = expiredTime;
	}

}