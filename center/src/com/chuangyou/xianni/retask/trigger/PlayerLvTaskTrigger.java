package com.chuangyou.xianni.retask.trigger;

import java.util.Map;

import com.chuangyou.xianni.constant.EnumAttr;
import com.chuangyou.xianni.event.EventNameType;
import com.chuangyou.xianni.event.ObjectEvent;
import com.chuangyou.xianni.event.ObjectListener;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.player.event.PlayerPropertyUpdateEvent;
import com.chuangyou.xianni.retask.iinterface.ITask;
import com.chuangyou.xianni.retask.iinterface.ITaskInitBehavior;
/**
 * 等级
 * @author laofan
 *
 */
public class PlayerLvTaskTrigger extends BaseTaskTrigger implements ITaskInitBehavior{

	public PlayerLvTaskTrigger(GamePlayer player, ITask task) {
		super(player, task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTrigger() {
		// TODO Auto-generated method stub
		removeTrigger();
		this.listener = new ObjectListener() {
			@Override
			public void onEvent(ObjectEvent event) {
				// TODO Auto-generated method stub
				PlayerPropertyUpdateEvent e = (PlayerPropertyUpdateEvent) event;
				Map<Integer, Long> map = e.getChangeMap();
				if(map!=null){
					for(Map.Entry<Integer, Long> entry:map.entrySet()){
						if(entry.getKey() == EnumAttr.Level.getValue()){
							long lv = entry.getValue();
							getTask().updateProcess((int) lv);
						}
					}
				}
			}
		};
		player.getBasePlayer().addListener(listener, EventNameType.UPDATE_PLAYER_PROPERTY);
	}

	@Override
	public void removeTrigger() {
		// TODO Auto-generated method stu
		player.getBasePlayer().removeListener(listener, EventNameType.UPDATE_PLAYER_PROPERTY);
	}

	
	
	@Override
	public void initTask() {
		// TODO Auto-generated method stub
		getTask().getTaskInfo().setProcess(player.getBasePlayer().getPlayerInfo().getLevel());
	}

}
