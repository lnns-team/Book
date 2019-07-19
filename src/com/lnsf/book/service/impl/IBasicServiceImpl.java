package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IBasicService;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.User;

public class IBasicServiceImpl implements IBasicService{
	public int id;
	public int rid;
	public int tid[];
	@Override
	public int login(String username, String password) {
		ICustomerServiceImpl customerService = new ICustomerServiceImpl();
		UserdaoImpl userdao = new UserdaoImpl();
		int flag = 0;
		List<User> list = new ArrayList<User>();
		list = userdao.select();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password))
			{		//判断用户是否存在
				id = list.get(i).getId();
				if(list.get(i).getIdentify() == 1)	//返回用户的身份
				{
					flag = 1;						//用户是消费者用户
					tid = customerService.getTid();
				}
				else
				{
					flag = 2;						//用户是店主用户
					IBossServiceImpl boss = new IBossServiceImpl();
					rid = boss.getRestaurant();
				}
			}
		}
		return flag;
	}
	/**
	 * 
	 */
	@Override
	public boolean register(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.insert(user);
		return flag;
	}
	
}
