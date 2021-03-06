package com.chuangyou.xianni.battle.damage.effect;

import com.chuangyou.xianni.battle.damage.Damage;
import com.chuangyou.xianni.constant.DamageEffecterType;

/** 伤害作用器工厂 */
public class DamageEffecterFactory {
	public static DamageEffecter effecterBuilder(Damage damage) {

		if (damage.getCalcType() == DamageEffecterType.COMMON && damage.getDamageValue() >= 0) {
			return new CommonDamageEffecter();
		}

		if (damage.getCalcType() == DamageEffecterType.COMMON && damage.getDamageValue() < 0) {
			return new CommonRestoreEffecter();
		}

		if (damage.getCalcType() == DamageEffecterType.BLOOD && damage.getDamageValue() >= 0) {
			return new BloodDamageEffecter();
		}

		if (damage.getCalcType() == DamageEffecterType.BLOOD && damage.getDamageValue() < 0) {
			return new BloodRestoreEffecter();
		}

		if (damage.getCalcType() == DamageEffecterType.SOUL && damage.getDamageValue() >= 0) {
			return new SoulDamageEffecter();
		}

		if (damage.getCalcType() == DamageEffecterType.SOUL && damage.getDamageValue() < 0) {
			return new SoulRestoreEffecter();
		}
		return new CommonDamageEffecter();
	}
}
