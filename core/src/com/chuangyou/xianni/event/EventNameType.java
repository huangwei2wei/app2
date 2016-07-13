package com.chuangyou.xianni.event;

public interface EventNameType {
	/**金币改变*
	public static final int	MONEY_CHANGE			= 1;
	/**所有属性变更*/ 
	public static final int	UPDATE_PLAYER_PROPERTY_ALL	= 2;
	
	/** 更新场景可见属性（需要广播给周围玩家） */
	public static final int UPDATE_PLAYER_PROPERTY_SCENE = 4;
	
	/** 玩家属性变更 */
	public static final int UPDATE_PLAYER_PROPERTY = 5;
	
	/**
	 * 杀怪任务
	 */
	public static final int TASK_KILL_MONSTER   = 6;
	/**  采集任务   */
	public static final int TASK_PATCH    = 7;
	/**  通关副本   */
	public static final int TASK_PASS_FB = 8;
	/**  物品改变 添加  */
	public static final int TASK_ITEM_CHANGE_ADD = 9;
	/** npc对话 */
	public static final int TASK_NPC_DIALOG = 10;
	/**  物品改变  减少 */
	public static final int TASK_ITEM_CHANGE_REDUCE = 11;
	/** QTE操作完成   */
	public static final int TASK_QTE   = 12;
	/** 触发性任务事件   */
	public static final int TASK_TRIGGER = 13;
	/** 天珠系统 */
	public static final int TASK_T_SYSTEM = 14;
	
	/** 添加组员  */
	public static final int TEAM_ADD_MEMBER = 14;
	/** 移出组员   */
	public static final int TEAM_REMOVE_MEMBER = 15;
	/** 队伍满  */
	public static final int TEAM_IS_FULL  = 16;
	/** 队伍已空  */
	public static final int TEAM_IS_EMPTY = 17;
	/** 队长改变  */
	public static final int TEAM_LEADER_CHANGE = 18;
	/** 队伍都离线 */
	public static final int TEAM_IS_ALLOFFLINE = 19;
	/** 队员在线与离线状态发生改变   */
	public static final int TEAM_CHNAGE_ONLINE = 20;
	
}