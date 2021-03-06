package com.chuangyou.xianni.campaign.action;

import java.util.List;
import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.campaign.Campaign;
import com.chuangyou.xianni.campaign.CampaignFactory;
import com.chuangyou.xianni.campaign.CampaignMgr;
import com.chuangyou.xianni.campaign.CampaignTempMgr;
import com.chuangyou.xianni.campaign.TeamCampaign;
import com.chuangyou.xianni.campaign.script.ICampaignScript;
import com.chuangyou.xianni.campaign.state.StartState;
import com.chuangyou.xianni.constant.CampaignConstant;
import com.chuangyou.xianni.constant.CampaignConstant.CampaignType;
import com.chuangyou.xianni.entity.campaign.CampaignTemplateInfo;
import com.chuangyou.xianni.exec.Action;
import com.chuangyou.xianni.script.IScript;
import com.chuangyou.xianni.script.manager.ScriptManager;
import com.chuangyou.xianni.team.Team;
import com.chuangyou.xianni.team.TeamMgr;
import com.chuangyou.xianni.warfield.FieldMgr;
import com.chuangyou.xianni.warfield.field.Field;
import com.chuangyou.xianni.world.ArmyProxy;
import com.chuangyou.xianni.world.WorldMgr;

public class CampaignCreateAction extends Action {

	private ArmyProxy	army;
	private int			campaignId;
	private int			taskId;
	private boolean		noCrossMap	= false;	// 是否允许跨地图拉入

	public CampaignCreateAction(ArmyProxy army, int campaignId, int taskId) {
		super(army);
		this.army = army;
		this.campaignId = campaignId;
		this.taskId = taskId;
	}

	public CampaignCreateAction(ArmyProxy army, int campaignId, boolean noCrossMap) {
		super(army);
		this.army = army;
		this.campaignId = campaignId;
		this.noCrossMap = noCrossMap;
	}

	@Override
	public void execute() {
		Field curField = FieldMgr.getIns().getField(army.getFieldId());
		// 不允许在副本中创建副本
		if (curField != null && curField.getCampaignId() > 0) {
			Log.error("user request create campaign but is aleady in campaign. playerId : " + army.getPlayerId());
			return;
		}

		CampaignTemplateInfo temp = CampaignTempMgr.get(campaignId);
		if (temp == null) {
			Log.error("playerId: " + army.getPlayerId() + " create campaign if fail ,campaignId:" + campaignId);
			return;
		}

		if (temp.getType() == CampaignType.THE_PLANE && army.getPlayer().getField().id != campaignId % (Field.MAX_ID)) {
			Log.error("playerId: " + army.getPlayerId() + " create plane  fail ,campaignId:" + campaignId);
			return;
		}

		Campaign campaign = CampaignFactory.createCampaign(temp, army, taskId);
		if (campaign == null) {
			Log.error("创建副本失败---------------------------------------------campaignId :" + campaignId);
			return;
		}
		CampaignMgr.add(campaign);
		campaign.stateTransition(new StartState(campaign));
		campaign.onPlayerEnter(army);
		
		if (campaign.getTemp().getType() == CampaignType.TEAM || campaign.getTemp().getType() == CampaignType.NPC_CAM_ACTIVITY) {
			Team team = TeamMgr.getTeamByPlayerId(army.getPlayerId());
			if (team == null) {
				return;
			}
			List<Long> players = team.getMembers();
			if (players == null || players.size() <= 0) {
				return;
			}
			for (Long playerId : players) {
				if (army.getPlayerId() == playerId) {
					continue;
				}
				ArmyProxy teamMember = WorldMgr.getArmy(playerId);
				if (teamMember == null) {
					continue;
				}
				// 当不允许跨地图拉入时，判断是否在同一个地图
				if (noCrossMap && teamMember.getPlayer().getField() != army.getPlayer().getField()) {
					IScript script = ScriptManager.getScriptById(CampaignConstant.SCRIPTID);
					if(script != null){
						ICampaignScript campaignScript = (ICampaignScript) script;
						if(campaignScript != null){
							campaignScript.notInCampaignCreateField(playerId, campaignId);
						}
					}
					continue;
				}
				campaign.onPlayerEnter(teamMember);
			}
			TeamCampaign tc = (TeamCampaign) campaign;
			tc.setTeamId(team.getTeamid());
			team.setCampaignId(tc.getIndexId());
		}
	}

}
