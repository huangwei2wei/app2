﻿package com.chuangyou.xianni.word;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import com.chuangyou.common.util.Log;
import com.chuangyou.common.util.TimeUtil;
import com.chuangyou.xianni.common.Vector3BuilderHelper;
import com.chuangyou.xianni.entity.Option;
import com.chuangyou.xianni.entity.field.FieldInfo;
import com.chuangyou.xianni.entity.player.PlayerInfo;
import com.chuangyou.xianni.entity.player.PlayerJoinInfo;
import com.chuangyou.xianni.entity.player.PlayerPositionInfo;
import com.chuangyou.xianni.entity.player.PlayerTimeInfo;
import com.chuangyou.xianni.exec.CmdTask;
import com.chuangyou.xianni.map.MapProxyManager;
import com.chuangyou.xianni.npcShop.manager.NpcShopServerManager;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.player.PlayerState;
import com.chuangyou.xianni.player.cmd.GamePlayerDisposeCmd;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.sql.dao.DBManager;
import com.chuangyou.xianni.team.reaction.ChangeLineAction;
import com.chuangyou.xianni.word.WorldMgr.Players.PlayerData;

public class WorldMgr {

	private static Players players;

	public static boolean init() {
		players = new Players();
		return true;
	}

	/**
	 * 获取一个玩家
	 * 
	 * @param playerId
	 * @return
	 */
	public static GamePlayer getPlayer(long playerId) {
		if (playerId <= 0) {
			Log.error("获取玩家数据不存在" + playerId);
			return null;
		}
		// 从内存中查找
		if (players.isExist(playerId)) {
			return (GamePlayer) players.getPlayer(playerId);
		}

		// 从数据库中加载玩家角色信息
		PlayerInfo playerInfo = DBManager.getPlayerInfoDao().getPlayerInfo(playerId);
		if (playerInfo == null) {
			Log.error("数据库中不存在 playerId : " + playerId);
			return null;
		}
		PlayerJoinInfo playerJoinInfo = DBManager.getPlayerInfoDao().getJoinInfo(playerId);
		PlayerTimeInfo playerTimeInfo = DBManager.getPlayerInfoDao().getTimeInfo(playerId);
		if (playerTimeInfo == null) {
			playerTimeInfo = new PlayerTimeInfo();
			playerTimeInfo.setPlayerId(playerInfo.getPlayerId());
			playerTimeInfo.setResetTime(new Date());
			playerTimeInfo.setSigleCampCount(0);
			playerTimeInfo.setOp(Option.Insert);
		}
		PlayerPositionInfo playerPositionInfo = DBManager.getPlayerPositionInfoDao().get(playerId);

		if (playerPositionInfo == null) {
			playerPositionInfo = new PlayerPositionInfo();
			playerPositionInfo.setPlayerId(playerId);
			FieldInfo fieldTemp = MapProxyManager.getFieldTempInfo(GamePlayer.BORN_MAP);
			playerPositionInfo.setMapId(GamePlayer.BORN_MAP);
			playerPositionInfo.setMapTempId(GamePlayer.BORN_MAP);
			playerPositionInfo.setX(Vector3BuilderHelper.build(fieldTemp.getPosition()).getX());
			playerPositionInfo.setY(Vector3BuilderHelper.build(fieldTemp.getPosition()).getY());
			playerPositionInfo.setZ(Vector3BuilderHelper.build(fieldTemp.getPosition()).getZ());
		}
		// 从数据库中加载共享信息
		GamePlayer player = new GamePlayer();
		if (!player.loadShareData(playerInfo, playerJoinInfo, playerTimeInfo, playerPositionInfo)) {
			Log.error("实例化玩家 playerId : " + playerId + " ShareData 失败，请检查数据库初始化");
			return null;
		}
		players.put(playerId, player);
		return player;
	}

	/**
	 * 缓存里面获取玩家数据
	 * 
	 * @param playerId
	 * @return
	 */
	public static GamePlayer getPlayerFromCache(Long playerId) {
		if (players.isExist(playerId)) {// 从内存中查找
			return (GamePlayer) players.getPlayer(playerId);
		}
		return null;
	}

	public static long getLastUpdateTime(GamePlayer player) {
		return players.getLastUpdateTime(player.getPlayerId());
	}

	/**
	 * 玩家是否存在1
	 * 
	 * @param playerId
	 * @return
	 */
	public static boolean isExist(long playerId) {
		return players.isExist(playerId);
	}

	/**
	 * 退出
	 * 
	 * @param userId
	 * @return
	 */
	public static boolean logout(GamePlayer player) {
		if (player == null || player.getPlayerState() != PlayerState.ONLINE) {
			return false;
		}
		player.setPlayerState(PlayerState.OFFLINE);


		ChangeLineAction action = new ChangeLineAction(player, null, false);
		action.getActionQueue().enqueue(action);

		try {
			player.save();
			player.unLoadPersonData();
		} catch (Exception ex) {
			Log.error("用户退出失败,nickName : " + player.getNickName() + ", state : " + player.getPlayerState(), ex);
		}
		return true;
	}

	/**
	 * 获取全部玩家
	 * 
	 * @return
	 */
	public static List<GamePlayer> getAllPlayers() {
		if (players != null) {
			return players.values();
		}
		return new ArrayList<GamePlayer>();
	}

