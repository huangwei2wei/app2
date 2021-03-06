package com.chuangyou.xianni.gather.script;

import com.chuangyou.common.util.Log;
import com.chuangyou.common.util.StringUtils;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.script.manager.ScriptManager;

public class ScriptLogic {

	/**
	 * 执行脚本
	 * 
	 * @param scriptID
	 */
	public static void doScript(String scriptID, GamePlayer player, int id) {
		// 执行脚本

		if (!StringUtils.isNullOrEmpty(scriptID) && !scriptID.trim().equals("0")) {
			IGatherScript script = null;
			try {
				script = (IGatherScript) ScriptManager.getScriptById(scriptID);

				if (script != null) {
					script.doScript(player.getPlayerId(), id);
				} else {
					Log.error("找不到脚本：" + scriptID);
				}
			} catch (Exception e) {
				// TODO: handle exception
				Log.error("脚本执行服错：" + scriptID, e);
			}
		}

	}

}
