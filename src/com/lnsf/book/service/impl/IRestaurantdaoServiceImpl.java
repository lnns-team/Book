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
	
	/**
	 * 根据给出的id返回一个商家信息
	 */
	@Override
	public Restaurant selectById(int rid) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		Restaurant result = null;
		list = restaurantdao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if( list.get(i).getId() == rid)
				result = new Restaurant(list.get(i).getId(), list.get(i).getUserid(),
						list.get(i).getName(), list.get(i).getAddress());
		}
		return result;
	}
	
	/**
	 * 根据给出的id返回一个商家名字
	 */
	@Override
	public String selectNameById(int rid) {
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		List<Restaurant> list = new ArrayList<Restaurant>();
		String result = null;
		list = restaurantdao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if( list.get(i).getId() == rid)
				result = list.get(i).getName();
		}
		return result;
	}
	
}
