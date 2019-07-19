package com.lnsf.cookbook.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ICardaoService;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.model.Car;

public class ICardaoServiceImpl implements ICardaoService{

	@Override
	public List<Car> select() {
		CardaoImpl cardao = new CardaoImpl();
		List<Car> list = new ArrayList<Car>();
		list = cardao.select();
		return list;
	}

	@Override
	public boolean insert(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.insert(car);
		return flag;
	}

	@Override
	public boolean update(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.update(car);
		return flag;
	}

	@Override
	public boolean delete(Car car) {
		CardaoImpl cardao = new CardaoImpl();
		boolean flag = cardao.delete(car);
		return flag;
	}
	
}
