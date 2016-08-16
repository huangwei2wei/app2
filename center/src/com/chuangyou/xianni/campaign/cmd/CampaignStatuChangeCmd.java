package com.chuangyou.xianni.campaign.cmd;

import com.chuangyou.common.protobuf.pb.campaign.CampaignStatuMsgProto.CampaignStatuMsg;
import com.chuangyou.xianni.base.AbstractCommand;
import com.chuangyou.xianni.constant.CampaignConstant.CampaignStatu;
import com.chuangyou.xianni.event.EventNameType;
import com.chuangyou.xianni.event.ObjectEvent;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;
import com.chuangyou.xianni.team.TeamMgr;
import com.chuangyou.xianni.team.struct.Team;

@Cmd(code = Protocol.C_CAMPAIGN_STATU, desc = "sence服务器进入副本结果")
public class CampaignStatuChangeCmd extends AbstractCommand {
	@Override
	public void execute(GamePlayer player, PBMessage packet) throws Exception {
		CampaignStatuMsg smsg = CampaignStatuMsg.parseFrom(packet.getBytes());
		// 进入
		if (smsg.getStatu() == CampaignStatu.NOTITY2C_IN) {
			player.setCurCampaign(smsg.getIndexId());
		}
		// 只退出
		if (smsg.getStatu() == CampaignStatu.NOTITY2C_OUT) {
			player.setCurCampaign(0);
		}

		// 通关副本
		if (smsg.getStatu() == CampaignStatu.NOTITY2C_SUCCESS) {
			passCampaign(player, smsg.getTempId());
			billingTask(player, smsg.getTempId(), smsg.getTaskId());
		}

		// // 成功退出或者失败退出
		if (smsg.getStatu() == CampaignStatu.NOTITY2C_OUT_FAIL || smsg.getStatu() == CampaignStatu.NOTITY2C_OUT_SUCCESS) {
			player.setCurCampaign(0);
			teamCampaignOver(smsg.getTeamId());
		}
	}

	/** 通关副本事件 */
	private void passCampaign(GamePlayer player, int campaignId) {
		player.notifyListeners(new ObjectEvent(this, campaignId, EventNameType.TASK_PASS_FB));
	}

	/** 组队副本结束 */
	private void teamCampaignOver(int teamId) {
		if (teamId != 0) {
			Team team = TeamMgr.getTeam(teamId);
			if (team != null) {
				team.changeTeamStatu(Team.NORMAL);
			}
		}
	}

	private void billingTask(GamePlayer player, int campaignId, int taskId) {
		if (player.getCampaignInventory() != null) {
			player.getCampaignInventory().billingTask(campaignId, taskId);
		}
	}
}
