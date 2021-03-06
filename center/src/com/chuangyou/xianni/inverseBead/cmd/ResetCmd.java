package com.chuangyou.xianni.inverseBead.cmd;

import com.chuangyou.common.protobuf.pb.inverseBead.ReqInverseBeadResetMsgProto.ReqInverseBeadResetMsg;
import com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg;
import com.chuangyou.xianni.base.AbstractCommand;
import com.chuangyou.xianni.inverseBead.manager.InverseBeadManager;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;

@Cmd(code = Protocol.C_RESET_INVERSE_MONSTER, desc = "重置天逆珠秘境")
public class ResetCmd extends AbstractCommand {
	@Override
	public void execute(GamePlayer player, PBMessage packet) throws Exception {
		ReqInverseBeadResetMsg msg = ReqInverseBeadResetMsg.parseFrom(packet.getBytes());
		boolean res = InverseBeadManager.reset(player, packet.getCode());
		if (res == true) {
			ResInverseBeadResetMsg.Builder okMsg = ResInverseBeadResetMsg.newBuilder();
			okMsg.setResetTime(System.currentTimeMillis());
			okMsg.setMonsterNum(1);
			PBMessage p = MessageUtil.buildMessage(Protocol.U_RESET_INVERSE_MONSTER, okMsg);
			player.sendPbMessage(p);
		}
	}
}
