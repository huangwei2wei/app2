package com.chuangyou.xianni.bag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg;
import com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg;
import com.chuangyou.common.util.LockData;
import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.common.ErrorCode;
import com.chuangyou.xianni.common.error.ErrorMsgUtil;
import com.chuangyou.xianni.entity.equip.EquipBarGradeCfg;
import com.chuangyou.xianni.entity.equip.EquipBarInfo;
import com.chuangyou.xianni.entity.equip.EquipSuitCfg;
import com.chuangyou.xianni.entity.item.BindType;
import com.chuangyou.xianni.entity.item.ItemInfo;
import com.chuangyou.xianni.entity.item.ItemRemoveType;
import com.chuangyou.xianni.entity.item.ItemTemplateInfo;
import com.chuangyou.xianni.entity.property.BaseProperty;
import com.chuangyou.xianni.equip.template.EquipTemplateMgr;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.player.PlayerInfoSendCmd;
import com.chuangyou.xianni.skill.SkillUtil;
import com.chuangyou.xianni.skill.template.SimpleProperty;

/**
 * 基本背包实现,包括领主道具、领主技能、领主装备、英雄技能
 */
public class BaseBag extends AbstractBag {

	private short		bagType;
	public final long	objectId;
	private LockData	lockData;

	public BaseBag(short capability, short bagType, short beginSlot, boolean autoStack, GamePlayer player, long objectId) {
		super(capability, bagType, beginSlot, autoStack, player, objectId);
		this.bagType = bagType;
		this.objectId = objectId;
		lockData = new LockData();
	}

	public void updateChangedPlaces() {
		List<BagMessage> bagMessage = new ArrayList<BagMessage>();
		List<Integer> tempChangedPlaces = new ArrayList<Integer>();
		synchronized (lock) {
			tempChangedPlaces.addAll(changedPlaces);
			changedPlaces.clear();
		}
		int msgSize = 0;// 每次24个物品发一次包
		for (int i : tempChangedPlaces) {
			msgSize++;
			BagMessage tempMessage = new BagMessage();
			tempMessage.addMessage(bagType, i, objectId, baseItems[i] == null ? null : baseItems[i].getItemInfo());
			bagMessage.add(tempMessage);
			if (msgSize > 200) {
				PlayerInfoSendCmd.sendUpdateBagInventory(player, bagMessage);
				bagMessage.clear();
				msgSize = 0;
			}
		}
		if (bagMessage != null && bagMessage.size() > 0) {
			PlayerInfoSendCmd.sendUpdateBagInventory(player, bagMessage);
		}
	}

	public boolean removeTemplate(int templateId, int count, short itemRemoveType, short bindType) {
		return removeTemplate(templateId, count, itemRemoveType, bindType, false);
	}

	/**
	 * 
	 * @param templateId
	 *            物品模板ID
	 * @param count
	 *            扣除数量
	 * @param itemRemoveType
	 *            扣除类型
	 * @param bindType
	 *            绑定类型
	 * @param checkInlay
	 *            是否检查镶嵌
	 * @return
	 */
	public boolean removeTemplate(int templateId, int count, short itemRemoveType, short bindType, boolean checkInlay) {
		if (count <= 0 || ItemManager.findItemTempInfo(templateId) == null) {
			return false;
		}

		List<Short> changedBindPos = new ArrayList<Short>(); // 绑定物品的位置
		List<Short> changedNoBindPos = new ArrayList<Short>(); // 非绑定物品的位置
		List<Short> changedAllPos = new ArrayList<Short>();

		int itemCount = count;
		for (short i = beginPos; i < capability; i++) {
			BaseItem tempItem = baseItems[i];
			if ((tempItem != null) && (tempItem.getItemInfo().isExist() == true) && (tempItem.getItemInfo().getTemplateId() == templateId)) {
				if (checkInlay && hasInlay(tempItem)) {
					continue; // 若装备有镶嵌宝石则不删除该装备
				}
				if (tempItem.getItemInfo().isBinds()) {
					changedBindPos.add(i);
				} else {
					changedNoBindPos.add(i);
				}
			}
		}

		if (bindType == BindType.ALL || bindType == BindType.BIND) {
			for (short i : changedBindPos) {
				if (itemCount <= 0) {
					break;
				}
				itemCount = itemCount - baseItems[i].getItemInfo().getCount();
				changedAllPos.add(i);
			}
		}

		if (bindType == BindType.ALL || bindType == BindType.NOBIND) {
			for (short i : changedNoBindPos) {
				if (itemCount <= 0) {
					break;
				}
				itemCount = itemCount - baseItems[i].getItemInfo().getCount();
				changedAllPos.add(i);

			}
		}

		// 删除已查好位置的物品
		if (itemCount <= 0) {
			itemCount = count;
			try {
				beginChanges();
				for (short i : changedAllPos) {
					BaseItem tempBaseItem = baseItems[i];
					if ((tempBaseItem != null) && (tempBaseItem.getItemInfo().getTemplateId() == templateId)) {

						if (tempBaseItem.getItemInfo().getCount() <= itemCount) {
							int removerCount = tempBaseItem.getItemInfo().getCount();
							// 根据位置删除物品
							if (removeByPos(i, itemRemoveType)) {
								itemCount = itemCount - removerCount;
							}
						} else {
							int dec = itemCount > 0 ? itemCount : 0;
							tempBaseItem.decItem(dec, 0, itemRemoveType);
							itemCount = itemCount - dec;
							onPlaceChanged(i);
						}
					}
				}

				if (itemCount != 0) {
					Log.error("Remove template error:last item cout not equal Zero.");
				}

			} catch (Exception e) {
				Log.error(String.format("删除物品出错%s", templateId), e);
			} finally {
				commitChanges();
			}
			return true;
		}
		return false;
	}

