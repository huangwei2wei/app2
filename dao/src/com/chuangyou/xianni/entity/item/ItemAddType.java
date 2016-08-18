package com.chuangyou.xianni.entity.item;

/**
 * <pre>
 * 物品添加类型
 * </pre>
 */
public interface ItemAddType {
	/** 测试添加*/
	public static final short	TEST_ADD	= 1999;

	/** 叠加增加 */
	public static final short	OVERLAY		= 2001;

	/** 拆分新增 */
	public static final short	SPILTCREATE	= 2002;
	/**
	 * 邮件添加物品到背包
	 */
	public static final short   EMAIL_ADD   = 2003;
	
	/** npc商店加物品 */
	public static final short   NPC_SHOP_ADD = 2004;
	
	
	/**
	 *  任务获得物品
	 */
	public static final short   TASK_ADD = 2005;
	
	/**
	 * 拾取掉落物
	 */
	public static final short	DROP_PICKUP = 2006;
	
	/** 脚本获得物品  */
	public static final short   SCRIPT_ADD = 2007;
	/**
	 * 空间获得
	 */
	public static final short   SPACE_ADD = 2008;
	
	/**
	 * 装备分解获得
	 */
	public static final short	EQUIP_RESOLVE = 2009;
	
	/**
	 * 魂幡
	 */
	public static final short  SOUL = 2010;
}
