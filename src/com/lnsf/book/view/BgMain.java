package com.lnsf.book.view;

import com.lnsf.book.controller.MenuController;
import com.lnsf.book.dbutils.Input;

public class BgMain {
    /**
     * 商家首页
     */
    public static void businessMainView(){
        do {
            System.out.println("***************************\n");
            System.out.println("\t 1.查看订单\n");
            System.out.println("\t 2.查看菜单\n");
            System.out.println("\t 0.退出登录");
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
                
                break;
            case 2:
                MenuController.showMenu();
                MenuController.updateMenu();
                break;
            case 3:
                
            default:
                System.err.println("无此操作");
                break;
            }
        } while (true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
