﻿// 脚本id 唯一
function getScriptId() {
	return "npc_1009248";   //对应跟NPC配置表配置的脚本ID
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

	 var dialogText='刚刚有好多人御剑飞过，往蛮荒丛林的方向去了，你最好不要过去凑热闹，小心丢了性命！'; 

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
	 
	if(commandParam==969696){

		/*sendHintToClient(roleId,"我一秒钟几十万上下会和你闲聊？！");
		return;*/
		
		content = "我一秒钟几十万上下会和你闲聊？！";

	}
	
	sendToClient(roleId,list,content);
}






