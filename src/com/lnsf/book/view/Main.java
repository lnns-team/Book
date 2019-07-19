package com.lnsf.book.view;

import java.util.Scanner;

import com.lnsf.book.controller.UserController;
import com.lnsf.book.dbutils.Input;

public class Main {
    public static void main(String[] args) {
        Main.mianView();
    }

    /**
     * 主界面 
     */
    public static void mianView() {
        System.out.println("***************************");
        System.out.println("*******欢迎使用开饭啦********");
        System.out.println("***************************");
        System.out.println("\t 1.登录");
        System.out.println("\t 2.注册");
        System.out.println("***************************");
        System.out.println("请输入选项,或者按0退出.");
        do {
            int choice = Input.getInt();
            switch (choice) {
            case 0:
                System.out.println("------------------");
                System.out.println("您已经退出系统!");
                System.out.println("------------------");
                System.exit(1);
                break;
            case 1:
                UserController.login();
                break;
            case 2:
                UserController.register();
                break;
            default:
                fail();
                again();
                break;
            }
        } while (true);

    }
    /**
     * 操作失败输出
     */
    public static void fail(){
        System.err.println("操作失败");
    }
    /**
     * 操作成功
     */
    public static void success(){
        System.out.println("操作成功");
    }
    /**
     * 请重新输入
     */
    public static void again(){
        System.out.println("请重新输入:");
    }
    
    
    
}
