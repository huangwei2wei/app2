package com.chuangyou.xianni.relation.cmd;

import com.chuangyou.xianni.base.AbstractCommand;
import com.chuangyou.xianni.constant.PlayerRelationConstant;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;

@Cmd(code = Protocol.C_REQ_GETFRIENDS, desc = "获取玩家的好友")
public class GetFriendsCmd extends AbstractCommand {

	@Override
	public void execute(GamePlayer player, PBMessage packet) throws Exception {
		// TODO Auto-generated method stub

		if(player.getRelationInventory() == null) return;
		
		player.getRelationInventory().sendRelationList(PlayerRelationConstant.FRIEND);
	}

}
