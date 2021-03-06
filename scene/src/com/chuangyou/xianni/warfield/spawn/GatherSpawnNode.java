package com.chuangyou.xianni.warfield.spawn;

import com.chuangyou.common.util.Log;
import com.chuangyou.common.util.Vector3;
import com.chuangyou.xianni.entity.spawn.NpcInfo;
import com.chuangyou.xianni.entity.spawn.SpawnInfo;
import com.chuangyou.xianni.role.helper.IDMakerHelper;
import com.chuangyou.xianni.role.objects.Gather;
import com.chuangyou.xianni.role.template.NpcInfoTemplateMgr;
import com.chuangyou.xianni.warfield.field.Field;

/**
 * 采集物结点
 * 
 * @author laofan
 *
 */
public class GatherSpawnNode extends SpwanNode {
	
	private Gather gather;

	public GatherSpawnNode(SpawnInfo spwanInfo, Field field) {
		super(spwanInfo, field);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		super.start();
		// System.out.println("spawn - skin = " + spwanInfo.getEntityId());
		NpcInfo npcInfo = NpcInfoTemplateMgr.npcInfoTemps.get(spwanInfo.getEntityId());
		if (npcInfo != null) {
			gather = new Gather(IDMakerHelper.nextID(), this, npcInfo.getName());
			// npc.setSkin(npcInfo.getSkin());
			gather.setSkin(spwanInfo.getEntityId());
			gather.setPostion(new Vector3(spwanInfo.getBound_x() / Vector3.Accuracy, spwanInfo.getBound_y() / Vector3.Accuracy, spwanInfo.getBound_z() / Vector3.Accuracy));
			System.out.println("gatherID :" + gather.getId() + " skinId :" +
					gather.getSkin()+"  mapId:"+spwanInfo.getMapid());
			field.enterField(gather);
		} else {
			Log.error(spwanInfo.getId() + "----------" + spwanInfo.getEntityId() + " 在NpcInfo里面未找到配置");
		}

	}
	
	@Override
	public void over() {
		// TODO Auto-generated method stub
		if(gather != null){
			if(gather.getField() != null){
				gather.getField().leaveField(gather);
			}
			gather.destory();
			gather.clearData();
			gather = null;
		}
		super.over();
	}

}
