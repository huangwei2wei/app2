package com.chuangyou.xianni.chat.manager.action;

import java.util.List;

import com.chuangyou.common.protobuf.pb.chat.ChatReceiveProto.ChatReceiveMsg;
import com.chuangyou.common.protobuf.pb.chat.ChatSendProto.ChatSendMsg;
import com.chuangyou.xianni.chat.manager.ChatManager;
import com.chuangyou.xianni.constant.ChatConstant;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.BroadcastUtil;
import com.chuangyou.xianni.protocol.Protocol;

public class ChatWorldAction extends ChatBaseAction {

	@Override
	public boolean sendChatMsg(GamePlayer sender, ChatSendMsg sendMsg) {
		// TODO Auto-generated method stub
		if(this.checkCd(sender, sendMsg, true) == false){
			return false;
		}
		ChatReceiveMsg msg = this.buildReceiveProto(sender, sendMsg);
		BroadcastUtil.sendBroadcasePacketToAll(Protocol.U_CHAT_RECEIVE, msg);
		
		//添加到聊天记录
		ChatManager.addWorldHistory(msg);
		return true;
	}
	
	@Override
	public List<Long> getReceivers(GamePlayer sender, ChatSendMsg sendMsg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int getCoolingTime() {
		// TODO Auto-generated method stub
		return ChatConstant.CoolingTime.WORLD;
	}
}