	/* 添加一个新物品到背包 */
	public boolean addTemplate(BaseItem cloneItem, int count) {
		// 物品是否可以添加
		if ((cloneItem == null) || (cloneItem.getItemInfo() == null) || (cloneItem.getItemInfo().isExist() == false) || (cloneItem.getItemTempInfo() == null) || count <= 0) {
			return false;
		}

		// 查找可放物品位置
		List<Short> changePos = new ArrayList<Short>();
		int itemCount = count;

		// 优先叠加
		for (short i = beginPos; i < capability; i++) {
			BaseItem tempItem = baseItems[i];
			if (tempItem != null && getAutoStack() && cloneItem.statckForAuto(tempItem) && tempItem.isMaxCount() == false) {
				itemCount = itemCount - (tempItem.getItemTempInfo().getAmount() - tempItem.getItemInfo().getCount());
				changePos.add(i);
			}
			if (itemCount <= 0)
				break;
		}

		// 再找空格
		if (itemCount > 0) {
			for (short i = beginPos; i < capability; i++) {
				BaseItem tempItem = baseItems[i];
				if ((tempItem == null) && (checkBag(cloneItem))) {
					int amount = cloneItem.getItemTempInfo().getAmount();
					if (amount <= 0) {
						amount = 1;
						cloneItem.getItemTempInfo().setAmount(1);
					}
					itemCount = itemCount - amount;
					changePos.add(i);
				}
				if (itemCount <= 0) {
					break;
				}
			}
		}

		//
		if (itemCount <= 0) {
			itemCount = count;
			try {
				for (short i : changePos) {
					BaseItem tempBaseItem = baseItems[i];
					// 新增
					if (tempBaseItem == null) {
						int tempCount = itemCount < cloneItem.getItemTempInfo().getAmount() ? itemCount : cloneItem.getItemTempInfo().getAmount();

						// 创建镜像物品
						BaseItem ghostItem = ItemManager.ghost(cloneItem, player.getPlayerId(), tempCount, cloneItem.getItemInfo().getAddType());

						// 添加到空格子
						addEmptyByPos(ghostItem, i);
						itemCount = itemCount - tempCount;
						cloneItem.getItemInfo().setPos(i);
					} else {
						// 叠加
						if (tempBaseItem.getItemInfo().getTemplateId() == cloneItem.getItemInfo().getTemplateId()) {
							int toalCount = tempBaseItem.getItemInfo().getCount() + itemCount;

							// 添加多少个
							int add = toalCount < tempBaseItem.getItemTempInfo().getAmount() ? itemCount : tempBaseItem.getItemTempInfo().getAmount() - tempBaseItem.getItemInfo().getCount();
							// 剩余多少个
							itemCount = itemCount - add;
							tempBaseItem.addItem(add, 0, cloneItem.getItemInfo().isBinds(), cloneItem.getItemInfo().getAddType());
							tempBaseItem.getItemInfo().setNew(cloneItem.getItemInfo().isNew());
							onPlaceChanged(i);
						}
					}
				}
				// 还有剩余,则不处理,记录错误日志(背包已满)
				if (itemCount != 0)
					Log.error(String.format("用户%s:%s,当用物品属性%s,数量%s", player.getPlayerId(), "Add template Error:last count not equal Zero", cloneItem.getItemInfo().getTemplateId(), itemCount));
			} catch (Exception e) {
				Log.error("添加物品到背包", e);
			}
			return true;
		} else {
			ErrorMsgUtil.sendErrorMsg(this.player.getPlayerId(), ErrorCode.BAG_IS_FULL, (short) 0, "背包已满");
			return false;
		}
	}

