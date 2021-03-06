package com.chuangyou.xianni.warfield.field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.ai2.proxy.FieldPolling;
import com.chuangyou.xianni.constant.RoleConstants.RoleType;
import com.chuangyou.xianni.drop.helper.NotifyDropHalper;
import com.chuangyou.xianni.drop.objects.DropPackage;
import com.chuangyou.xianni.entity.field.FieldInfo;
import com.chuangyou.xianni.exec.AbstractActionQueue;
import com.chuangyou.xianni.exec.ThreadManager;
import com.chuangyou.xianni.proto.BroadcastUtil;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.role.objects.Living;
import com.chuangyou.xianni.role.objects.Player;
import com.chuangyou.xianni.role.objects.Robot;
import com.chuangyou.xianni.warfield.FieldMgr;
import com.chuangyou.xianni.warfield.grid.Grid;
import com.chuangyou.xianni.warfield.helper.FieldConstants.BattleType;
import com.chuangyou.xianni.warfield.helper.FieldConstants.FieldAttackRule;
import com.chuangyou.xianni.warfield.helper.NotifyNearHelper;
import com.chuangyou.xianni.warfield.helper.selectors.PlayerSelectorHelper;
import com.chuangyou.xianni.warfield.navi.seeker.NavmeshSeeker;
import com.chuangyou.xianni.warfield.spawn.SpwanNode;
import com.chuangyou.xianni.warfield.template.FieldTemplateMgr;
import com.chuangyou.xianni.world.HeartbeatWorldMgr;

/**
 * 地图基类
 * 
 * @author wkghost
 *
 */
public class Field extends AbstractActionQueue {
	public static final int								MAX_ID		= 10000;
	/**
	 * 地图生成后的唯一ID
	 */
	public int											id;

	/**
	 * Map对应的资源key
	 */
	protected int										mapKey;

	/**
	 * 格子
	 */
	protected Grid										grid;

	/**
	 * 
	 */
	protected NavmeshSeeker								seeker;

	/**
	 * 地图模型信息
	 */
	protected FieldInfo									fieldInfo;

	/**
	 * 轮循自调度，每个地图都有，副本销毁时必须清理
	 */
	protected FieldPolling								pollingAction;

	/**
	 * 存在的对象
	 */
	protected ConcurrentHashMap<Long, Living>			livings		= new ConcurrentHashMap<Long, Living>();

	// /**
	// * 接触触发的点
	// */
	// protected Map<Integer, TouchPoint> touchPoints = new HashMap<Integer,
	// TouchPoint>();

	/**
	 * 场景里的掉落物
	 */
	protected ConcurrentHashMap<Integer, DropPackage>	dropItems	= new ConcurrentHashMap<Integer, DropPackage>();

	/** 所属副本ID(唯一ID) */
	protected int										campaignId;

	/** 所有地图节点 */
	protected Map<Integer, SpwanNode>					spwanNodes	= new HashMap<Integer, SpwanNode>();

	/** 死亡living */
	protected List<Living>								deathLiving	= new ArrayList<>();

	public Field() {
		// TODO Auto-generated constructor stub
		super(ThreadManager.actionExecutor);
		pollingAction = new FieldPolling(this);
		HeartbeatWorldMgr.addFieldPolling(pollingAction);
	}

	/**
	 * 进入地图
	 * 
	 * @param l
	 */
	public void enterField(Living l) {
		// System.out.println("playerId :" + l.getArmyId() + " index = " +
		// l.getGridIndex() + " fieldId :" + this.getMapKey() + " mapId:" +
		// this.id);
		if (livings.containsKey(l.getId())) {
			Living old = livings.get(l.getId());
			Log.error("OldLiving :" + old.toString() + "   newLiving:" + l.toString());
		}
		// 退出之前的场景
		if (l.getField() != null) {
			l.getField().leaveField(l);
		}
		// System.out.println("enterfeild = " + l.getId());
		livings.put(l.getId(), l);
		grid.addLiving(l);
		l.enterField(this);

		// 通知附近的玩家进入
		Set<Long> nears = l.getNears(new PlayerSelectorHelper(l));

		if (nears != null && nears.size() > 0) {
			BroadcastUtil.sendBroadcastPacket(nears, Protocol.U_RESP_ATT_SNAP, l.getAttSnapMsg().build());
		}
	}

