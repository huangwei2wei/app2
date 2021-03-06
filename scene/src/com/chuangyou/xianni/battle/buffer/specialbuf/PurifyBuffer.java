package com.chuangyou.xianni.battle.buffer.specialbuf;

import com.chuangyou.xianni.battle.AttackOrder;
import com.chuangyou.xianni.battle.buffer.Buffer;
import com.chuangyou.xianni.battle.damage.Damage;
import com.chuangyou.xianni.entity.buffer.SkillBufferTemplateInfo;
import com.chuangyou.xianni.role.objects.Living;

/** 净化 */
public class PurifyBuffer extends Buffer {

	public PurifyBuffer(Living source, Living target, SkillBufferTemplateInfo bufferInfo) {
		super(source, target, bufferInfo);
	}

	@Override
	protected void exec(AttackOrder attackOrder, Damage beDamage1, Damage beDamage2) {
		if (bufferInfo.getIsHelpful() == 1) {
			for (Buffer buffer : target.imageBuffs()) {
				if (buffer.getBufferInfo().getIsHelpful() == 0) {
					buffer.dispose();
					target.removeBuffer(buffer);
				}
			}
		}

		if (bufferInfo.getIsHelpful() == 0) {
			for (Buffer buffer : target.imageBuffs()) {
				if (buffer.getBufferInfo().getIsHelpful() == 1) {
					buffer.dispose();
					target.removeBuffer(buffer);
				}
			}
		}
	}

}
