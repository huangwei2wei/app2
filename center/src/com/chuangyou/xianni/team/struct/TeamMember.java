package com.chuangyou.xianni.team.struct;

import com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg;
import com.chuangyou.xianni.player.GamePlayer;
import com.chuangyou.xianni.player.PlayerState;
import com.chuangyou.xianni.word.WorldMgr;

public class TeamMember{
	
	private long playerId;
	private int teamId;
	/** 是否在线  */
	private boolean isOnline = true;
	
	public TeamMember(int teamId, long playerId) {
		this.teamId = teamId;
		this.playerId = playerId;
	}

	public int getTeamId() {
		return teamId;
	}

	public long getPlayerId() {
		return playerId;
	}


	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	/**
	 * 队员信息
	 * @param playerId
	 * @return
	 */
	public TeamMemberInfoMsg.Builder getTeamMemberMsg(){
		GamePlayer player = WorldMgr.getPlayer(playerId);
		TeamMemberInfoMsg.Builder m = TeamMemberInfoMsg.newBuilder();
		m.setPlayerId(player.getPlayerId());
		m.setLevel(player.getBasePlayer().getPlayerInfo().getLevel());
		m.setFight(player.getBasePlayer().getPlayerInfo().getFight());
		m.setName(player.getBasePlayer().getPlayerInfo().getNickName());
		m.setSkinId(player.getBasePlayer().getPlayerInfo().getSkinId());
		if(player.getPlayerState() == PlayerState.OFFLINE){
			m.setIsOnline(false);
			m.setFashionId(0);
			m.setMapId(0);
			m.setMapKey(0);
			m.setWeapon(0);
			m.setWing(0);
		}else{
			m.setIsOnline(true);
			m.setFashionId(0);
			m.setMapId(player.getBasePlayer().getPlayerPositionInfo().getMapId());
			m.setMapKey(player.getBasePlayer().getPlayerPositionInfo().getMapTempId());
			m.setWeapon(0);
			m.setWing(0);
		}
		return m;
	}

	
}