	/**
	 * 获取在线的所有玩家
	 * 
	 * @return
	 */
	public static List<GamePlayer> getOnLinePlayers() {
		List<GamePlayer> list = new ArrayList<GamePlayer>();
		Iterator<GamePlayer> it = getAllPlayers().iterator();
		while (it.hasNext()) {
			GamePlayer player = it.next();
			if (player.getPlayerState() == PlayerState.ONLINE) {
				list.add(player);
			}
		}
		return list;
	}

	/**
	 * 定时保存
	 */
	public static void save() {
		saveUserData();
		saveSystemData();
	}

	/**
	 * <pre>
	 * 保存全服玩家数据
	 * </pre>
	 */
	private static void saveUserData() {
		if (players == null) {
			return;
		}
		List<PlayerData> playerList = players.datas();
		if (playerList == null || playerList.size() == 0) {
			return;
		}
		for (PlayerData playerData : playerList) {
			if (playerData == null) {
				continue;
			}
			String nickName = "";
			try {
				GamePlayer player = playerData.getPlayer();
				nickName = player.getNickName();
				player.save();
				if (playerData.isUnLoadData()) {
					disposePlayer(player);
				}
			} catch (Exception e) {
				Log.error("保存数据出错,nickname " + nickName, e);
			}
		}
	}

	/**
	 * 删除玩家
	 * 
	 * @param player
	 */
	public static void disposePlayer(GamePlayer player) {

		short code = (short) 0;
		PBMessage pkg = new PBMessage(code, player.getPlayerId());
		player.enqueue(new CmdTask(new GamePlayerDisposeCmd(), null, pkg, player.getCmdTaskQueue()));
	}

	/**
	 * 将玩家从队列中删除
	 * 
	 * @param player
	 */
	public static void unLoadPlayer(GamePlayer player) {
		players.remove(player.getPlayerId());
		player.save();
		player.unLoadShareData();
	}

	/**
	 * <pre>
	 * 保存全服系统数据(不涉及具体玩家)
	 * </pre>
	 */
	private static void saveSystemData() {
		NpcShopServerManager.save();
		// WorldBossMgr.save();
		// TowerMgr.save();
		// GuildWarMgr.save();
		// ConsortiaFamMgr.saveAll();
		// PetRankMgr.updateToDB();
		// AdditionMgr.save();
		// OpRecordMgr.save();
		// KingTowerCampaignMgr.saveAll();
		// LotteryMgr.save();
		// GodChallengeMgr.save();
		// MarriageMgr.save();
		// NotifyServicesMgr.save();
		// CastleGuildMgr.save();
		// CrossLeagueMgr.save();
		// PetIslandMgr.save();
	}

	static class Players {
		Hashtable<Long, PlayerData> context = new Hashtable<Long, PlayerData>();

		/**
		 * 获取一个玩家
		 * 
		 * @param playerId
		 * @return
		 */
		public GamePlayer getPlayer(long playerId) {
			if (!context.containsKey(playerId)) {
				return null;
			}
			PlayerData item = (PlayerData) context.get(playerId);
			item.setUpdateTime(TimeUtil.getSysCurSeconds());
			return item.getPlayer();
		}

		public long getLastUpdateTime(long playerId) {
			return 0;
		}

		/**
		 * 是否存在
		 * 
		 * @param playerId
		 * @return
		 */
		public boolean isExist(long playerId) {
			return context.containsKey(playerId);
		}

		/**
		 * 添加一个玩家
		 * 
		 * @param playerId
		 * @param player
		 */
		public void put(long playerId, GamePlayer player) {
			if (!context.containsKey(playerId)) {
				context.put(playerId, new PlayerData(player));
			}
		}

		/**
		 * 移除一个玩家
		 * 
		 * @param playerId
		 */
		public void remove(long playerId) {
			context.remove(playerId);
		}

		public void clear() {
			context.clear();
		}

		public List<GamePlayer> values() {
			List<GamePlayer> infos = new ArrayList<GamePlayer>();
			synchronized (context) {
				for (PlayerData info : context.values()) {
					if ((info == null) || (info.getPlayer() == null)) {
						continue;
					}
					infos.add(info.getPlayer());
				}
			}
			return infos;
		}

		public List<PlayerData> datas() {
			List<PlayerData> infos = new ArrayList<PlayerData>();
			synchronized (context) {
				infos.addAll(context.values());
			}
			return infos;
		}

		public long getLastUpdateTime(int playerId) {
			PlayerData data = context.get(playerId);
			if (data != null) {
				return data.getUpdateTime();
			}
			return 0;
		}

		public class PlayerData {
			private static final long	timeLong	= 900;	// 15分钟=900秒
			private long				createTime;
			private long				updateTime;
			private GamePlayer			player		= null;

			public PlayerData(GamePlayer player) {
				setCreateTime(TimeUtil.getSysCurSeconds());
				setUpdateTime(TimeUtil.getSysCurSeconds());
				this.setPlayer(player);
			}

			public boolean isUnLoadData() {
				if (player.getPlayerState() != PlayerState.ONLINE) {
					return TimeUtil.getSysCurSeconds() - updateTime > timeLong;
				}
				return false;
			}

			public void setCreateTime(long createTime) {
				this.createTime = createTime;
			}

			public long getCreateTime() {
				return createTime;
			}

			public void setUpdateTime(long updateTime) {
				this.updateTime = updateTime;
			}

			public long getUpdateTime() {
				return this.updateTime;
			}

			public void setPlayer(GamePlayer player) {
				this.player = player;
			}

			public GamePlayer getPlayer() {
				return player;
			}
		}
	}
}