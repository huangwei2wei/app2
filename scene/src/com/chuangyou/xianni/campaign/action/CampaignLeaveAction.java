package com.chuangyou.xianni.campaign.action;

import com.chuangyou.xianni.campaign.Campaign;
import com.chuangyou.xianni.campaign.PlaneCampaign;
import com.chuangyou.xianni.campaign.state.CampaignState;
import com.chuangyou.xianni.campaign.state.StopState;
import com.chuangyou.xianni.constant.CampaignConstant.CampaignType;
import com.chuangyou.xianni.exec.Action;
import com.chuangyou.xianni.warfield.action.EnterFieldAction;
import com.chuangyou.xianni.warfield.field.Field;
import com.chuangyou.xianni.world.ArmyPositionRecord;
import com.chuangyou.xianni.world.ArmyProxy;

public class CampaignLeaveAction extends Action {
	ArmyProxy	army;
	Campaign	campaign;
	boolean		unline;

	public CampaignLeaveAction(Campaign campaign, ArmyProxy army) {
		super(campaign);
		this.army = army;
		this.campaign = campaign;
	}

	public CampaignLeaveAction(Campaign campaign, ArmyProxy army, boolean unLine) {
		super(campaign);
		this.army = army;
		this.campaign = campaign;
		this.unline = unLine;
	}

	@Override
	public void execute() {
		campaign.removeArmy(army, false);
		/** 挑战副本离开则销毁 */
		if (campaign.getTemp().getType() == CampaignType.AVATAR) {
			campaign.stateTransition(new StopState(campaign));
		}

		/** 竞技场副本离开则销毁 */
		if (campaign.getTemp().getType() == CampaignType.ARENA) {
			campaign.stateTransition(new StopState(campaign));
		}

		/** 渡节副本成功离开时就销毁 */
		if (campaign.getTemp().getType() == CampaignType.STATE && campaign.getState().getCode() >= CampaignState.SUCCESS) {
			campaign.stateTransition(new StopState(campaign));
		}
		// 帮派夺权副本离开销毁
		if (campaign.getTemp().getType() == CampaignType.GUILD_SEIZE) {
			campaign.stateTransition(new StopState(campaign));
		}
		// 位面副本离开后销毁
		if (campaign.getTemp().getType() == CampaignType.THE_PLANE) {
			campaign.stateTransition(new StopState(campaign));
		}
		
		/** 组队副本，当所有人离开时，销毁副本 */
		if (campaign.getTemp().getType() == CampaignType.TEAM && campaign.isEmpty() && campaign.getState().getCode() != CampaignState.STOP) {
			campaign.stateTransition(new StopState(campaign));
		} else {
			campaign.sendCampaignInfo(army);
		}
		army.getPlayer().removeCampaignBuffer();
		
//		// BOSS触发副本，玩家离开时要把玩家副本状态清除
//		if(campaign.getTemp().getType() == CampaignType.WORLD_BOSS_TRIGGER || campaign.getTemp().getType() == CampaignType.ELITE_BOSS_TRIGGER){
//			campaign.onPlayerExit(army);
//			return;
//		}

		if (campaign instanceof PlaneCampaign) {
			int outFiledId = campaign.getTemp().getTemplateId() % Field.MAX_ID;
			EnterFieldAction action = new EnterFieldAction(army, outFiledId, outFiledId, army.getPlayer().getPostion());
			army.enqueue(action);
		} else {
			ArmyPositionRecord posRecord = army.getPosRecord();
			if (posRecord == null) {
				army.returnBornMap();
				return;
			}
			EnterFieldAction action = new EnterFieldAction(army, posRecord.getMapId(), posRecord.getMapTempId(), posRecord.getPos());
			army.enqueue(action);
		}
	}
}
