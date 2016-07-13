package com.chuangyou.xianni.sql.dao;

import com.chuangyou.xianni.sql.dao.impl.BaseBufferTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.CampaignRecordInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.CampaignTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.DropConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.EmailDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FashionConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FashionInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FieldInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FriendDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.HeroSkillDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ItemInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ItemTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.LevelUpDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.LivingStatusTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MagicwpAttDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MagicwpBanInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MagicwpConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MagicwpInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MonsterInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MountConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MountEquipDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MountInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.MountSpecialInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.NpcInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.NpcShopConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.NpcShopDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetSkillInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetTotalAttDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerPositionInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.RoleConfigImplDao;
import com.chuangyou.xianni.sql.dao.impl.SkillActionMoveTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillActionTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillBufferTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillPropertyTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillStageDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillTempateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SpawnInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SystemConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TaskDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TaskTemplateImpl;
import com.chuangyou.xianni.sql.dao.impl.TemplateTestDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.UserDaoImpl;

public class DBManager {
	/**
	 * 测试DAO
	 */
	private static final TemplateTestDao	templateTestDao		= new TemplateTestDaoImpl();

	/**
	 * 邮件DAO
	 */
	private static final EmailDao			emailDao			= new EmailDaoImpl();
	/**
	 * 好友DAO
	 */
	private static final FriendDao			friendDao			= new FriendDaoImpl();
	/** npc shop */
	private static final NpcShopDao			npcShopDao			= new NpcShopDaoImpl();

	/** npc商店模板数据 */
	private static final NpcShopConfigDao	npcShopConfigDao	= new NpcShopConfigDaoImpl();
	/** 任务模板 */
	private static final TaskTemplateDao	taskTemplateDao		= new TaskTemplateImpl();
	/** 任务DB */
	private static final TaskDao			taskDao				= new TaskDaoImpl();

	public static FriendDao getFrienddao() {
		return friendDao;
	}

	public static EmailDao getEmaildao() {
		return emailDao;
	}

	public static TemplateTestDao getTemplateTestDao() {
		return templateTestDao;
	}

	/**
	 * 地图模板数据
	 */
	private static final FieldInfoDao fieldInfoDao = new FieldInfoDaoImpl();

	public static FieldInfoDao getFieldInfoDao() {
		return fieldInfoDao;
	}

	/**
	 * NPC模板数据
	 */
	private static final NpcInfoDao npcInfoDao = new NpcInfoDaoImpl();

	public static NpcInfoDao getNpcInfoDao() {
		return npcInfoDao;
	}

	/**
	 * 怪物模板数据
	 */
	private static final MonsterInfoDao monsterInfoDao = new MonsterInfoDaoImpl();

	public static MonsterInfoDao getMonsterInfoDao() {
		return monsterInfoDao;
	}

	/**
	 * 地图对象生成模板数据
	 */
	private static final SpawnInfoDao spawnInfoDao = new SpawnInfoDaoImpl();

	public static SpawnInfoDao getSpawnInfoDao() {
		return spawnInfoDao;
	}

	/**
	 * 角色信息
	 */
	private static final PlayerInfoDao playerInfoDao = new PlayerInfoDaoImpl();

	public static PlayerInfoDao getPlayerInfoDao() {
		return playerInfoDao;
	}

	/**
	 * 坐骑模板数据
	 */
	private static final MountConfigDao mountConfigDao = new MountConfigDaoImpl();

	public static MountConfigDao getMountConfigDao() {
		return mountConfigDao;
	}

	/**
	 * 坐骑信息数据
	 */
	private static final MountInfoDao mountInfoDao = new MountInfoDaoImpl();

	public static MountInfoDao getMountInfoDao() {
		return mountInfoDao;
	}

	/**
	 * 坐骑装备数据
	 */
	private static final MountEquipDao mountEquipDao = new MountEquipDaoImpl();

	public static MountEquipDao getMountEquipDao() {
		return mountEquipDao;
	}

