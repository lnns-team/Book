package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Menu;

public interface IMenudaoService {
	List<Menu> select();		//查询菜单
	
	boolean insert(Menu menu);	//插入菜单
	
	boolean update(Menu menu);	//更新菜单
	
	boolean delete(Menu menu);	//删除菜单
}
