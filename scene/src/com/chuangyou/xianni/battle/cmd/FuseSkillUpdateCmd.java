package com.chuangyou.xianni.battle.cmd;

import com.chuangyou.common.protobuf.pb.soul.FuseSkillProto.FuseSkillMsg;
import com.chuangyou.xianni.battle.skill.FuseSkillVo;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;
import com.chuangyou.xianni.world.AbstractCommand;
import com.chuangyou.xianni.world.ArmyProxy;

@Cmd(code=Protocol.S_REQ_SOUL_FUSESKILL_UPDATE,desc="同步融合技能")
public class FuseSkillUpdateCmd extends AbstractCommand {

	@Override
	public void execute(ArmyProxy army, PBMessage packet) throws Exception {
		// TODO Auto-generated method stub
		FuseSkillMsg req = FuseSkillMsg.parseFrom(packet.getBytes());
		int index = req.getIndex();
		int skillId = req.getFuseSkillId();
		if(index == 1){
			if(skillId>0){
				army.getPlayer().setFuseSkill1(new FuseSkillVo(skillId, req.getColor()));
			}else{
				army.getPlayer().setFuseSkill1(null);
			}
		}
		
		if(index == 2){
			if(skillId>0){
				army.getPlayer().setFuseSkill2(new FuseSkillVo(skillId, req.getColor()));
			}else{
				army.getPlayer().setFuseSkill2(null);
			}
		}
		
		if(index == 3){
			if(skillId>0){
				army.getPlayer().setFuseSkill3(new FuseSkillVo(skillId, req.getColor()));
			}else{
				army.getPlayer().setFuseSkill3(null);
			}
		}
		
		if(index == 4){
			if(skillId>0){
				army.getPlayer().setFuseSkill4(new FuseSkillVo(skillId, req.getColor()));
			}else{
				army.getPlayer().setFuseSkill4(null);
			}
		}
		
	}

}
