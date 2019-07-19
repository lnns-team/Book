package com.lnsf.book.view;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.controller.MenuController;
import com.lnsf.book.controller.UserController;
import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.Menu;

public class MenuView {
    /**
     * 自动判断用户身份并输出对应的菜单列表
     * 普通用户输出所有菜单列表
     * 商家输出自己的菜单列表
     */
    public static void showMenu(){
        List<Menu> list = new ArrayList<Menu>();
        if (UserController.USER.getIdentify() == 1) {
            TypeView.inputTypeId();
            int typeId = Input.getInt();
            if (!TypeController.isExist(typeId)){
                TypeView.typeNotFound();
                return;
            } else {
                list = 类型服务类.getMenuListByTypeId();// 根据输入类别id返回Menu List
                MenuView.showMenu(list);
            }
        } else if (UserController.USER.getIdentify() == 2) {
            list = MenuController.getMenuListByRid(UserController.USER.getId());// 根据rid返回Menu List
            MenuView.showMenu(list);
        } else {
            UserView.userIdentifyNotFound();
        }
    }
    /**
     * 根据传过来的List参数输出该菜单
     * 
     * @param list
     */
    public static void showMenu(List<Menu> list) {
        if (list.isEmpty()) {
            System.out.println("菜单为空");
        } else {
            for (Menu m : list) {
                System.out.println(m.getId() + "." + m.getName() + "价格:" + m.getPrice() + 
                        "类型:" + m.getType() + "描述:" + m.getMDescribe() + 
                        "店铺名:" + RestaurantmController.getNameByRid(m.getRid()) );
            }
        }
    }

    /**
     * 菜单不存在的错误页面
     */
    public static void menuNotFound() {
        System.err.println("菜单未找到");
    }

    /**
     * 显示更新菜单的操作
     */
    public static void showUpdateOperation(int menuId) {
        System.out.println("1.更新菜式名称");
        System.out.println("2.更新菜式价格");
        System.out.println("3.删除该菜式");
        System.out.println("0.返回主菜单");
        System.out.print("请输入:");
        int choice = Input.getInt();
        switch (choice) {
        case 0:
            BgMain.businessMainView();
            return;
        case 1:
            MenuController.updateMenuName(menuId);
            break;
        case 2:

            break;
        default:
            System.out.println("输入有误,跳转回主菜单");
            BgMain.businessMainView();
            break;
        }
    }

    /**
     * 选择操作的菜单
     */
    public static void updateMenu() {
                System.out.println("输入id进入编辑菜名(或输入-1添加新菜式):");
                int menuId = Input.getInt();
                if (menuId == -1){
                    MenuController.addMenu();
                } else if (MenuController.isExist(menuId)){
                    MenuController.updateMenu(menuId);
                } else {
                    Main.fail();
                    Main.again();
                }
    }
    public static String inputMenuName() {
        System.out.println("请输入新菜式名称:");
        return Input.getString();
    }
    /**
     * 商家添加新菜单
     */
    public static void addMenu() {
        if (!TypeController.isExistByRid(UserController.USER.getId())){
            System.out.println("你的类别为空,请先添加类别再添加菜式");
        } else {
            TypeView.showTypeByRid(UserController.USER.getId());
            System.out.println("请输入需要添加的菜式类别id(输入0返回首页):");
            int typeId = Input.getInt();
            if (typeId == 0){
                
            } else if (TypeController.isExist(typeId, UserController.USER.getId())){
                System.out.println("请输入菜名:");
                String menuName = Input.getString(20);
                System.out.println("请输入价格:");
                int menuPrice = Input.getInt();
                System.out.println("请输入商品描述:");
                String menuMDescribe = Input.getString(40);
                System.out.println("插入的菜式信息:");
                System.out.println("菜名:" + menuName);
                System.out.println("价格:" + menuPrice);
                System.out.println("类型:" + TypeController.getTypeNameById(typeId));
                System.out.println("输入1确认插入,输入0返回首页");
                if (Input.getInt("[0-1]") == 1){
                    if (MenuController.addMenu(new Menu(-1, menuName, menuPrice, 
                            UserController.USER.getId(), menuMDescribe, typeId))){
                        Main.success();
                    } else {
                        Main.fail();
                    }
                } else {
                    
                }
                    
            } else {
                System.out.println("输入类别id不存在");
            }
        }
    }
    public static void operateMenu() {
        showMenu();
        System.out.println("输入id修改该菜式(输入-1添加菜式 输入0返回上一层 )");
        int menuId = Input.getInt();
        if (menuId == 0){
            
        } else if (menuId == -1){
            addMenu();
        } else if (MenuController.isExist(menuId, UserController.USER.getId())){
            
        } else {
            System.out.println("输入有误,返回上一层");
        }
    }

}
