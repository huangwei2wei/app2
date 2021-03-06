package com.chuangyou.xianni.battleMode.manager;

import com.chuangyou.common.protobuf.pb.battle.ResBattleModeMsgProto.ResBattleModeMsg;
import com.chuangyou.xianni.common.ErrorCode;
import com.chuangyou.xianni.common.error.ErrorMsgUtil;
import com.chuangyou.xianni.common.template.SystemConfigTemplateMgr;
import com.chuangyou.xianni.constant.BattleModeCode;
import com.chuangyou.xianni.entity.Option;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;

/**
 * 战斗模式
 *
 */
public class BattleModeManager {

	// private static final int peaceBattleMode = 1;// 和平模式
	// private static final int warBattleMode = 2;// 战争模式
	// private static final int sectsBattleMode = 3;// 门派模式
	// private static final int white = 0;// 白
	// private static final int yellow = 1;// 黄
	// private static final int red = 2;// 红

	/**
	 * 变更战斗模式
	 * 
	 * @param player
	 * @param battleMode
	 * @return
	 */
	public static boolean changeBattleMode(GamePlayer player, int battleMode, short protocolCode) {
		int nowBattleMode = player.getBasePlayer().getPlayerInfo().getBattleMode();
		long changeBattleModeTime = player.getBasePlayer().getPlayerInfo().getChangeBattleModeTime();
		int playerLv = player.getBasePlayer().getPlayerInfo().getLevel();
		int pkVal = player.getBasePlayer().getPlayerInfo().getPkVal();
		int openLv = SystemConfigTemplateMgr.getIntValue("pk.openLv");
		if (playerLv < openLv) {
			ErrorMsgUtil.sendErrorMsg(player, ErrorCode.CHANGE_BATTLE, protocolCode);
			return false;
		}
		if (nowBattleMode == battleMode) {
			ErrorMsgUtil.sendErrorMsg(player, ErrorCode.CHANGE_BATTLE1, protocolCode);
//			System.out.println("------nowBattleMode :" + nowBattleMode + " battleMode: " + battleMode);
			return false;
		}

		if (getColour(pkVal) > BattleModeCode.white) {// 白名以上不能切换
			ErrorMsgUtil.sendErrorMsg(player, ErrorCode.CHANGE_BATTLE1, protocolCode);
//			System.out.println("-----pkVal: " + pkVal);
			return false;
		}
		if (battleMode == BattleModeCode.peaceBattleMode) {// 需要判断CD时间
			if (System.currentTimeMillis() - changeBattleModeTime < 5 * 1000) {// cd 时间未过，不能切换
//				System.out.println("-----changeBattleModeTime: " + changeBattleModeTime);
				ErrorMsgUtil.sendErrorMsg(player, ErrorCode.CHANGE_BATTLE2, protocolCode);
				return false;
			}
			player.getBasePlayer().getPlayerInfo().setChangeBattleModeTime(System.currentTimeMillis());
		}

		player.getBasePlayer().getPlayerInfo().setBattleMode(battleMode);
		player.getBasePlayer().getPlayerInfo().setOp(Option.Update);

		// 同步场景服务器
		ResBattleModeMsg.Builder res = ResBattleModeMsg.newBuilder();
		res.setBattleMode(battleMode);
		PBMessage p = MessageUtil.buildMessage(Protocol.S_BATTLE_MODE, res);
		player.sendPbMessage(p);
		return true;
	}

	/**
	 * 获取颜色级别
	 * 
	 * @param val
	 * @return
	 */
	public static int getColour(int val) {
		int minRed = SystemConfigTemplateMgr.getIntValue("pk.colour.minRed");
		int minYellow = SystemConfigTemplateMgr.getIntValue("pk.colour.minYellow");

		if (val >= minRed) {
			return BattleModeCode.red;
		} else if (val >= minYellow) {
			return BattleModeCode.yellow;
		}
		return BattleModeCode.white;
	}
}