	/**
	 * 查询背包中物品数量
	 * 
	 * @param templateId
	 * @return
	 */
	public int getTemplateCount(int templateId, short bindType) {
		int count = 0;
		try {
			for (int i = beginPos; i < capability; i++) {
				if ((baseItems[i] != null) && (baseItems[i].getItemTempInfo().getId() == templateId)) {
					if (bindType == BindType.ALL) {
						count += baseItems[i].getItemInfo().getCount();
					} else {
						if (bindType == BindType.BIND && baseItems[i].getItemInfo().isBinds() == true) {
							count += baseItems[i].getItemInfo().getCount();
						} else if (bindType == BindType.NOBIND && baseItems[i].getItemInfo().isBinds() == false) {
							count += baseItems[i].getItemInfo().getCount();
						}
					}
				}
			}
		} catch (Exception e) {
			Log.error("统计数量出错");
			count = 0;
		}
		return count;
	}

	/**
	 * 跟据物品ID获取物品
	 * 
	 * @param templateId
	 * @return
	 */
	public BaseItem getBaseItemByTemplateId(int templateId) {
		try {
			for (int i = beginPos; i < capability; i++) {
				if ((baseItems[i] != null) && (baseItems[i].getItemTempInfo().getId() == templateId)) {
					return baseItems[i];
				}
			}
		} catch (Exception e) {
			Log.error("获取物品异常 TemplateId: " + templateId, e);
		}
		return null;
	}

	/**
	 * 根据绑定类型查询背包中的物品数量
	 * 
	 * @param templateId
	 *            模板ID
	 * @param bindType
	 *            绑定类型 1:绑定 、 2:非绑定
	 * @return
	 */
	public int getTemplateCountByBind(int templateId, boolean isBind) {
		int count = 0;
		try {
			for (int i = beginPos; i < capability; i++) {
				if ((baseItems[i] != null) && (baseItems[i].getItemTempInfo().getId() == templateId) && (baseItems[i].getItemInfo().isBinds() == isBind)) {
					count += baseItems[i].getItemInfo().getCount();
				}
			}
		} catch (Exception e) {
			Log.error("统计数量出错");
			count = 0;
		}
		return count;
	}

	/* 指定物品移除数量 */
	public boolean removeCountFromStack(BaseItem removedItem, int count, short removeType) {
		if (lockData.beginLock()) {
			try {
				if (removedItem == null) {
					return false;
				}
				if ((count <= 0) || removedItem.getItemInfo().getBagType() != getBagType() || removedItem.getItemInfo().getCount() < count) {
					return false;
				}
				if (removedItem.getItemInfo().getCount() == count) {
					return removeByItem(removedItem, removeType);
				} else {
					removedItem.decItem(count, 0, removeType);
				}
				onPlaceChanged(removedItem.getItemInfo().getPos());
				return true;
			} catch (Exception e) {
				Log.error("删除物品异常 userId : " + player.getNickName() + ",tempId : " + removedItem.getTemplateId() + ",count : " + count + ",removeType:" + removeType);
				return false;
			} finally {
				lockData.commitLock();
			}
		}
		return false;
	}

	/**
	 * 检查给定的物品数量是否足够
	 * 
	 * @param templateId
	 *            道具模板ID
	 * @param count
	 *            要检查的数量
	 */
	public boolean isEnough(int templateId, int count) {
		return isEnough(templateId, count, false, false);
	}

	/**
	 * 检查给定的物品数量是否足够，如果是装备的话，排除已有镶嵌宝石的
	 */
	public boolean isEnough(int templateId, int count, boolean checkInlay, boolean alert) {
		if (count == 0) {
			return true;
		}

		for (int i = beginPos; i < capability; i++) {
			BaseItem item = baseItems[i];
			if (item != null && item.getItemTempInfo() != null && item.getItemTempInfo().getId() == templateId) {

				// 检查镶嵌
				if (checkInlay && hasInlay(item)) {
					continue;
				}

				count = count - item.getItemInfo().getCount();
				if (count <= 0) {
					return true;
				}
			}
		}
		return false;
	}

	/***
	 * 检查某个装备是否有镶嵌宝石
	 */
	private boolean hasInlay(BaseItem item) {
		return item.getItemInfo().getStone() > 0;
	}

