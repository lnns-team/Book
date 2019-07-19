package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.User;

public interface IUserdaoService {
	
	List<User> select();			//查询用户
	
	boolean insert(User user);		//插入用户
	
	boolean update(User user);		//更新用户
	
	boolean delete(User user);		//删除用户
}
