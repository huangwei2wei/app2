package com.chuangyou.xianni.campaign.cmd;

import com.chuangyou.common.protobuf.pb.campaign.CampaignInfoMsgProto.CampaignInfoMsg;
import com.chuangyou.common.protobuf.pb.campaign.CampaignOptionMsgProto.CampaignOptionMsg;
import com.chuangyou.xianni.campaign.Campaign;
import com.chuangyou.xianni.campaign.CampaignMgr;
import com.chuangyou.xianni.common.ErrorCode;
import com.chuangyou.xianni.common.error.ErrorMsgUtil;
import com.chuangyou.xianni.constant.CampaignOptionType;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;
import com.chuangyou.xianni.world.AbstractCommand;
import com.chuangyou.xianni.world.ArmyProxy;

@Cmd(code = Protocol.S_CAMPAIGN_OPTION, desc = "副本操作")
public class CampaignOptionCmd extends AbstractCommand {

	@Override
	public void execute(ArmyProxy army, PBMessage packet) throws Exception {
		CampaignOptionMsg reqMsg = CampaignOptionMsg.parseFrom(packet.getBytes());
		int op = reqMsg.getOptionType();
		int parm1 = reqMsg.getParam1();

		// 请求副本信息
		if (op == CampaignOptionType.GET_INFO) {
			Campaign campaign = CampaignMgr.getCampagin(parm1);
			if (campaign != null) {
				campaign.sendCampaignInfo(army);
			} else {
				ErrorMsgUtil.sendErrorMsg(army, ErrorCode.CAMPAIGN_NOT_EXIST, Protocol.S_CAMPAIGN_OPTION, "");
			}
		}
		// 返回副本
		if (op == CampaignOptionType.JOIN) {
			Campaign campaign = CampaignMgr.getCampagin(parm1);
			if (campaign != null) {
				campaign.onPlayerEnter(army);
			}
		}

		// 离开副本
		if (op == CampaignOptionType.LEAVE) {
			Campaign campaign = CampaignMgr.getCampagin(parm1);
			if (campaign != null) {
				campaign.onPlayerLeave(army);
			}
		}
	}

}