	public void saveDataBase() {
		List<BaseItem> baseItem = new ArrayList<BaseItem>();
		List<BaseItem> tempRemovedList = new ArrayList<BaseItem>();
		synchronized (lock) {
			if (this.getItems() != null && this.getItems().size() > 0) {
				baseItem.addAll(this.getItems());
			}
			if (removedList != null && removedList.size() > 0) {
				tempRemovedList.addAll(removedList);
				removedList.clear();
			}
		}
		if ((baseItem != null) && (baseItem.size() > 0)) {
			ItemManager.save(baseItem);
		}

		if (tempRemovedList.size() > 0) {
			ItemManager.save(tempRemovedList);
		}

	}

	@Override
	public void getBagJoin(BaseProperty bagData, BaseProperty bagPer) {
		// 一、计算物品加成
		List<BaseItem> items = getItems();
		Map<Integer, Integer> suitMap = new HashMap<Integer, Integer>();
		StringBuilder tempStr = new StringBuilder();
		tempStr.append(",");
		for (BaseItem item : items) {
			// 1.0 物品
			ItemInfo info = item.getItemInfo();
			int itemBase = info.getPro();// 基础属性
			float qualityCoefficient = info.getQualityCoefficient() / 10000f;// 品质系数
			float grow = info.getGrow() / 10000f;// 成长系数

			SimpleProperty property = SkillUtil.readPro(itemBase);

			// 装备栏等级
			ItemTemplateInfo tempInfo = item.getItemTempInfo();
			EquipBarInfo equipBar = player.getEquipInventory().getEquipBarByPos(info.getPos());
			if (equipBar == null)
				continue;
			int level = equipBar.getLevel();

			float proVal = (property.getValue() + level * grow) * (1 + level * qualityCoefficient); // 装备属性=（初始属性+装备等级*属性成长值）*（1+装备等级*品质系数）

			// 装备栏加持等级
			int equipBarGrade = equipBar.getGrade();
			if (tempInfo.getJiachilimit() < equipBarGrade) {
				equipBarGrade = tempInfo.getJiachilimit();
			}
			EquipBarGradeCfg equipBarCfg = EquipTemplateMgr.getBarGradeCfg(info.getPos(), equipBarGrade);
			if (equipBarCfg != null) {
				proVal = proVal * (1 + equipBarCfg.getAddProperty() / 10000f);
			}

			// 基本属性结算
			if (property.isPre()) {
				SkillUtil.joinPro(bagPer, property.getType(), (int) Math.ceil(proVal));
			} else {
				SkillUtil.joinPro(bagData, property.getType(), (int) Math.ceil(proVal));
			}

			// 加持激活额外属性
			if (tempInfo.getJiachi1() > 0 && tempInfo.getStatistics1() > 0) {
				if (equipBar.getGrade() >= tempInfo.getJiachi1()) {
					SimpleProperty jiachiPro1 = SkillUtil.readPro(tempInfo.getStatistics1());
					if (jiachiPro1.isPre()) {
						SkillUtil.joinPro(bagPer, jiachiPro1.getType(), jiachiPro1.getValue());
					} else {
						SkillUtil.joinPro(bagData, jiachiPro1.getType(), jiachiPro1.getValue());
					}
				}
			}
			if (tempInfo.getJiachi2() > 0 && tempInfo.getStatistics2() > 0) {
				if (equipBar.getGrade() >= tempInfo.getJiachi2()) {
					SimpleProperty jiachiPro2 = SkillUtil.readPro(tempInfo.getStatistics2());
					if (jiachiPro2.isPre()) {
						SkillUtil.joinPro(bagPer, jiachiPro2.getType(), jiachiPro2.getValue());
					} else {
						SkillUtil.joinPro(bagData, jiachiPro2.getType(), jiachiPro2.getValue());
					}
				}
			}
			if (tempInfo.getJiachi3() > 0 && tempInfo.getStatistics3() > 0) {
				if (equipBar.getGrade() >= tempInfo.getJiachi3()) {
					SimpleProperty jiachiPro3 = SkillUtil.readPro(tempInfo.getStatistics3());
					if (jiachiPro3.isPre()) {
						SkillUtil.joinPro(bagPer, jiachiPro3.getType(), jiachiPro3.getValue());
					} else {
						SkillUtil.joinPro(bagData, jiachiPro3.getType(), jiachiPro3.getValue());
					}
				}
			}
			if (tempInfo.getJiachi4() > 0 && tempInfo.getStatistics4() > 0) {
				if (equipBar.getGrade() >= tempInfo.getJiachi4()) {
					SimpleProperty jiachiPro4 = SkillUtil.readPro(tempInfo.getStatistics4());
					if (jiachiPro4.isPre()) {
						SkillUtil.joinPro(bagPer, jiachiPro4.getType(), jiachiPro4.getValue());
					} else {
						SkillUtil.joinPro(bagData, jiachiPro4.getType(), jiachiPro4.getValue());
					}
				}
			}

			// 统计套装
			if (info.getStone() > 0) {
				ItemTemplateInfo stoneTemp = ItemManager.findItemTempInfo(info.getStone());
				if (!suitMap.containsKey(stoneTemp.getSuit_id())) {
					suitMap.put(stoneTemp.getSuit_id(), 0);
				}
				int suitCount = suitMap.get(stoneTemp.getSuit_id());
				suitMap.put(stoneTemp.getSuit_id(), suitCount + 1);
			}

			// 2.0,装备属性
			// tempInfo.joinProperty(bagData);

			// 2.1,基础属性+强化属性

			// 2.2,计算镶嵌属性

			// 3.0 统计套装

			// 3.1统计随机技能
		}

		// 计算套装属性
		for (int key : suitMap.keySet()) {
			int suitCount = suitMap.get(key);
			EquipSuitCfg suitCfg = EquipTemplateMgr.getSuitMap().get(key);
			if (suitCfg == null)
				continue;
			Map<Integer, Integer> attMap = suitCfg.getAttMap();
			for (int count : attMap.keySet()) {
				if (suitCount >= count) {
					SimpleProperty property = SkillUtil.readPro(attMap.get(count));
					if (property.isPre()) {
						SkillUtil.joinPro(bagPer, property.getType(), property.getValue());
					} else {
						SkillUtil.joinPro(bagData, property.getType(), property.getValue());
					}
				}
			}
		}

		// 二、计算套装加成（查找PropertyX值->技能模板找到加成值）

		// 统计玩家时装开启鉴定的属性加成

		// 三、计算技能加成
		// for (int i = 0; i < skills.size(); i++) {
		// joinSkill(bagData, skills.get(i), true);
		// joinSkill(bagPer, skills.get(i), false);
		// }
	}


