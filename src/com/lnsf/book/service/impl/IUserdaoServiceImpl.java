package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IUserdaoService;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.User;

public class IUserdaoServiceImpl implements IUserdaoService{

	@Override
	public List<User> select() {
		UserdaoImpl userdao = new UserdaoImpl();
		List<User> list = new ArrayList<User>();
		list = userdao.select();
		return list;
	}

	@Override
	public boolean insert(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.insert(user);
		return flag;
	}

	@Override
	public boolean update(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.update(user);
		return flag;
	}

	@Override
	public boolean delete(User user) {
		UserdaoImpl userdao = new UserdaoImpl();
		boolean flag = userdao.delete(user);
		return flag;
	}

	
}
