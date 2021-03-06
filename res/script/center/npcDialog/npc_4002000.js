﻿// 脚本id 唯一
function getScriptId() {
	return "npc_4002000";   //对应跟NPC配置表配置的脚本ID
}

// 脚本类型
function getInterfaceName() {
	return "com.chuangyou.xianni.npcDialog.script.INpcDialogTrigger";   //NPC对话脚本类型
}

/////////////////////////////////////脚本逻辑开始
//////////////////////////////////////////////////////////////

/**
 * 显示NPC对话（点击NPC首先调用这个接口）
 * @param roleId
 */

function showDialog(roleId,npcId,npcEntryId){
	 //=====================>固定格式，创建NPC对话选项数组<=========================
	 var listClass = Java.type('java.util.ArrayList'); 
	 var commandStructClass = Java.type('com.chuangyou.xianni.npcDialog.NpcCommand'); 
	 var list = new listClass();
	 var dialogText = '通往虚空之中某些特定地点的溶洞，仅供一次通过，通过后溶洞即刻崩塌。'; 
	 
	 list.add(new commandStructClass(100,4002000,"通过溶洞"));
	
	 sendToClient(roleId,list,dialogText);
	 
}

/**
 * 处理NPC对话选项
 * @param commandParam：选项携带的参数ID
 */
function processWithCommandParam(roleId,commandParam,npcId,npcEntryId){
	 //=====================>固定格式，创建NPC对话选项数组<=========================
	 var listClass = Java.type('java.util.ArrayList'); 
	 var commandStructClass =Java.type('com.chuangyou.xianni.npcDialog.NpcCommand'); 
	 var list = new listClass();
	 var content = "";  // 对话内容
	 //=====================>NED固定格式，创建NPC对话选项数组<=========================
	 
	if(commandParam==4002000) {
		//=====================>取出玩家<=========================
		var playerlv = getPlayerLevel(roleId);
		//=====================>判断等级是否达到35级<=========================
		if (playerlv >= 35) {
			//=====================>进入副本<=========================
			createCampaingByOnceNpc(roleId,80001,npcEntryId);
		}
		else{
			//=====================>未达到35级弹出提示<=========================
			var content = "达到35级才能平安地通过溶洞，请多加修炼后再来尝试";
			sendHintToClient(roleId,content);
		}
	}
	
	sendToClient(roleId,list,content);
}


