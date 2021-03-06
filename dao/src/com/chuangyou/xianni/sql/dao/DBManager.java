package com.chuangyou.xianni.sql.dao;

import com.chuangyou.xianni.sql.dao.impl.ActiveDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ActivityDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AiConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ArenaInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ArtifactConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ArtifactInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AvatarCorrespondTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AvatarInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AvatarStarTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AvatarTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.AvatarUpGradeTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.BaseBufferTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.CampaignRecordInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.CampaignTaskTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.CampaignTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ChatPrivateOfflineMsgDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.DropConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.EmailDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.EquipBarInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.EquipConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FashionConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FashionInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FieldBossConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FieldBossInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FieldInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.FriendDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildApplyDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildHistoryDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildLogInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildMemberDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildSkillDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.GuildWarehouseItemDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.HeroSkillDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.InverseBeadMonsterDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.InverseBeadRefreshDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.InverseBeadTemDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ItemInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ItemTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.JobInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.LevelUpDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.LimitlessCampaignRecordInfoDaoImpl;
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
import com.chuangyou.xianni.sql.dao.impl.NoticeConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.NpcInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetSkillInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PetTotalAttDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerInverseBeadDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerPositionInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.PlayerVipReceiveImplDao;
import com.chuangyou.xianni.sql.dao.impl.PropertyFightingTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.RankDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.RelationInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.RewardTemplateDaoImp;
import com.chuangyou.xianni.sql.dao.impl.RobotTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.RoleConfigImplDao;
import com.chuangyou.xianni.sql.dao.impl.ShopConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.ShopDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillActionMoveTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillActionTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillBufferTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillPropertyTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillStageDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SkillTempateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SnareTemplateInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SoulDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SpaceDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SpawnInfoDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.StateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.SystemConfigDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TaskDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TaskTemplateImpl;
import com.chuangyou.xianni.sql.dao.impl.TeamTargetTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TemplateTestDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.TruckDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.UserDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.VipBagTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.VipLevelTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.VipTemDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.WelfareConditionRecordDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.WelfareConditionTemplateDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.WelfareDaoImpl;
import com.chuangyou.xianni.sql.dao.impl.WelfareTemplateDaoImpl;

public class DBManager {
	/**
	 * 测试DAO
	 */

	private static final TemplateTestDao	templateTestDao	= new TemplateTestDaoImpl();

	/**
	 * 邮件DAO
	 */

	private static final EmailDao			emailDao		= new EmailDaoImpl();

	/**
	 * 好友DAO
	 */
	private static final FriendDao			friendDao		= new FriendDaoImpl();

	/** shop */
	private static final ShopDao			shopDao			= new ShopDaoImpl();

	/** 商店模板数据 */

	private static final ShopConfigDao		shopConfigDao	= new ShopConfigDaoImpl();

	/** 任务模板 */

	private static final TaskTemplateDao	taskTemplateDao	= new TaskTemplateImpl();

	/** 任务DB */

	private static final TaskDao			taskDao			= new TaskDaoImpl();

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
	 * ai 配置数据
	 */
	private static final AiConfigDao aiConfigDao = new AiConfigDaoImpl();

