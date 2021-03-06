package com.chuangyou.xianni.battle.damage;

import com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg;
import com.chuangyou.xianni.constant.DamageEffecterType;
import com.chuangyou.xianni.constant.EnumAttr;
import com.chuangyou.xianni.role.objects.Living;

/**
 * <pre>
 * 伤害数据对象
 * </pre>
 */
public class Damage {
	private Living				target;
	private Living				source;
	private int					damageType;
	private int					damageValue;				// 伤害值
	private int					leftValue;					// 伤害后的当前值
	private int					tipType;					// 是否暴击 0x0001
	// 来源类型 0 无来源，1 技能，2 BUFF 3 陷阱 4 禁制
	private int					fromType;
	private long				fromId;						// 由什么技能造成
	private int					order;						// 第几次伤害
	private boolean				deadly;						// 致死伤害
	// 计算类型 1 混合计算 （先扣血后扣魂，先加魂后加血） 2只计算元魂 3 只计算气血
	private int					calcType;

	public static final int		MISS		= 2;
	public static final int		CRIPT		= 1;

	// 技能
	public static final int		SKILL		= 1;
	// buffer
	public static final int		BUFFER		= 2;
	// 陷阱
	public static final int		SNARE		= 3;
	// 法宝禁制
	public static final int		MAGICWP_BAN	= 4;

	public static final Damage	DEFAULT		= new Damage();

	/**
	 * 技能计算伤害
	 * 
	 * @param target
	 */
	public Damage(Living target, Living source) {
		this.target = target;
		this.source = source;
		damageType = DamageType.CUR_BLOOD;// 默认伤害气血
		calcType = DamageEffecterType.COMMON;
	}

	public Damage() {

	}

	public void writeProto(DamageMsg.Builder dmsg) {
		dmsg.setDamageType(this.damageType);
		dmsg.setDamageValue(this.damageValue);
		dmsg.setLeftValue(this.leftValue);
		dmsg.setFromType(this.fromType);
		dmsg.setFromId(this.fromId);
		dmsg.setOrder(this.order);
		dmsg.setTargetId(target.getId());
		dmsg.setTipType(tipType);
		dmsg.setSourceId(source.getId());
	}

	public Living getTarget() {
		return target;
	}

	public Living getSource() {
		return source;
	}

	public void setSource(Living source) {
		this.source = source;
	}

	public void setDamageType(int damageType) {
		this.damageType = damageType;
	}

	public int getDamageType() {
		return damageType;
	}

	public long getTargetId() {
		return target.getId();
	}

	public void addDamage(int damageValue, int criticalValue) {
		if (criticalValue > 0) {
			this.damageValue = criticalValue;
		} else {
			this.damageValue = damageValue;
		}
		if (criticalValue > 0) {
			this.tipType = 2;
		}
	}

	public boolean isHurt() {
		if (damageValue >= 0 && (damageType == EnumAttr.CUR_BLOOD.getValue() || damageType == EnumAttr.CUR_SOUL.getValue())) {
			return true;
		}
		return false;
	}

	public boolean isRestore() {
		if (damageValue < 0 && (damageType == EnumAttr.CUR_BLOOD.getValue() || damageType == EnumAttr.CUR_SOUL.getValue())) {
			return true;
		}
		return false;
	}

	public void addValue(int value) {
		this.damageValue += value;
	}

	public int getDamageValue() {
		return damageValue;
	}

	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}

	public int getLeftValue() {
		return leftValue;
	}

	public void setLeftValue(int leftValue) {
		this.leftValue = leftValue;
	}

	public void setTarget(Living target) {
		this.target = target;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getFromType() {
		return fromType;
	}

	public void setFromType(int fromType) {
		this.fromType = fromType;
	}

	public long getFromId() {
		return fromId;
	}

	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	public int getTipType() {
		return tipType;
	}

	public void setTipType(int tipType) {
		this.tipType = tipType;
	}

	public boolean isDeadly() {
		return deadly;
	}

	public void setDeadly(boolean deadly) {
		this.deadly = deadly;
	}

	public int getCalcType() {
		return calcType;
	}

	public void setCalcType(int calcType) {
		this.calcType = calcType;
	}

	public String toString() {
		return "[ target:" + target.getId() + "  source:" + source.getId() + "  damageType:" + damageType + " damageValue:" + damageValue + " leftValue:" + leftValue + " tipType :" + tipType
				+ "  fromType:" + fromType + " fromId:" + fromId + " order:" + order + " deadly:" + deadly + " calcType:" + calcType + "]";

	}
}
