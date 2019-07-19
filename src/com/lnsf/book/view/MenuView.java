package com.lnsf.book.view;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.controller.MenuController;
import com.lnsf.book.controller.UserController;
import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.Menu;

public class MenuView {
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
                System.out.println(m.getId() + "." + m.getName());
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

}
