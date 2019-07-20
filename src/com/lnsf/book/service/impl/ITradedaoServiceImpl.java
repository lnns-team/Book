package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ITradedaoService;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.model.Trade;

public class ITradedaoServiceImpl implements ITradedaoService{

	@Override
	public List<Trade> select() {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		List<Trade> list = new ArrayList<Trade>();
		list = tradedao.select();
		return list;
	}

	@Override
	public boolean insert(Trade trade) {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		boolean flag = tradedao.insert(trade);
		return flag;
	}

	@Override
	public boolean update(Trade trade) {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		boolean flag = tradedao.update(trade);
		return flag;
	}

	@Override
	public boolean delete(Trade trade) {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		boolean flag = tradedao.delete(trade);
		return flag;
	}
	/**
	 * 根据id查询用户姓名
	 */
	@Override
	public String getUsername(int userid) {
		Tradedaoimpl tradedao = new Tradedaoimpl();
		IUserdaoServiceImpl userdaoservice = new IUserdaoServiceImpl();
		List<Trade> list = new ArrayList<Trade>();
		String username = null;
		list = tradedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getUserid() == userid)
			{
				username = userdaoservice.selectUsername(userid);
			}
		}
		return username;
	}
	/**
	 * 根据订单id和商家id查询已付款的订单是否存在
	 */
	@Override
	public boolean unfinishedTrade(int id, int rid, String status) {
		List<Trade> list = new ArrayList<Trade>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id && list.get(i).getRid() == rid && list.get(i).getStatus().equals(status))
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 根据商家Id返回已完成订单列表
	 */
	@Override
	public List<Trade> getTradeByStatus(int rid, String status) {
		List<Trade> list = new ArrayList<Trade>();
		List<Trade> result = new ArrayList<Trade>();
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid && list.get(i).getStatus().equals(status))
			{
				result.add(list.get(i));
			}
		}
		return result;
	}
	/**
	 * //根据订单Id更新状态
	 */
	@Override
	public boolean updateStatusById(int id, String status) {
		List<Trade> list = new ArrayList<Trade>();
		boolean flag = false;
		list = select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				list.get(i).setStatus(status);
				flag = update(list.get(i));
			}
		}
		return flag;
	}
	
}
