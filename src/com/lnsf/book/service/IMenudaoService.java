package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Menu;

public interface IMenudaoService {
	List<Menu> select();		//查询菜单
	
	boolean insert(Menu menu);	//插入菜单
	
	boolean update(Menu menu);	//更新菜单
	
	boolean delete(Menu menu);	//删除菜单
	
	List<Menu> select(int rid);	//根据Rid返回菜单
	
	boolean selectByMenuIdAndRId(int menuid, int rid);	//根据menuid和rid判断菜式是否存在
}
