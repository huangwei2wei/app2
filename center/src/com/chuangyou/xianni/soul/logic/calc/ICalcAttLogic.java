package com.chuangyou.xianni.soul.logic.calc;

import java.util.Map;

import com.chuangyou.xianni.entity.soul.CardComboConfig;
import com.chuangyou.xianni.entity.soul.SoulCardInfo;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.skill.template.SimpleProperty;

public interface ICalcAttLogic {
	public void doProcess(GamePlayer player,Map<Integer, SimpleProperty> map,CardComboConfig config,Map<Integer, SoulCardInfo> cards);
}