	/**
	 * 已获得的特殊坐骑数据
	 */
	private static final MountSpecialInfoDao mountSpecialDao = new MountSpecialInfoDaoImpl();

	public static MountSpecialInfoDao getMountSpecialDao() {
		return mountSpecialDao;
	}

	/**
	 * 系统公用配置
	 */
	private static final SystemConfigDao systemConfigDao = new SystemConfigDaoImpl();

	public static SystemConfigDao getSystemConfigDao() {
		return systemConfigDao;
	}

	/**
	 * NPC商店
	 * 
	 * @return
	 */
	public static NpcShopDao getNpcshopdao() {
		return npcShopDao;
	}

	public static NpcShopConfigDao getNpcshopconfigdao() {
		return npcShopConfigDao;
	}

	/**
	 * 法宝模板配置表
	 */
	private static final MagicwpConfigDao magicwpConfigDao = new MagicwpConfigDaoImpl();

	public static MagicwpConfigDao getMagicwpConfigDao() {
		return magicwpConfigDao;
	}

	/**
	 * 玩家法宝总属性数据
	 */
	private static final MagicwpAttDao magicwpAttDao = new MagicwpAttDaoImpl();

	public static MagicwpAttDao getMagicwpAttDao() {
		return magicwpAttDao;
	}

	/**
	 * 玩家法宝数据
	 */
	private static final MagicwpInfoDao magicwpInfoDao = new MagicwpInfoDaoImpl();

	public static MagicwpInfoDao getMagicwpInfoDao() {
		return magicwpInfoDao;
	}

	/**
	 * 玩家法宝禁制数据
	 */
	private static final MagicwpBanInfoDao magicwpBanInfoDao = new MagicwpBanInfoDaoImpl();

	public static MagicwpBanInfoDao getMagicwpBanInfoDao() {
		return magicwpBanInfoDao;
	}

	/**
	 * 宠物系统配置表
	 */
	private static final PetConfigDao petConfigDao = new PetConfigDaoImpl();

	public static PetConfigDao getPetConfigDao() {
		return petConfigDao;
	}

	/**
	 * 宠物总表
	 */
	private static final PetTotalAttDao petAttDao = new PetTotalAttDaoImpl();

	public static PetTotalAttDao getPetAttDao() {
		return petAttDao;
	}

	/**
	 * 宠物信息表
	 */
	private static final PetInfoDao petInfoDao = new PetInfoDaoImpl();

	public static PetInfoDao getPetInfoDao() {
		return petInfoDao;
	}

	/**
	 * 宠物技能核算表
	 */
	private static final PetSkillInfoDao petSkillDao = new PetSkillInfoDaoImpl();

	public static PetSkillInfoDao getPetSkillDao() {
		return petSkillDao;
	}

	/**
	 * 用户物品
	 */
	private static final ItemInfoDao itemInfoDao = new ItemInfoDaoImpl();

	public static ItemInfoDao getItemInfoDao() {
		return itemInfoDao;
	}

	/**
	 * 物品模板
	 */
	private static final ItemTemplateInfoDao itemTemplateInfoDao = new ItemTemplateInfoDaoImpl();

	public static ItemTemplateInfoDao getItemTemplateInfoDao() {
		return itemTemplateInfoDao;
	}

	/**
	 * 用户
	 */
	private static final UserInfoDao userDao = new UserDaoImpl();

	public static UserInfoDao getUserDao() {
		return userDao;
	}

	/**
	 * 时装配置表
	 */
	private static final FashionConfigDao fashionConfigDao = new FashionConfigDaoImpl();

	public static FashionConfigDao getFashionConfigDao() {
		return fashionConfigDao;
	}

	/**
	 * 时装数据
	 */
	private static final FashionInfoDao fashionInfoDao = new FashionInfoDaoImpl();

	public static FashionInfoDao getFashionInfoDao() {
		return fashionInfoDao;
	}

	/**
	 * 属性模板
	 */
	private static final BaseBufferTemplateInfoDao baseBufferTemplateInfoDao = new BaseBufferTemplateInfoDaoImpl();

	public static BaseBufferTemplateInfoDao getBaseBufferTemplateInfoDao() {
		return baseBufferTemplateInfoDao;
	}

