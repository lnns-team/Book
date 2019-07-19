package com.lnsf.book.view;

import com.lnsf.book.controller.MenuController;
import com.lnsf.book.dbutils.Input;

public class FgMain {

    /**
     * 用户首页
     */
    public static void userMainView(){
        do {
            System.out.println("***************************\n");
            System.out.println("\t 1.选择类别\n");
            System.out.println("\t 2.选择餐厅\n");
            System.out.println("\t 3.我的订单\n");
            System.out.println("\t 4.退出登录");
            System.out.println("***************************");
            System.out.print("请输入:");
            int choice = Input.getInt();
            switch (choice) {
            case 0:
                System.out.println("------------------");
                System.out.println("您已经退出登录!");
                System.out.println("------------------");
                Main.mianView();
                return;
            case 1:
                MenuController.showMenu();
                break;
            case 2:
                RestaurantView.showRestaurant();
                break;
            case 3:
                
            default:
                System.err.println("无此操作,请重新输入");
                break;
            }
        } while (true);
    }
}
