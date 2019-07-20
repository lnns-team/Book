package com.lnsf.book.controller;

import com.lnsf.book.service.impl.IRestaurantdaoServiceImpl;

public class RestaurantController {

	static IRestaurantdaoServiceImpl restaurantdaoservice = new IRestaurantdaoServiceImpl();
	/**
	 * 根据所给id查询出餐馆名字
	 * @param rid
	 * @return
	 */
	public static String getNameByRid(int rid)
	{
		String name = restaurantdaoservice.selectNameById(rid);
		return name;
	}
}
