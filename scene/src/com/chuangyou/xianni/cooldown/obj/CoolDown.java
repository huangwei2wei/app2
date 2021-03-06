package com.chuangyou.xianni.cooldown.obj;

import com.chuangyou.xianni.pool.MemoryObject;

public class CoolDown implements MemoryObject {
	//冷却类型
	private String type;
	//关键字
	private String key;
	//开始时间
	private long start;
	//持续时间
	private long delay;
	//结束时间
	protected long endTime;
	//剩余时间
	protected long remainTime;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public long getStart() {
		return start;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public long getDelay() {
		return delay;
	}
	
	public void setDelay(long delay) {
		this.delay = delay;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * 获取结束时间
	 * @return
	 */
	public long getEndTime(){
		return start+delay;
	}
	/**
	 * 获取剩余时间 
	 * @return
	 */
	public long getRemainTime(){
		return getEndTime()-System.currentTimeMillis();
	}
	
	@Override
	public void release() {
		this.setKey(null);
		this.setType(null);
		this.setStart(0);
		this.setDelay(0);
	}
}
