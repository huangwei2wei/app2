package com.chuangyou.xianni.entity.state;

import com.chuangyou.xianni.entity.task.ITaskCfg;

public class StateConditionConfig implements ITaskCfg{

	private int id;
	private int targetType;
	private int targetId;
	private int targetId1;
	private int targetNum;
	private int targetTrigger;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTargetType() {
		return targetType;
	}
	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	public int getTargetNum() {
		return targetNum;
	}
	public void setTargetNum(int targetNum) {
		this.targetNum = targetNum;
	}
	public int getTargetId1() {
		return targetId1;
	}
	public void setTargetId1(int targetId1) {
		this.targetId1 = targetId1;
	}
	
	@Override
	public byte getTaskTarget() {
		// TODO Auto-generated method stub
		return (byte) targetType;
	}
	public int getTargetTrigger() {
		return targetTrigger;
	}
	public void setTargetTrigger(int targetTrigger) {
		this.targetTrigger = targetTrigger;
	}
	
	
	
	
}