	/**
	 * 离开地图
	 * 
	 * @param l
	 */
	public void leaveField(Living l) {
		leaveField(l, true);
		// //如果是玩家，判断是否有宠物，并移除宠物
		// if(l.getType() == RoleType.player){
		// ArmyProxy army = WorldMgr.getArmy(l.getArmyId());
		// if(army != null){
		// if(army.getPet() != null && army.getPet().getField() != null){
		// if(this.getLiving(army.getPet().getId()) != null)
		// leaveField(army.getPet(), true);
		// }
		// }
		// }
	}

	public void leaveField(Living l, boolean notifyClient) {
		// System.out.println("leaveField = " + l.getId());
		if (livings.remove(l.getId()) != null) {
			grid.removeRole(l);
		}
		// 通知附近玩家，自己离开
		if (notifyClient) {
			Set<Long> nears = l.getNears(new PlayerSelectorHelper(l));
			nears.add(l.getArmyId());
			if (nears != null && nears.size() > 0) {
				NotifyNearHelper.notifyLeaveGrid(l, nears);
			}
		}
		l.leaveField();
	}

	public int getMapKey() {
		return mapKey;
	}

	public void setMapKey(int mapKey) {
		this.mapKey = mapKey;
		fieldInfo = FieldTemplateMgr.fieldTemps.get(mapKey);
		if (FieldMgr.getIns().GetBound(fieldInfo.getResName().toLowerCase()) == null) {
			Log.error("------地图资源找不到------地图资源找不到-----" + fieldInfo.getResName());
		}
		grid = new Grid(FieldMgr.getIns().GetBound(fieldInfo.getResName().toLowerCase()));
		seeker = FieldMgr.getIns().GetSeekerTemp(fieldInfo.getResName()).clone();
	}

	/**
	 * 获取地图配置信息
	 * 
	 * @return
	 */
	public FieldInfo getFieldInfo() {
		return fieldInfo;
	}

	/**
	 * 获取Seeker
	 * 
	 * @return
	 */
	public NavmeshSeeker getSeeker() {
		return seeker;
	}

	public Grid getGrid() {
		return grid;
	}

	public Living getLiving(long id) {
		if (livings.containsKey(id)) {
			return livings.get(id);
		}
		return null;
	}

	/**
	 * 是否地图强制可以攻击，该判断优先级高于玩家的pk模式 返回true时，直接判定可以攻击，返回false时才判断pk模式
	 * 
	 * @param player
	 * @param target
	 * @return
	 */
	public int getAttackRule(Player player, Living target) {
		if (fieldInfo.getBattleType() == BattleType.ARENA) {
			return FieldAttackRule.ATTACK;
		}
		if (fieldInfo.getBattleType() == BattleType.FIGHT) {
			return FieldAttackRule.USEPLAYERMODE;
		}
		if (player == null || target == null) {
			return FieldAttackRule.UNATTACK;
		}
		if (player.getTeamId() != 0 && player.getTeamId() == target.getTeamId()) {// 队友
			return FieldAttackRule.UNATTACK;
		}
		if (fieldInfo.getBattleType() == BattleType.GUILD) {
			if (player.getSimpleInfo() != null || target.getSimpleInfo() != null) {
				if (player.getSimpleInfo().getGuildId() != 0 && player.getSimpleInfo().getGuildId() == target.getSimpleInfo().getGuildId()) {
					return FieldAttackRule.UNATTACK;
				}
			}
			return FieldAttackRule.ATTACK;
		}
		return FieldAttackRule.UNATTACK;
	}

	/**
	 * 是否地图强制可以攻击，该判断优先级高于玩家的pk模式 返回true时，直接判定可以攻击，返回false时才判断pk模式
	 * 
	 * @param robot
	 * @param target
	 * @return
	 */
	public int getRobotAttackRule(Robot robot, Living target) {
		if (fieldInfo.getBattleType() == BattleType.ARENA) {
			return FieldAttackRule.ATTACK;
		}
		if (fieldInfo.getBattleType() == BattleType.FIGHT) {
			return FieldAttackRule.USEPLAYERMODE;
		}
		if (robot == null || target == null) {
			return FieldAttackRule.UNATTACK;
		}
		if (robot.getTeamId() != 0 && robot.getTeamId() == target.getTeamId()) {// 队友
			return FieldAttackRule.UNATTACK;
		}
		if (fieldInfo.getBattleType() == BattleType.GUILD) {
			if (robot.getSimpleInfo() != null || target.getSimpleInfo() != null) {
				if (robot.getSimpleInfo().getGuildId() != 0 && robot.getSimpleInfo().getGuildId() == target.getSimpleInfo().getGuildId()) {
					return FieldAttackRule.UNATTACK;
				}
			}
			return FieldAttackRule.ATTACK;
		}
		return FieldAttackRule.UNATTACK;
	}

