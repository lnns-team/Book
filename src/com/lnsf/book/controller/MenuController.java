package com.lnsf.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.Menu;
import com.lnsf.book.service.impl.IMenudaoServiceImpl;
import com.lnsf.book.view.MenuView;
import com.lnsf.book.view.TypeView;
import com.lnsf.book.view.UserView;

public class MenuController {
	
	static IMenudaoServiceImpl menudaoservice = new IMenudaoServiceImpl();
    
    /**
     * 根据商家id返回菜单列表
     */
    public static List<Menu> getMenuListByRid(int rid) {
    	List<Menu> list = new ArrayList<Menu>();
    	list = menudaoservice.select(rid);
		return list;
    }
    /**
     * 根据menuid和rid判断菜式是否存在
     * @param menuId
     * @param rid
     * @return boolean
     */
    public static boolean isExist(int menuId, int rid) {
    	boolean flag = menudaoservice.selectByMenuIdAndRId(menuId, rid);
		return flag;
    }
    /**
     * 添加菜单
     * @param menu
     * @return boolean
     */
    public static boolean addMenu(Menu menu)
    {
    	menudaoservice.insert(menu);
    	boolean flag = false;
    	return flag;
    }
    /**
     *  根据菜单id返回菜单列表
     * @param id
     * @return Menu
     */
    public static Menu getMenuByMenuId(int id) {
    	Menu menu = null;
    	menu = menudaoservice.selectById(id);
		return menu;
    }
    /**
     * 更新菜单
     * 更新成功返回true，失败返回false
     * @param menu
     * @return
     */
    public static boolean updateMenu(Menu menu)
    {
    	boolean flag = false;
    	flag = menudaoservice.update(menu);
		return flag;
    }
    /**
     * 根据Id删除菜式
     * @param menuId
     * @return boolean
     */
    public static boolean delMenuById(int menuId)
    {
    	boolean flag = menudaoservice.deleteById(menuId);
    	return flag;
    }

}
