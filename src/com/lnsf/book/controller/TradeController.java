package com.lnsf.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.model.Trade;
import com.lnsf.book.service.impl.ITradedaoServiceImpl;

public class TradeController {
	
	static ITradedaoServiceImpl tradedaoservice = new ITradedaoServiceImpl();
	/**
	 * 根据id查询用户姓名
	 * @param userId
	 * @return String
	 */
	public static String getUsernameByUserId(int userId)
	{
		String name = tradedaoservice.getUsername(userId);
		return name;
	}
	/**
	 * 根据商家Id返回已完成订单列表
	 * @param rid
	 * @return List<Trade>
	 */
	public static List<Trade> getFinishedTradeByRid(int rid)
	{
		List<Trade> list = new ArrayList<Trade>();
		list = tradedaoservice.getFinishedTrade(rid, "已完成");
		return list;
	}
	/**
	 * 根据订单id和商家id查询已付款的订单是否存在
	 * 存在返回true，否则返回false
	 * @param id
	 * @param rid
	 * @return boolean
	 */
	public static boolean unfinishedTradeIsExist(int id, int rid)
	{
		boolean flag = tradedaoservice.unfinishedTrade(id, rid, "未完成");
		return flag;
	}
	/**
	 * 根据订单Id更新状态
	 * 更新成功返回true，否则返回false
	 * @param tradeId
	 * @return boolean
	 */
	public static boolean updateStatusToDelivered(int tradeId)
	{
		boolean flag = tradedaoservice.updateStatusById(tradeId, "已发货");
		return flag;
	}
}
