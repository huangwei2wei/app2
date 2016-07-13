package com.chuangyou.xianni.campaign.action;

import com.chuangyou.common.protobuf.pb.campaign.CampaignResponeMsgProto.CampaignResponeMsg;
import com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg;
import com.chuangyou.xianni.campaign.CampaignTempMgr;
import com.chuangyou.xianni.constant.CampaignRspCode;
import com.chuangyou.xianni.entity.campaign.CampaignTemplateInfo;
import com.chuangyou.xianni.exec.Action;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;

public class CreateCampaignAction extends Action {
	GamePlayer			player;
	CreateCampaignMsg	cmsg;
	static final int	count	= 3;

	public CreateCampaignAction(GamePlayer player, CreateCampaignMsg cmsg) {
		super(player.getActionQueue());
		this.player = player;
		this.cmsg = cmsg;
	}

	@Override
	public void execute() {
		CampaignTemplateInfo temp = CampaignTempMgr.getTempInfo(cmsg.getCampaign());
		int rspCode = CampaignRspCode.SUCCESS;
		if (temp == null) {
			rspCode = CampaignRspCode.TEMP_NOT_EXISTS;
		}

		// 等级次数等等判断
		if (player.getCampaignCount() >= count) {
			rspCode = CampaignRspCode.COUNT_LESS;
		}
		if (rspCode != CampaignRspCode.SUCCESS) {
			CampaignResponeMsg.Builder rsp = CampaignResponeMsg.newBuilder();
			rsp.setRspCode(rspCode);
			PBMessage pbMessage = MessageUtil.buildMessage(Protocol.U_CAMPAIGN_RESP, rsp);
			player.sendPbMessage(pbMessage);
			return;
		}

		// 通知scence服务器，用户请求创建副本
		PBMessage c2s = MessageUtil.buildMessage(Protocol.S_CREATE_CAMPAIGN, cmsg);
		player.sendPbMessage(c2s);
	}

}