package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.IMenudaoService;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.model.Menu;

public class IMenudaoServiceImpl implements IMenudaoService{

	@Override
	public List<Menu> select() {
		MenudaoImpl menudao = new MenudaoImpl();
		List<Menu> list = new ArrayList<Menu>();
		list = menudao.select();
		return list;
	}

	@Override
	public boolean insert(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.insert(menu);
		return flag;
	}

	@Override
	public boolean update(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.update(menu);
		return flag;
	}

	@Override
	public boolean delete(Menu menu) {
		MenudaoImpl menudao = new MenudaoImpl();
		boolean flag = menudao.delete(menu);
		return flag;
	}

}
