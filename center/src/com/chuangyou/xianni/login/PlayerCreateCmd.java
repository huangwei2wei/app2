package com.chuangyou.xianni.login;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chuangyou.common.protobuf.pb.PlayerCreateInnerProto.PlayerCreateInnerMsg;
import com.chuangyou.common.protobuf.pb.PlayerCreateResultInnerProto.PlayerCreateResultInnerMsg;
import com.chuangyou.common.protobuf.pb.PlayerInfoListMsgProto.PlayerInfoListMsg;
import com.chuangyou.common.protobuf.pb.PlayerInfoMsgProto.PlayerInfoMsg;
import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.common.ErrorCode;
import com.chuangyou.xianni.common.template.SystemConfigTemplateMgr;
import com.chuangyou.xianni.entity.field.FieldInfo;
import com.chuangyou.xianni.entity.hero.HeroSkill;
import com.chuangyou.xianni.entity.player.PlayerInfo;
import com.chuangyou.xianni.entity.player.PlayerJoinInfo;
import com.chuangyou.xianni.entity.player.PlayerPositionInfo;
import com.chuangyou.xianni.entity.player.PlayerTimeInfo;
import com.chuangyou.xianni.entity.property.BaseProperty;
import com.chuangyou.xianni.entity.role.RoleConfig;
import com.chuangyou.xianni.entity.skill.SkillTempateInfo;
import com.chuangyou.xianni.entity_id.EntityIdBuilder;
import com.chuangyou.xianni.login.template.RoleConfigMgr;
import com.chuangyou.xianni.map.MapProxyManager;
import com.chuangyou.xianni.player.NickNameCheckResult;
import com.chuangyou.xianni.player.manager.PlayerManager;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.skill.template.SkillTempMgr;
import com.chuangyou.xianni.socket.Cmd;
import com.chuangyou.xianni.socket.Command;
import com.chuangyou.xianni.sql.dao.DBManager;

import io.netty.channel.Channel;

