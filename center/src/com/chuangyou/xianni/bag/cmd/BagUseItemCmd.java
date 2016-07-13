﻿package com.chuangyou.xianni.bag.cmd;

import com.chuangyou.common.protobuf.pb.item.ItemUseMsgProto.ItemUseMsg;
import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.bag.BaseBag;
import com.chuangyou.xianni.bag.BaseItem;
import com.chuangyou.xianni.bag.effect.AddBloodEffect;
import com.chuangyou.xianni.base.AbstractCommand;
import com.chuangyou.xianni.entity.item.ItemRemoveType;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.socket.Cmd;

/**
 * <pre>
 * 使用物品
 * </pre>
 */
@Cmd(code = Protocol.C_ITEM_USE, desc = "使用物品 ")
public class BagUseItemCmd extends AbstractCommand {
	// 可使用的物品子类
	private static final int[] useSonTypeSet = new int[] { 0, 1 };

	@Override
	public void execute(GamePlayer player, PBMessage packet) {
		try {
			ItemUseMsg req = ItemUseMsg.parseFrom(packet.toByteArray());
			int pos = req.getPos();// 位置
			int count = req.getCount();
			int bagType = req.getBagType();

			boolean result = false;
			// 第一步使用物品
			BaseBag bag = player.getBagInventory().getBag(bagType);
			if (bag == null) {
				return;
			}

			BaseItem baseItem = bag.getItemByPos(pos);
			if ((baseItem == null) || (baseItem.getItemInfo().isExist() == false)
					|| baseItem.getItemInfo().getCount() <= 0) {
				return;
			}

			boolean canUse = false;
			int sontype = baseItem.getItemTempInfo().getSonType();
			for (int i = 0; i < useSonTypeSet.length; i++) {
				if (sontype == useSonTypeSet[i]) {
					canUse = true;
					break;
				}
			}

			if (!canUse) {
				return;
			}

			if (!checkUse(player, sontype, baseItem, count)) {
				return;
			}

			// 等级宝箱特殊处理 action.wei, 玫瑰花特殊处理

			result = player.getBagInventory().removeItemFromPlayerBag(baseItem.getItemTempInfo().getId(), count,
					ItemRemoveType.USE);
			if (!result) {
				Log.error("删除物品失败");
				return;
			}
			// 第二步产生效果
			switch (baseItem.getItemTempInfo().getSonType()) {
				case 100000:// TODO eg:增加血量
					result = new AddBloodEffect(player, baseItem, count).execute();
					break;
				default:
					result = false;
					break;
			}
			player.getBagInventory().onUseItem(baseItem.getItemTempInfo().getId(), true);
			if (result == false) {
				Log.error(String.format("用户%s使用物品%s产生效果失败!", player.getPlayerId(), baseItem.getItemInfo().getId()));
			}
		} catch (Exception e) {
			Log.error("使用道具出错", e);
			return;
		}
	}

	public boolean checkUse(GamePlayer player, int sontype, BaseItem baseItem, int count) {
		return true;
	}
}