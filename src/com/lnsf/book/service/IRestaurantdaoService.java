package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Restaurant;

public interface IRestaurantdaoService {
	List<Restaurant> select();				//查询饭店
	
	boolean insert(Restaurant restaurant);	//插入饭店
	
	boolean update(Restaurant restaurant);	//更新饭店
	
	boolean delete(Restaurant restaurant);	//删除饭店
}
