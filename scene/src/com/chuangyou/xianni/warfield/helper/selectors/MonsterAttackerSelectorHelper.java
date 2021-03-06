package com.chuangyou.xianni.warfield.helper.selectors;

import com.chuangyou.xianni.constant.RoleConstants.RoleType;
import com.chuangyou.xianni.role.objects.Living;
import com.chuangyou.xianni.warfield.helper.Selector;

public class MonsterAttackerSelectorHelper extends Selector {

	public MonsterAttackerSelectorHelper(Living master) {
		super(master);
	}

	@Override
	public boolean selectorType(int type) {
		if (type == RoleType.player || type == RoleType.avatar || type == RoleType.robot || type == RoleType.plot) {
			return true;
		}
		return false;
	}

	@Override
	public boolean selectorid(long id) {
		return true;
	}

	@Override
	public boolean selectorProtection(boolean protection) {
		return true;
	}
}
