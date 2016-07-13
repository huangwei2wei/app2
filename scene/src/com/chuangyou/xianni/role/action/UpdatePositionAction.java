package com.chuangyou.xianni.role.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.chuangyou.common.protobuf.pb.PlayerLeaveGridProto.PlayerLeaveGridMsg;
import com.chuangyou.common.util.MathUtils;
import com.chuangyou.common.util.Vector3;
import com.chuangyou.xianni.exec.DelayAction;
import com.chuangyou.xianni.proto.MessageUtil;
import com.chuangyou.xianni.proto.PBMessage;
import com.chuangyou.xianni.protocol.Protocol;
import com.chuangyou.xianni.role.objects.ActiveLiving;
import com.chuangyou.xianni.warfield.FieldMgr;
import com.chuangyou.xianni.warfield.field.Field;
import com.chuangyou.xianni.warfield.grid.GridItem;
import com.chuangyou.xianni.warfield.helper.Selector;
import com.chuangyou.xianni.warfield.helper.selectors.PlayerSelectorHelper;
import com.chuangyou.xianni.warfield.navi.seeker.NavmeshSeeker;
import com.chuangyou.xianni.warfield.navi.seeker.NavmeshTriangle;
import com.chuangyou.xianni.world.ArmyProxy;
import com.chuangyou.xianni.world.WorldMgr;

public class UpdatePositionAction extends DelayAction {

	private static final int TICK = 100;
	private ActiveLiving activeLiving;
	private Selector playerSelector;
	private int Speed = 6;

	public UpdatePositionAction(ActiveLiving living) {
		super(living, TICK);
		// TODO Auto-generated constructor stub
		this.activeLiving = living;
		playerSelector = new PlayerSelectorHelper(this.activeLiving);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if (!activeLiving.isArrial()) {
			Vector3 target = MathUtils.GetVector3InDistance(
					activeLiving.getPostion(), 
					activeLiving.getGoal(),
					getStep(Speed));
			//System.out.println("moveTarget = " + target + " activeLiving.getPostion() = " + activeLiving.getPostion() + " activeLiving.getGoal() = " + activeLiving.getGoal());
			if (!isValidPoint(target)) // 不可站立的点
			{
				this.activeLiving.stop(true);
				setUpdate();
				return;
			}
			this.activeLiving.setMoveTime(this.activeLiving.getMoveTime()
					- TICK);
			if (this.activeLiving.getMoveTime() <= 0) {
				setPostion(activeLiving.getGoal(), playerSelector);	
				this.activeLiving.arrial();
			} else {
				setPostion(target, playerSelector);
			}
		}
		setUpdate();
	}

	private void setUpdate() {
		this.execTime = System.currentTimeMillis() + TICK;
		this.getActionQueue().enDelayQueue(this);
	}

	/**
	 * AI对象通知附近的对象
	 */
	protected void setPostion(Vector3 cur, Selector selector) {
		Field f = this.activeLiving.getField();
		GridItem curGI = f.getGrid()
				.getGridItem(this.activeLiving.getPostion());
		GridItem tarGI = f.getGrid().getGridItem(cur);
		if (curGI == null || tarGI == null)
			return; // 找不到对应的格子， 返回。。
		if (curGI.id == tarGI.id)
		{
			this.activeLiving.setPostion(cur);
			return; // 当前格子与目标格子一致
		}
		// 获取目前周围的玩家
		Set<Long> oldNears = this.activeLiving.getNears(selector);
		// 设置位置
		this.activeLiving.setPostion(cur);
		// 再获取更新后的周围玩家
		Set<Long> newNears = this.activeLiving.getNears(selector);
		// 交集
		List<Long> intersection = new ArrayList<Long>(oldNears);
		intersection.retainAll(newNears);

		// 离开场景通知 老玩家集合 同移动集合的 差集
		oldNears.removeAll(intersection);

		// 通知离开
		if (oldNears.size() > 0) {
			// System.err.println("有玩家离开视野");
			// notifyLeaveGrid(army, oldNears);
			PlayerLeaveGridMsg.Builder leaveMsg = PlayerLeaveGridMsg
					.newBuilder();
			for (Long id : oldNears) {
				ArmyProxy oldNearArmy = WorldMgr.getArmy(id);
				if (oldNearArmy == null)
					continue;
				leaveMsg.setId(this.activeLiving.getId());
				PBMessage leavepkgToOther = MessageUtil.buildMessage(
						Protocol.U_LEAVE_GRID, leaveMsg);
				oldNearArmy.sendPbMessage(leavepkgToOther);
			}
		}

		// 进入新场景通知 新玩家集合同移动集合的差集
		newNears.removeAll(intersection);
		// 通知进入
		if (newNears.size() > 0) {
			// System.err.println("有玩家进入视野");
			// notifyAttSnap(army, newNears);
			for (Long id : newNears) {
				ArmyProxy newNearArmy = WorldMgr.getArmy(id);
				if (newNearArmy == null)
					continue;
				newNearArmy.sendPbMessage(MessageUtil.buildMessage(
						Protocol.U_RESP_ATT_SNAP,
						this.activeLiving.getAttSnapMsg()));
			}
		}
	}

	/**
	 * 是否为有效的点
	 * 
	 * @param point
	 * @return
	 */
	private boolean isValidPoint(Vector3 point) {
		NavmeshSeeker seeker = FieldMgr.getIns().GetSeekerTemp(
				this.activeLiving.getField().getFieldInfo().getResName());
		NavmeshTriangle tri = seeker.getTriangle(point);
		return tri != null;
	}

	/**
	 * 获取步长(s = vt)
	 * 
	 * @param speed
	 * @return
	 */
	protected float getStep(float speed) {
		return speed * TICK * 0.001f;
	}


}