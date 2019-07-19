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
	
}