	// private ItemTemplateInfo getJoin(int templateId) {
	// if (templateId > 0)
	// return ItemManager.findItemTempInfo(templateId);
	// return null;
	// }
	/**
	 * 获取装备基础属性
	 */
	public float getItemProVal(ItemInfo info) {
		int itemBase = info.getPro();// 基础属性
		float qualityCoefficient = info.getQualityCoefficient() / 10000f;// 品质系数
		float grow = info.getGrow() / 10000f;// 成长系数

		SimpleProperty property = SkillUtil.readPro(itemBase);

		// 装备栏等级
		ItemTemplateInfo tempInfo = ItemManager.findItemTempInfo(info.getTemplateId());
		EquipBarInfo equipBar = player.getEquipInventory().getEquipBarByPos(info.getPos());
		if (equipBar == null)
			return 0;
		int level = equipBar.getLevel();

		float proVal = (property.getValue() + level * grow) * (1 + level * qualityCoefficient); // 装备属性=（初始属性+装备等级*属性成长值）*（1+装备等级*品质系数）

		// 装备栏加持等级
		int equipBarGrade = equipBar.getGrade();
		if (tempInfo.getJiachilimit() < equipBarGrade) {
			equipBarGrade = tempInfo.getJiachilimit();
		}
		EquipBarGradeCfg equipBarCfg = EquipTemplateMgr.getBarGradeCfg(info.getPos(), equipBarGrade);
		if (equipBarCfg != null) {
			proVal = proVal * (1 + equipBarCfg.getAddProperty() / 10000f);
		}
		return proVal;
	}

	public void joinTempInfo(BaseProperty bagEffect, ItemTemplateInfo itemTempInfo) {

	}

	public void writeAllItems(ItemListMsg.Builder itemList) {
		try {
			for (BaseItem info : baseItems) {
				if (info == null || info.getItemInfo() == null) {
					continue;
				}
				ItemFullInfoMsg.Builder updated = ItemFullInfoMsg.newBuilder();
				info.getItemInfo().writeProto(updated);
				itemList.addItem(updated);
			}
		} catch (Exception e) {
			Log.error("发送背包信息出错，playerId :" + player.getPlayerId(), e);
		}
	}

	// 清空背包
	public void clearAllItems() {
		try {
			for (BaseItem info : baseItems) {
				if (info == null || info.getItemInfo() == null) {
					continue;
				}
				removeByItem(info, ItemRemoveType.DELETE);
			}
		} catch (Exception e) {
			Log.error("清空失败 " + player.getPlayerId(), e);
		}
	}

	@Override
	public String getSkill() {
		return null;
	}
}
