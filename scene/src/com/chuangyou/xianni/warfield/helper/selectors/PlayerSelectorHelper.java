package com.chuangyou.xianni.warfield.helper.selectors;

import com.chuangyou.xianni.constant.RoleConstants;
import com.chuangyou.xianni.role.objects.Living;
import com.chuangyou.xianni.warfield.helper.Selector;

public class PlayerSelectorHelper extends Selector {

	public PlayerSelectorHelper(Living master) {
		super(master);
	}

	@Override
	public boolean selectorType(int type) {
		// TODO Auto-generated method stub
		if (type == RoleConstants.RoleType.player) {
			return true;
		}
		return false;
	}

	@Override
	public boolean selectorProtection(boolean protection) {
		// TODO Auto-generated method stub
		if (protection == true) {
			return false;
		}
		return true;
	}

	@Override
	public boolean selectorid(long id) {
		return true;
	}

}
