package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IRestaurantdaoService;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.model.Restaurant;

public class IRestaurantdaoServiceImpl implements IRestaurantdaoService{

	@Override
	public List<Restaurant> select() {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		list = restaurantdao.select();
		return list;
	}

	@Override
	public boolean insert(Restaurant restaurant) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		boolean flag = restaurantdao.insert(restaurant);
		return flag;
	}

	@Override
	public boolean update(Restaurant restaurant) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		boolean flag = restaurantdao.update(restaurant);
		return flag;
	}

	@Override
	public boolean delete(Restaurant restaurant) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		boolean flag = restaurantdao.delete(restaurant);
		return flag;
	}
	
}