	public static AiConfigDao getAiConfigDao() {
		return aiConfigDao;
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
	 * 商店
	 * 
	 * @return
	 */
	public static ShopDao getShopDao() {
		return shopDao;
	}

	public static ShopConfigDao getShopConfigDao() {
		return shopConfigDao;
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

	/** 天逆珠 ***/
	private static final InverseBeadTemDao inverseBeadTemDao = new InverseBeadTemDaoImpl();

	public static InverseBeadTemDao getInversebeadtemdao() {
		return inverseBeadTemDao;
	}

	/** 天逆珠刷怪 ***/
	private static final InverseBeadMonsterTemDao InverseBeadMonsterTemDao = new InverseBeadMonsterDaoImpl();

	public static InverseBeadMonsterTemDao getInverseBeadMonsterTemDao() {
		return InverseBeadMonsterTemDao;
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

	/** 天逆珠升级数据 ***/
	private static final PlayerInverseBeadDao playerInverseBeadDao = new PlayerInverseBeadDaoImpl();

	public static PlayerInverseBeadDao getPlayerInverseBeadDao() {
		return playerInverseBeadDao;
	}

	/** 天逆珠刷新数据 ***/
	private static final PlayerBeadRefreshTimeDao playerBeadRefreshTime = new InverseBeadRefreshDaoImpl();

	public static PlayerBeadRefreshTimeDao getPlayerBeadRefreshTimeDao() {
		return playerBeadRefreshTime;
	}

	/** 个人vip 领取数据 ***/
	private static final PlayerVipReceiveImplDao PLAYER_VIP_RECEIVE_IMPL_DAO = new PlayerVipReceiveImplDao();

	public static PlayerVipReceiveImplDao getPlayerVipReceiveImplDao() {
		return PLAYER_VIP_RECEIVE_IMPL_DAO;
	}

	/** living状态表 */
	private static final LivingStatusTemplateInfoDao livingStatusTemplateInfoDao = new LivingStatusTemplateInfoDaoImpl();

	public static LivingStatusTemplateInfoDao getLivingStatusTemplateInfoDao() {
		return livingStatusTemplateInfoDao;
	}

	/** 属性，战斗力对应表 */
	private static final PropertyFightingTemplateDao propertyFightingTemplateDao = new PropertyFightingTemplateDaoImpl();

	public static PropertyFightingTemplateDao getPropertyFightingTemplateDao() {
		return propertyFightingTemplateDao;
	}

	/** 组队目标表 */
	private static final TeamTargetTemplateDao teamTargetTemplateDao = new TeamTargetTemplateDaoImpl();

	public static TeamTargetTemplateDao getTeamTargetTemplateDao() {
		return teamTargetTemplateDao;
	}

	/**
	 * 私聊离线消息
	 */
	private static final ChatPrivateOfflineMsgDao chatPrivateOfflineMsgDao = new ChatPrivateOfflineMsgDaoImpl();

	public static ChatPrivateOfflineMsgDao getChatPrivateOfflineMsgDao() {
		return chatPrivateOfflineMsgDao;
	}

	/**
	 * 空间
	 */
	private static final SpaceDao spaceDao = new SpaceDaoImpl();

	public static SpaceDao getSpaceDao() {
		return spaceDao;
	}

	/**
	 * 副本任务模板
	 */
	private static final CampaignTaskTemplateInfoDao campaignTaskTemplateInfoDao = new CampaignTaskTemplateInfoDaoImpl();

	public static CampaignTaskTemplateInfoDao getCampaignTaskTemplateInfoDao() {
		return campaignTaskTemplateInfoDao;
	}

	/**
	 * vip 模板数据
	 */
	private static final VipTemplateDao vipTemplateDao = new VipTemDaoImpl();

	public static VipTemplateDao getVipTemplateDao() {
		return vipTemplateDao;
	}

	/**
	 * vip 等级模板
	 */
	private static final VipLevelTemplateDao vipLevelTemplateDao = new VipLevelTemplateDaoImpl();

	public static VipLevelTemplateDao getVipLevelTemplateDao() {
		return vipLevelTemplateDao;
	}

	/**
	 * vip 礼包模板
	 */
	private static final VipBagTemplateDao vipBagTemplateDao = new VipBagTemplateDaoImpl();

	public static VipBagTemplateDao getVipBagTemplateDao() {
		return vipBagTemplateDao;
	}

	/**
	 * 装备模板数据
	 */
	private static final EquipConfigDao equipConfigDao = new EquipConfigDaoImpl();

	public static EquipConfigDao getEquipConfigDao() {
		return equipConfigDao;
	}

	/**
	 * 装备栏信息数据
	 */
	private static final EquipBarInfoDao equipBarInfoDao = new EquipBarInfoDaoImpl();

	public static EquipBarInfoDao getEquipBarInfoDao() {
		return equipBarInfoDao;
	}

	/**
	 * 玩家关系数据
	 */
	private static final RelationInfoDao relationInfoDao = new RelationInfoDaoImpl();

	public static RelationInfoDao getRelationInfoDao() {
		return relationInfoDao;
	}

	/**
	 * 魂幡
	 */
	private static final SoulDao soulDao = new SoulDaoImpl();

	public static SoulDao getSoulDao() {
		return soulDao;
	}

	/**
	 * 副本记录
	 */
	private static final LimitlessCampaignRecordInfoDao limitlessCampaignRecordInfoDao = new LimitlessCampaignRecordInfoDaoImpl();

	public static LimitlessCampaignRecordInfoDao getLimitlessCampaignRecordInfoDao() {
		return limitlessCampaignRecordInfoDao;
	}

	/**
	 * 陷阱模板
	 */
	private static final SnareTemplateInfoDao snareTemplateInfoDao = new SnareTemplateInfoDaoImpl();

	public static SnareTemplateInfoDao getSnareTemplateInfoDao() {
		return snareTemplateInfoDao;
	}

	/**
	 * 神器模板
	 */
	private static final ArtifactConfigDao artifactConfigDao = new ArtifactConfigDaoImpl();

	public static ArtifactConfigDao getArtifactConfigDao() {
		return artifactConfigDao;
	}

	/**
	 * 神器数据
	 */
	private static final ArtifactInfoDao artifactInfoDao = new ArtifactInfoDaoImpl();

	public static ArtifactInfoDao getArtifactInfoDao() {
		return artifactInfoDao;
	}

	/** 作业 */
	private static final JobInfoDao jobInfoDao = new JobInfoDaoImpl();

	public static JobInfoDao getJobInfoDao() {
		return jobInfoDao;
	}

	/** 机器人 */
	private static final RobotTemplateDao robotTemplateDao = new RobotTemplateDaoImpl();

	public static RobotTemplateDao getRobotTemplateDao() {
		return robotTemplateDao;
	}

	/** 分身默契模板表 */
	private static final AvatarCorrespondTemplateInfoDao avatarCorrespondTemplateInfoDao = new AvatarCorrespondTemplateInfoDaoImpl();

	public static AvatarCorrespondTemplateInfoDao getAvatarCorrespondTemplateInfoDao() {
		return avatarCorrespondTemplateInfoDao;
	}

	/** 分身升星模板表 */
	private static final AvatarStarTemplateDao avatarStarTemplateDao = new AvatarStarTemplateDaoImpl();

	public static AvatarStarTemplateDao getAvatarStarTemplateDao() {
		return avatarStarTemplateDao;
	}

	/** 分身模板表 */
	private static final AvatarTemplateInfoDao avatarTemplateInfoDao = new AvatarTemplateInfoDaoImpl();

	public static AvatarTemplateInfoDao getAvatarTemplateInfoDao() {
		return avatarTemplateInfoDao;
	}

	/** 分身升级模板表 */
	private static final AvatarUpGradeTemplateDao avatarUpGradeTemplateDao = new AvatarUpGradeTemplateDaoImpl();

	public static AvatarUpGradeTemplateDao getAvatarUpGradeTemplateDao() {
		return avatarUpGradeTemplateDao;
	}

	/** 分身信息表 */
	private static final AvatarInfoDao avatarInfoDao = new AvatarInfoDaoImpl();

	public static AvatarInfoDao getAvatarInfoDao() {
		return avatarInfoDao;
	}

	/** 奖励模板 */
	private static final RewardTemplateDao rewardTemplateDao = new RewardTemplateDaoImp();

	public static RewardTemplateDao getRewardTemplateDao() {
		return rewardTemplateDao;
	}

	/** 挑战信息 */
	private static final ArenaInfoDao arenaInfoDao = new ArenaInfoDaoImpl();

	public static ArenaInfoDao getArenaInfoDao() {
		return arenaInfoDao;
	}

	/** 活动 */
	private static final ActivityDao activityDao = new ActivityDaoImpl();

	public static ActivityDao getActivityDao() {
		return activityDao;
	}

	/**
	 * 排行榜
	 */
	private static final RankDao rankDao = new RankDaoImpl();

	public static RankDao getRankDao() {
		return rankDao;
	}

	/**
	 * 境界
	 */
	private static final StateDao stateDao = new StateDaoImpl();

	public static StateDao getStateDao() {
		return stateDao;
	}

	/**
	 * 运镖
	 */
	private static final TruckDao truckDao = new TruckDaoImpl();

	public static TruckDao getTruckDao() {
		return truckDao;
	}

	/**
	 * 门派配置
	 */
	private static final GuildConfigDao guildConfigDao = new GuildConfigDaoImpl();

	public static GuildConfigDao getGuildConfigDao() {
		return guildConfigDao;
	}

	/**
	 * 门派信息
	 */
	private static final GuildInfoDao guildInfoDao = new GuildInfoDaoImpl();

	public static GuildInfoDao getGuildInfoDao() {
		return guildInfoDao;
	}

	/**
	 * 门派成员
	 */
	private static final GuildMemberDao guildMemberDao = new GuildMemberDaoImpl();

	public static GuildMemberDao getGuildMemberDao() {
		return guildMemberDao;
	}

	/**
	 * 门派邀请表
	 */
	private static final GuildApplyDao guildApplyDao = new GuildApplyDaoImpl();

	public static GuildApplyDao getGuildApplyDao() {
		return guildApplyDao;
	}

	/**
	 * 玩家上次所在帮派的信息
	 */
	private static final GuildHistoryDao guildHistoryDao = new GuildHistoryDaoImpl();

	public static GuildHistoryDao getGuildHistoryDao() {
		return guildHistoryDao;
	}

	/**
	 * 门派技能表
	 */
	private static final GuildSkillDao guildSkillDao = new GuildSkillDaoImpl();

	public static GuildSkillDao getGuildSkillDao() {
		return guildSkillDao;
	}

	/**
	 * 帮派仓库表
	 */
	private static final GuildWarehouseItemDao guildWarehouseDao = new GuildWarehouseItemDaoImpl();

	public static GuildWarehouseItemDao getGuildWarehouseDao() {
		return guildWarehouseDao;
	}

	/**
	 * 帮派日志
	 */
	public static final GuildLogInfoDao guildLogDao = new GuildLogInfoDaoImpl();

	public static GuildLogInfoDao getGuildLogDao() {
		return guildLogDao;
	}

	/**
	 * 野外BOSS模板配置
	 */
	public static final FieldBossConfigDao fieldBossConfigDao = new FieldBossConfigDaoImpl();

	public static FieldBossConfigDao getFieldBossConfigDao() {
		return fieldBossConfigDao;
	}

	/**
	 * 野外BOSS死亡时间信息
	 */
	public static final FieldBossInfoDao fieldBossInfoDao = new FieldBossInfoDaoImpl();

	public static FieldBossInfoDao getFieldBossInfoDao() {
		return fieldBossInfoDao;
	}
	
	
	/**
	 * 活跃系统
	 */
	public static final ActiveDao activeDao = new ActiveDaoImpl();
	
	public static ActiveDao getActiveDao(){
		return activeDao;
	}

	/**
	 * 福利信息
	 */
	private static final WelfareDao welfareDao = new WelfareDaoImpl();

	public static WelfareDao getWelfaredao() {
		return welfareDao;
	}

	/**
	 * 福利模板配置
	 */
	private static final WelfareTemplateDao welfareTemplateDao = new WelfareTemplateDaoImpl();

	public static WelfareTemplateDao getWelfareTemplateDao() {
		return welfareTemplateDao;
	}
	
	/**
	 * 公告模板表
	 */
	public static final NoticeConfigDao noticeConfigDao = new NoticeConfigDaoImpl();
	
	public static NoticeConfigDao getNoticeConfigDao(){
		return noticeConfigDao;
	}
	
	/**
	 * 福利条件配置
	 */
	private static final WelfareConditionTemplateDao WELFARE_CONDITION_TEMPLATE_DAO = new WelfareConditionTemplateDaoImpl();
	public static WelfareConditionTemplateDao getWelfareConditionTemplateDao() {
		return WELFARE_CONDITION_TEMPLATE_DAO;
	}
	
	/**
	 * 7天登录礼包
	 */
	private static final WelfareConditionRecordDao WELFARE_CONDITION_RECORD_DAO = new WelfareConditionRecordDaoImpl();

	public static WelfareConditionRecordDao getWelfareConditionRecordDao() {
		return WELFARE_CONDITION_RECORD_DAO;
	}
	
}