	// /**
	// * 触发点
	// *
	// * @param tp
	// */
	// public void addTouchPoint(TouchPoint tp) {
	// touchPoints.put(tp.getPointId(), tp);
	// }
	//
	// /**
	// * 获取触发点
	// *
	// * @param pointId
	// * @return
	// */
	// public TouchPoint getTouchPoint(int pointId) {
	// return touchPoints.get(pointId);
	// }

	/**
	 * 掉落物
	 * 
	 * @param drop
	 */
	public void addDrop(DropPackage drop) {
		synchronized (dropItems) {
			dropItems.put(drop.getDropId(), drop);
			NotifyDropHalper.notifyAddDropPackage(drop);
		}
	}

	/**
	 * 获取掉落包
	 * 
	 * @param packageId
	 * @return
	 */
	public DropPackage getDrop(int packageId) {
		DropPackage drop = dropItems.get(packageId);
		// if((new Date()).getTime() - drop.getDropTime() > 5*60*1000){
		// dropItems.remove(packageId);
		// NotifyDropHalper.notifyRemoveDropPackage(this, drop);
		// return null;
		// }
		return drop;
	}

	public void removeDrop(int packageId) {
		synchronized (dropItems) {
			DropPackage drop = dropItems.remove(packageId);
			NotifyDropHalper.notifyRemoveDropPackage(this, drop);
		}
	}

	/**
	 * 删除掉落物品
	 * 
	 * @param packageId
	 * @param dropItemId
	 */
	public void removeDrop(int packageId, long dropItemId) {
		synchronized (dropItems) {
			DropPackage drop = dropItems.get(packageId);
			drop.getDropItems().remove(dropItemId);
			NotifyDropHalper.notifyRemoveDropItem(this, packageId, dropItemId);
			if (drop.getDropItems().size() <= 0) {
				dropItems.remove(packageId);
			}
		}
	}

	public Map<Integer, DropPackage> getDropItems() {
		return dropItems;
	}

	/**
	 * 获取所有单位活体单位
	 * 
	 * @param selector
	 * @return
	 */
	public List<Long> getLivings() {
		List<Long> ret = new ArrayList<>();

		Iterator<Entry<Long, Living>> it = this.livings.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Long, Living> entry = it.next();
			if (entry.getValue().getType() != RoleType.player) {
				continue;
			}
			ret.add(entry.getKey());
		}
		return ret;
	}

	/**
	 * 获取所有怪物
	 * 
	 * @return
	 */
	public List<Living> getMonsters() {
		List<Living> ret = new ArrayList<>();
		Iterator<Entry<Long, Living>> it = this.livings.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Long, Living> entry = it.next();
			if (entry.getValue().getType() == RoleType.monster) {
				ret.add(entry.getValue());
			}
		}
		return ret;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public void addSpawnNode(SpwanNode node) {
		spwanNodes.put(node.getSpwanId(), node);
	}

	public void removeSpawnNode(SpwanNode node) {
		spwanNodes.remove(node.getSpwanId());
	}

	public SpwanNode getSpawnNode(int spwanId) {
		return spwanNodes.get(spwanId);
	}

	public Map<Integer, SpwanNode> getSpawnNodes() {
		return spwanNodes;
	}

	/**
	 * 销毁地图
	 */
	public void destroy() {
		this.spwanNodes.clear();
		FieldMgr.getIns().clear(id);
		for (Living l : livings.values()) {
			if (l.getType() != RoleType.player) {
				l.destory();
			}
		}
		HeartbeatWorldMgr.removeFieldPolling(pollingAction);
		this.livings.clear();
		this.deathLiving.clear();
	}

	public void addDeathLiving(Living living) {
		deathLiving.add(living);
	}

	public List<Living> getDeathLiving() {
		List<Living> cloner = new ArrayList<>();
		synchronized (deathLiving) {
			cloner.addAll(deathLiving);
		}
		return cloner;
	}

	public void removeDeath(Living l) {
		synchronized (deathLiving) {
			deathLiving.remove(l);
		}
	}
}
