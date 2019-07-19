package com.lnsf.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.Menu;
import com.lnsf.book.view.MenuView;
import com.lnsf.book.view.TypeView;
import com.lnsf.book.view.UserView;

public class MenuController {
    /**
     * 自动判断用户身份输出相应类别菜单 普通用户打印该类型所有菜单 店长打印该店所有菜单
     */
    public static void showMenu() {
        List<Menu> list = new ArrayList<Menu>();
        if (UserController.USER.getIdentify() == 1) {
            TypeView.inputTypeId();
            int typeId = Input.getInt();
//            if (!类型服务类.isExist(typeId)){
//                MenuView.menuNotFound();
//            } else {
////                list = 类型服务类.getMenuListByTypeId();// 根据输入类别id返回Menu List
//                MenuView.showMenu(list);
//            }
        } else if (UserController.USER.getIdentify() == 2) {
//            list = getMenuListByUserId(UserController.USER.getId());// 根据用户id返回Menu List
            MenuView.showMenu(list);
        } else {
            UserView.userIdentifyNotFound();
        }
    }
    /**
     * 商家添加新菜单
     */
    public static void addMenu() {
        
        
    }
    /**
     * 判断该菜单是否存在
     * @return
     */
    public static boolean isExist(int menuId) {
        if (UserController.USER.getIdentify() == 1){
//            Menu服务调用,查询普通用户 输入的菜单id 是否存在
        } else if (UserController.USER.getIdentify() == 2){
//            Menu服务调用,根据 商家用户id 和 商家输入菜单id 判断是否存在
        } else {
            MenuView.menuNotFound();
        }
        return false;
    }
    /**
     * 商家更新商品属性
     */
    public static void updateMenu(int menuId) {
        MenuView.showUpdateOperation(menuId);
    }
    /**
     * 商家更新商品名称
     * @param menuId
     */
    public static void updateMenuName(int menuId) {
        String menuName = MenuView.inputMenuName();
//        Menu服务.根据菜式id修改菜式名称
        
    }
    /**
     * 商家更新菜单操作
     */
    public static void updateMenu() {
        MenuView.updateMenu();
    }
    
    
    
    
    
    
    
}
