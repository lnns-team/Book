package com.lnsf.book.view;

import java.util.Scanner;

import com.lnsf.book.dbutils.Input;

public class MainView {
    public static void main(String[] args) {
        MainView.mianView();
    }

    /**
     * 主界面 已实现！已校验！
     */
    public static void mianView() {
        System.out.println("***************************\n");
        System.out.println("\t 1.登录\n");
        System.out.println("\t 2.注册\n");
        System.out.println("***************************");

        System.out.println("\n请输入选项,或者按0退出.");
        do {
            int choice = Input.getInt();
            switch (choice) {
            case 0:
                System.out.println("------------------");
                System.out.println("您已经退出系统!");
                System.exit(1);
                break;
            case 1:
                UserView.Login();
                break;
            case 2:
                UserView.Register();
                break;
            default:
                System.err.println("无此操作,请重新输入");
                break;
            }
        } while (true);

    }
    
}
