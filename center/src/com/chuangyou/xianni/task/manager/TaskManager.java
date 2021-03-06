package com.chuangyou.xianni.task.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg;
import com.chuangyou.common.protobuf.pb.task.TaskUpdateRespProto.TaskUpdateRespMsg;
import com.chuangyou.common.util.TimeUtil;
import com.chuangyou.xianni.activeSystem.cmd.ClearDayAndWeekActive;
import com.chuangyou.xianni.entity.Option;
import com.chuangyou.xianni.entity.task.TaskCfg;
import com.chuangyou.xianni.entity.task.TaskInfo;
import com.chuangyou.xianni.exec.CmdTask;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.retask.vo.RealTask;
import com.chuangyou.xianni.task.cmd.ClearDayTaskCmd;
import com.chuangyou.xianni.task.template.TaskTemplateMgr;
import com.chuangyou.xianni.word.WorldMgr;

public class TaskManager {
	
	
	/**
	 * 清理所有在线人的日常任务
	 */
	public static void clearAllDayTask(){
		for(GamePlayer player:WorldMgr.getOnLinePlayers()){
			if(player.getTaskInventory().isReady()){
				//clearDayTask(player,true);
				PBMessage pkg = MessageUtil.buildMessage((short)-1,player.getPlayerId());
				//将任务模拟进队列
				player.enqueue(new CmdTask(new ClearDayTaskCmd(), null, pkg, player.getCmdTaskQueue()));
			}
			if(player.getActiveInventory().isReady()){
				PBMessage pkg = MessageUtil.buildMessage((short)-1,player.getPlayerId());
				//将任务模拟进队列
				player.enqueue(new CmdTask(new ClearDayAndWeekActive(), null, pkg, player.getCmdTaskQueue()));
			}
		}
	}
	
	
	/**
	 * 清理日常任务
	 * @param player
	 * @param info
	 */
	public static void clearDayTask(GamePlayer player,boolean isNotify){
		Map<Integer, RealTask> infos = player.getTaskInventory().getTaskInfos();
		Iterator<Entry<Integer, RealTask>> it = infos.entrySet().iterator();
		List<RealTask> list = new ArrayList<>();		
		List<TaskInfo> removeList = new ArrayList<>();
		while(it.hasNext()){
			TaskInfo t = it.next().getValue().getInfo();
			TaskCfg cfg = TaskTemplateMgr.getTaskCfg(t.getTaskId());
			if(cfg==null)continue;
			if(cfg.getTaskType() == TaskCfg.DAY){
				if(!TimeUtil.dataCompare5(t.getUpdateTime())){//跨天
					TaskCfg pre = TaskTemplateMgr.getLinkHead(cfg.getTaskLink());
					TaskInfo updateT = new TaskInfo();
					updateT.setPlayerId(player.getPlayerId());
					updateT.setProcess(0);
					updateT.setTaskId(pre.getTaskId());
					updateT.setState((byte) 0);
					updateT.setUpdateTime(new Date());
					updateT.setCreateTime(new Date());
					updateT.setOp(Option.Insert);
					RealTask task = new RealTask(cfg, updateT, player);
					list.add(task);
					if(isNotify){	
						TaskUpdateRespMsg.Builder resp = TaskUpdateRespMsg.newBuilder();
						resp.setInfo(TaskManager.getTaskMsg(updateT));
						PBMessage pkg = MessageUtil.buildMessage(Protocol.U_RESP_TASKUPDATE,resp);
						player.sendPbMessage(pkg);
					}
					removeList.add(t);
				}
			}			
		}
			
		if(removeList.size()>0){
			for (TaskInfo taskInfo : removeList) {
				player.getTaskInventory().del(taskInfo.getTaskId());
			}
		}
		if(list.size()>0){			
			for (RealTask task : list) {
				player.getTaskInventory().add(task);
			}
		}
				
	}
	
	
	
	
	/**
	 * 发送通知消息给客户端
	 * @param player
	 * @param info
	 */
	public static void sendNotify(GamePlayer player,TaskInfo info){
		TaskUpdateRespMsg.Builder resp = TaskUpdateRespMsg.newBuilder();
		resp.setInfo(getTaskMsg(info));
		PBMessage pkg = MessageUtil.buildMessage(Protocol.U_RESP_TASKUPDATE,resp);
		player.sendPbMessage(pkg);
	}
	
	
	/** 
	 * 获取任务消息
	 * @param info
	 * @return
	 */
	public static TaskInfoMsg.Builder getTaskMsg(TaskInfo info){
		TaskInfoMsg.Builder msg = TaskInfoMsg.newBuilder();
		msg.setTaskId(info.getTaskId());
		msg.setState(info.getState());
		msg.setProcess(info.getProcess());
		msg.setCreateTime(info.getCreateTime().getTime());
		return msg;
	}
	
}
