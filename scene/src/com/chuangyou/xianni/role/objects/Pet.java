package com.chuangyou.xianni.role.objects;

import java.util.ArrayList;
import java.util.List;

import com.chuangyou.common.protobuf.pb.PlayerAttSnapProto.PlayerAttSnapMsg;
import com.chuangyou.common.protobuf.pb.army.PetInfoProto.PetInfoMsg;
import com.chuangyou.common.protobuf.pb.army.PropertyMsgProto.PropertyMsg;
import com.chuangyou.common.protobuf.pb.battle.BattleLivingInfoMsgProto.BattleLivingInfoMsg;
import com.chuangyou.common.protobuf.pb.battle.BattleLivingInfoMsgProto.BattleLivingInfoMsg.Builder;
import com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg;
import com.chuangyou.common.util.Vector3;
import com.chuangyou.xianni.battle.buffer.Buffer;
import com.chuangyou.xianni.battle.skill.Skill;
import com.chuangyou.xianni.common.Vector3BuilderHelper;
import com.chuangyou.xianni.constant.EnumAttr;
import com.chuangyou.xianni.constant.RoleConstants;
import com.chuangyou.xianni.entity.pet.PetInfoCfg;
import com.chuangyou.xianni.pet.template.PetTemplateMgr;

public class Pet extends ActiveLiving {

	private int	petSoul;
	private int	petPhysique;
	private int	petQuality;

	public Pet(long playerId, long id) {
		super(playerId, id);
		this.setType(RoleConstants.RoleType.pet);
	}

	public void readPetInfo(PetInfoMsg pet) {
		setSkin(pet.getPetTempId());
		setPetSoul(pet.getPetSoul());
		setPetPhysique(pet.getPetPhysique());
		setPetQuality(pet.getPetQuality());
		List<PropertyMsg> attList = new ArrayList<>(pet.getPetPropertyList());
		readProperty(attList);
	}

	/**
	 * 获取详情
	 */
	@Override
	public Builder getBattlePlayerInfoMsg() {
		// TODO Auto-generated method stub
		BattleLivingInfoMsg.Builder cachBattleInfoPacket = BattleLivingInfoMsg.newBuilder();
		cachBattleInfoPacket.setLivingId(getId());
		cachBattleInfoPacket.setPlayerId(getArmyId());
		cachBattleInfoPacket.setType(getType());
		cachBattleInfoPacket.setSkinId(getSkin());

		if (getPostion() != null) {
			cachBattleInfoPacket.setPostion(Vector3BuilderHelper.build(getPostion()));
		} else {
			cachBattleInfoPacket.setPostion(Vector3BuilderHelper.build(Vector3.Invalid));
		}
		cachBattleInfoPacket.setTarget(Vector3BuilderHelper.build(getTargetPostion()));

		List<Buffer> toalBuffer = new ArrayList<>();
		for (List<Buffer> pBuffers : permanentBuffer.values()) {
			toalBuffer.addAll(pBuffers);
		}
		for (List<Buffer> wBuffers : workBuffers.values()) {
			toalBuffer.addAll(wBuffers);
		}
		for (Buffer buffer : toalBuffer) {
			BufferMsg.Builder bufferMsg = BufferMsg.newBuilder();
			buffer.writeProto(bufferMsg);
			cachBattleInfoPacket.addBufferList(bufferMsg);
		}

		for (Skill skill : drivingSkills.values()) {
			cachBattleInfoPacket.addSkills(skill.getSkillId());
		}

		PropertyMsg.Builder pmsg = PropertyMsg.newBuilder();
		pmsg.setType(EnumAttr.PetSoul.getValue());
		pmsg.setTotalPoint(getPetSoul());
		cachBattleInfoPacket.addPropertis(pmsg);

		pmsg = PropertyMsg.newBuilder();
		pmsg.setType(EnumAttr.PetPhysique.getValue());
		pmsg.setTotalPoint(getPetPhysique());
		cachBattleInfoPacket.addPropertis(pmsg);

		pmsg = PropertyMsg.newBuilder();
		pmsg.setType(EnumAttr.PetQuality.getValue());
		pmsg.setTotalPoint(getPetQuality());
		cachBattleInfoPacket.addPropertis(pmsg);

		return cachBattleInfoPacket;
	}

	/**
	 * 获取场景对象的快照信息
	 * 
	 * @return
	 */
	@Override
	public PlayerAttSnapMsg.Builder getAttSnapMsg() {
		PlayerAttSnapMsg.Builder cacheAttSnapPacker = PlayerAttSnapMsg.newBuilder();
		cacheAttSnapPacker.setPlayerId(id);
		cacheAttSnapPacker.setType(getType());
		cacheAttSnapPacker.setSkinId(getSkin());
		cacheAttSnapPacker.setPostion(Vector3BuilderHelper.build(getPostion()));
		cacheAttSnapPacker.setTarget(Vector3BuilderHelper.build(getTargetPostion()));
		cacheAttSnapPacker.setOwnerId(getArmyId());
		return cacheAttSnapPacker;
	}

	public int getPetSoul() {
		return petSoul;
	}

	public void setPetSoul(int petSoul) {
		this.petSoul = petSoul;
	}

	public int getPetPhysique() {
		return petPhysique;
	}

	public void setPetPhysique(int petPhysique) {
		this.petPhysique = petPhysique;
	}

	public int getPetQuality() {
		return petQuality;
	}

	public void setPetQuality(int petQuality) {
		this.petQuality = petQuality;
	}
	
	public PetInfoCfg getPetTemplate(){
		if(PetTemplateMgr.getPetTemps() == null){
			return null;
		}
		return PetTemplateMgr.getPetTemps().get(skin);
	}
	
	@Override
	public void setSkin(int skin) {
		// TODO Auto-generated method stub
		super.setSkin(skin);
		
//		if(this.drivingSkills != null){
//			this.drivingSkills.clear();
//		}
//		this.drivingSkills = new HashMap<>();
//		PetInfoCfg petTemp = PetTemplateMgr.getPetTemps().get(skin);
//		if(petTemp != null){
//			Set<Integer> skills = petTemp.getSkillSet();
//			for(int skillId: skills){
//				SkillTempateInfo skillTempateInfo = BattleTempMgr.getBSkillInfo(skillId);
//				if (skillTempateInfo == null) {
//					return;
//				}
//				SkillActionTemplateInfo actionTemp = BattleTempMgr.getActionInfo(skillTempateInfo.getActionId());
//				if (actionTemp == null) {
//					return;
//				}
//				Skill petSkill = new Skill(actionTemp);
//				petSkill.setSkillTempateInfo(skillTempateInfo);
//				this.addSkill(petSkill);
//			}
//		}
	}
	
	@Override
	public synchronized boolean isDie() {
		// TODO Auto-generated method stub
		return false;
	}
}
