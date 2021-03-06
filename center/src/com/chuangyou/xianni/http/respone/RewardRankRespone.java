package com.chuangyou.xianni.http.respone;

import java.util.Map;

import com.chuangyou.common.util.Log;
import com.chuangyou.xianni.http.BaseRespone;
import com.chuangyou.xianni.http.HttpCmd;
import com.chuangyou.xianni.http.HttpResult;
import com.chuangyou.xianni.http.HttpResult.Code;
import com.chuangyou.xianni.rank.logic.RankRewardLogic;

@HttpCmd(command = "rewardRank", desc = "排行榜发奖")
public class RewardRankRespone implements BaseRespone {

	@Override
	public String getResult(Map<String, String> params) throws Exception {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		new RankRewardLogic().reward();
		Log.error("GM排行榜发奖用时："+(System.currentTimeMillis() - start)+"ms");
		return HttpResult.getResult(Code.SUCCESS, "*_*rewardRank exec success*_*");
	}

}