	/**
	 * 技能动作模板
	 */
	private static final SkillActionTemplateInfoDao skillActionTemplateInfoDao = new SkillActionTemplateInfoDaoImpl();

	public static SkillActionTemplateInfoDao getSkillActionTemplateInfoDao() {
		return skillActionTemplateInfoDao;
	}

	/**
	 * 技能动作位移模板
	 */
	private static final SkillActionMoveTemplateInfoDao skillActionMoveTemplateInfoDao = new SkillActionMoveTemplateInfoDaoImpl();

	public static SkillActionMoveTemplateInfoDao getSkillActionMoveTemplateInfoDao() {
		return skillActionMoveTemplateInfoDao;
	}

	/** 技能buffer模板 */
	private static final SkillBufferTemplateInfoDao skillBufferTemplateInfoDao = new SkillBufferTemplateInfoDaoImpl();

	public static SkillBufferTemplateInfoDao getSkillBufferTemplateInfoDao() {
		return skillBufferTemplateInfoDao;
	}

	/** 技能属性 */
	private static final SkillPropertyTemplateInfoDao skillPropertyTemplateInfoDao = new SkillPropertyTemplateInfoDaoImpl();

	public static SkillPropertyTemplateInfoDao getSkillPropertyTemplateInfoDao() {
		return skillPropertyTemplateInfoDao;
	}

	/** 角色配置 */
	private static final RoleConfigDao roleConfigDao = new RoleConfigImplDao();

	public static RoleConfigDao getroleConfigDao() {
		return roleConfigDao;
	}

	/** 技能阶段 */
	private static final SkillStageDao skillStageDao = new SkillStageDaoImpl();

	public static SkillStageDao getSkillStageDao() {
		return skillStageDao;
	}

	/** 基础技能模板 */
	private static final SkillTempateInfoDao skillTempateInfoDao = new SkillTempateInfoDaoImpl();

	public static SkillTempateInfoDao getSkillTempateInfoDao() {
		return skillTempateInfoDao;
	}

	/** 掉落规则配置 */
	private static final DropConfigDao dropConfigDao = new DropConfigDaoImpl();

	public static DropConfigDao getDropConfigDao() {
		return dropConfigDao;
	}

	/** 升级经验表 */
	private static final LevelUpDao levelUpDao = new LevelUpDaoImpl();

	public static LevelUpDao getLevelUpDao() {
		return levelUpDao;
	}

	/** 用户位置 */
	private static final PlayerPositionInfoDao playerPositionInfoDao = new PlayerPositionInfoDaoImpl();

	public static PlayerPositionInfoDao getPlayerPositionInfoDao() {
		return playerPositionInfoDao;
	}

	public static TemplateTestDao getTemplatetestdao() {
		return templateTestDao;
	}

	public static TaskTemplateDao getTasktemplatedao() {
		return taskTemplateDao;
	}

	public static TaskDao getTaskdao() {
		return taskDao;
	}

	/** 副本模板表 */
	private static final CampaignTemplateInfoDao campaignTemplateInfoDao = new CampaignTemplateInfoDaoImpl();

	public static CampaignTemplateInfoDao getCampaignTemplateInfoDao() {
		return campaignTemplateInfoDao;
	}

	/** 副本记录信息 */
	private static final CampaignRecordInfoDao campaignRecordInfoDao = new CampaignRecordInfoDaoImpl();

	public static CampaignRecordInfoDao getCampaignRecordInfoDao() {
		return campaignRecordInfoDao;
	}

	/** 英雄技能学习表 */
	private static final HeroSkillDao heroSkillDao = new HeroSkillDaoImpl();

	public static HeroSkillDao getHeroSkillDao() {
		return heroSkillDao;
	}

	/** living状态表 */
	private static final LivingStatusTemplateInfoDao livingStatusTemplateInfoDao = new LivingStatusTemplateInfoDaoImpl();

	public static LivingStatusTemplateInfoDao getLivingStatusTemplateInfoDao() {
		return livingStatusTemplateInfoDao;
	}

}