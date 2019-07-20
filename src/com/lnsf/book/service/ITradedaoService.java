package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Trade;

public interface ITradedaoService {
	List<Trade> select();			//查询交易
	
	boolean insert(Trade trade);	//插入交易
	
	boolean update(Trade trade);	//更新交易
	
	boolean delete(Trade trade);	//删除交易
	
	String getUsername(int userid);	//根据用户Id查询收货人名字
	
	boolean unfinishedTrade(int id, int rid, String status);//根据订单Id和商家Id查询某状态的订单是否存在
	
	List<Trade> getFinishedTrade(int rid, String status);//根据商家Id返回已完成订单列表
	
	boolean updateStatusById(int id, String status);//根据订单Id更新状态
}
