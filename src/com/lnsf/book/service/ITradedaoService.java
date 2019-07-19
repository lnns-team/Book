package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Trade;

public interface ITradedaoService {
	List<Trade> select();			//查询交易
	
	boolean insert(Trade trade);	//插入交易
	
	boolean update(Trade trade);	//更新交易
	
	boolean delete(Trade trade);	//删除交易
}