@Cmd(code = Protocol.C_PLAYER_CREATE, desc = "创建角色")
public class PlayerCreateCmd implements Command {
	@Override
	public void execute(Channel channel, PBMessage packet) throws Exception {
		// TODO Auto-generated method stub
		PlayerCreateInnerMsg req = PlayerCreateInnerMsg.parseFrom(packet.getBytes());

		List<PlayerInfo> playerInfos = DBManager.getPlayerInfoDao().getByUserId(req.getUserId());

		int result = ErrorCode.SUCCESS;

		if (playerInfos != null && playerInfos.size() > 0) {
			Log.error("当前只能创建一个角色，用户已有角色！");
			result = ErrorCode.ROLE_IS_ALREADY_EXISTS;
		}

		// 名字合法性
		short nameCheckResult = PlayerManager.nickNameCheck(req.getNickName());
		if (nameCheckResult > 0) {
			switch (nameCheckResult) {
				case NickNameCheckResult.LENGTH_LIMIT:
					result = ErrorCode.PLAYERNAME_LENGTH_LIMIT;
					break;
				case NickNameCheckResult.ILLEGAL_CHARACTER:
					result = ErrorCode.PLAYERNAME_ILLEGAL_CHARACTER;
					break;
				case NickNameCheckResult.NAME_EXIST:
					Log.error("角色名重复!");
					result = ErrorCode.PLAYERNAME_IS_ALREADY_EXISTS;
					break;
			}
		}

		PlayerInfo playerInfo = null;
		if (result == ErrorCode.SUCCESS) {
			RoleConfig roleConfig = RoleConfigMgr.getRoleConfig(req.getRoleConfigId());
			if (roleConfig == null) {
				Log.error("缺少角色配置!id：" + req.getRoleConfigId());
				result = ErrorCode.UNKNOW_ERROR;
			}
			// RoleConfig roleConfig = roleConfigMgr.getRoleConfig(1);
			playerInfo = new PlayerInfo();
			playerInfo.setPlayerId(EntityIdBuilder.playerIdBuilder());
			playerInfo.setUserId(req.getUserId());
			playerInfo.setJob(req.getRoleConfigId());
			playerInfo.setNickName(req.getNickName());
			playerInfo.setLevel(1);
			playerInfo.setExp(0);
			playerInfo.setTotalExp(0);
			playerInfo.setMoney(0);
			playerInfo.setBindCash(0);
			playerInfo.setCash(0);
			playerInfo.setRepair(0);
			playerInfo.setVipLevel((short) 0);
			playerInfo.setSkinId(roleConfig.getModelId());
			playerInfo.setpBagCount(0);
			int initMountId = 0;
//			Map<Integer, MountGradeCfg> gradeCfgMap = MountTemplateMgr.getGradeTemps();
//			for (MountGradeCfg grade : gradeCfgMap.values()) {
//				if (grade.getGrade() == 1) {
//					initMountId = grade.getId();
//					break;
//				}
//			}
			playerInfo.setMountId(initMountId);
			playerInfo.setMagicWeaponId(0);
			playerInfo.setFashionId(0);
			playerInfo.setWeaponId(0);
			playerInfo.setWingId(0);
			playerInfo.setSkillStage(0);
			playerInfo.setRepair(0);
			playerInfo.setBattleMode(1);
			playerInfo.setPkVal(0);
			playerInfo.setChangeBattleModeTime(0);
			playerInfo.setCreateTime(new Date());

			// if (req.getRoleConfigId() == 1) {
			// playerInfo.setWeaponId(2110001);
			// } else if (req.getRoleConfigId() == 2) {
			//
			// } else if (req.getRoleConfigId() == 3) {
			// playerInfo.setWeaponId(2110004);
			// }

			PlayerJoinInfo playerJoinInfo = new PlayerJoinInfo();
			playerJoinInfo.setPlayerId(playerInfo.getPlayerId());

			BaseProperty initProperty = PlayerManager.getPlayerBaseProperty(1);
			playerJoinInfo.setCurSoul(initProperty.getSoul());
			playerJoinInfo.setCurBlood(initProperty.getBlood());
			playerJoinInfo.setSoul(initProperty.getSoul());
			playerJoinInfo.setBlood(initProperty.getBlood());
			playerJoinInfo.setAttack(0);
			playerJoinInfo.setDefence(0);
			playerJoinInfo.setSoulAttack(0);
			playerJoinInfo.setSoulDefence(0);
			playerJoinInfo.setAccurate(0);
			playerJoinInfo.setDodge(0);
			playerJoinInfo.setCrit(0);
			playerJoinInfo.setCritDefence(0);
			playerJoinInfo.setCritAddtion(0);
			playerJoinInfo.setCritCut(0);
			playerJoinInfo.setAttackAddtion(0);
			playerJoinInfo.setAttackCut(0);
			playerJoinInfo.setSoulAttackAddtion(0);
			playerJoinInfo.setSoulAttackCut(0);
			playerJoinInfo.setRegainSoul(initProperty.getRegainSoul());
			playerJoinInfo.setRegainBlood(initProperty.getRegainBlood());
			playerJoinInfo.setMetal(0);
			playerJoinInfo.setWood(0);
			playerJoinInfo.setWater(0);
			playerJoinInfo.setFire(0);
			playerJoinInfo.setEarth(0);
			playerJoinInfo.setMetalDefence(0);
			playerJoinInfo.setWoodDefence(0);
			playerJoinInfo.setWaterDefence(0);
			playerJoinInfo.setFireDefence(0);
			playerJoinInfo.setEarthDefence(0);
			playerJoinInfo.setSpeed(0);

			PlayerTimeInfo playerTimeInfo = new PlayerTimeInfo();
			playerTimeInfo.setPlayerId(playerInfo.getPlayerId());
			playerTimeInfo.setSigleCampCount(0);
			playerTimeInfo.setChallengeCampCount(0);
			playerTimeInfo.setResetTime(new Date());
			playerTimeInfo.setOfflineTime(new Date());
			// playerTimeInfo.setBeadRefreshId(InverseBeadInventory.spawnId+"");
			// playerTimeInfo.setCurrRefreshId(InverseBeadInventory.spawnId);

			PlayerPositionInfo playerPositionInfo = new PlayerPositionInfo();
			playerPositionInfo.setPlayerId(playerInfo.getPlayerId());
			FieldInfo fieldTemp = MapProxyManager.getFieldTempInfo(SystemConfigTemplateMgr.getInitBorn());
			playerPositionInfo.setMapId(fieldTemp.getMapKey());
			playerPositionInfo.setMapTempId(fieldTemp.getMapKey());
			playerPositionInfo.setX(0);
			playerPositionInfo.setY(0);
			playerPositionInfo.setZ(0);

			if (!DBManager.getPlayerInfoDao().add(playerInfo)) {
				Log.error("创建角色tb_u_player_info未知错误");
				result = ErrorCode.UNKNOW_ERROR;
			}
			if (result == ErrorCode.SUCCESS && !DBManager.getPlayerInfoDao().addJoinInfo(playerJoinInfo)) {
				Log.error("创建角色tb_u_player_join_info未知错误");
				result = ErrorCode.UNKNOW_ERROR;
			}
			if (result == ErrorCode.SUCCESS && !DBManager.getPlayerInfoDao().addTimeInfo(playerTimeInfo)) {
				Log.error("创建角色tb_u_player_time_info未知错误");
				result = ErrorCode.UNKNOW_ERROR;
			}
			if (result == ErrorCode.SUCCESS && !DBManager.getPlayerPositionInfoDao().save(playerPositionInfo)) {
				Log.error("创建角色tb_u_playerPositionInfo未知错误");
				result = ErrorCode.UNKNOW_ERROR;
			}
			// 为英雄发技能
			String str = roleConfig.getSkill();
			String[] strSkillId = str.split(",");
			for (String strId : strSkillId) {
				int skillId = Integer.valueOf(strId);
				SkillTempateInfo skillInfo = SkillTempMgr.getSkillTemp(skillId);// 技能配置
				if (skillInfo == null)
					continue;
				HeroSkill heroSkill = new HeroSkill();
				heroSkill.setPlayerId(playerInfo.getPlayerId());
				heroSkill.setSkillId(skillId);
				heroSkill.setType(skillInfo.getMasterType());
				heroSkill.setSubType(skillInfo.getSonType());
				heroSkill.setGrandsonType(skillInfo.getGrandsonType());
				heroSkill.setSkillLV(skillInfo.getLevel());
				if (result == ErrorCode.SUCCESS && !DBManager.getHeroSkillDao().add(heroSkill)) {
					Log.error("创建角色tb_u_hero_skill_info未知错误");
					result = ErrorCode.UNKNOW_ERROR;
				}
			}

		}

		PlayerCreateResultInnerMsg.Builder msg = PlayerCreateResultInnerMsg.newBuilder();
		msg.setUserId(req.getUserId());
		msg.setResultCode(result);
		if (result == ErrorCode.SUCCESS) {
			playerInfos = new ArrayList<>();
			playerInfos.add(playerInfo);

			PlayerInfoListMsg.Builder plistMsg = PlayerInfoListMsg.newBuilder();
			if (playerInfos != null && playerInfos.size() != 0) {
				for (PlayerInfo pinfo : playerInfos) {
					PlayerInfoMsg.Builder pmsg = PlayerInfoMsg.newBuilder();
					pinfo.writeProto(pmsg, SystemConfigTemplateMgr.getIntValue("bag.initGridNum"));
					plistMsg.addPlayers(pmsg.build());
				}
			}
			msg.setPlayers(plistMsg);
		}
		PBMessage p = MessageUtil.buildMessage(Protocol.G_PLAYER_CREATE_RESULT, msg);
		channel.writeAndFlush(p);
	}

}
