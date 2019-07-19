package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Car;

public interface ICardaoService {
	List<Car> select();			//查询购物车
	
	boolean insert(Car car);	//插入购物车
	
	boolean update(Car car);	//更新购物车
	
	boolean delete(Car car);	//删除购物车ﳵ
}
