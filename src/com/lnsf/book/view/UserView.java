package com.lnsf.book.view;

import java.awt.MenuContainer;

import com.lnsf.book.controller.MenuController;
import com.lnsf.book.controller.UserController;
import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.User;

public class UserView {
    /**
     * 登录页面
     */
    public static void login(){
        System.out.println("登录页面");
        System.out.println("请输入用户名:");
        String username = Input.getString();
        System.out.println("请输入密码:");
        String password = Input.getString();
        UserController.login(username, password);
    }
    /**
     * 注册页面
     */
    public static void register(){
        System.out.println("请输入需要注册的用户类型(1.普通用户 2.商家用户):");
        if (!UserController.modifyUserIdentify(Input.getInt()))
            return;
        System.out.println("请输入姓名");
        while (!UserController.updateUserName(Input.getString())){
            Main.again();
        }
        System.out.println("请输入用户名:");
        while (!UserController.updateUserUsername(Input.getString())){
            Main.again();
        }
        System.out.println("请输入密码:");
        while (!UserController.updateUserPassword(Input.getString())){
            Main.again();
        }
//        if (!User服务.插入用户是否成功(UserController.USER)){
          Main.success();
//          UserController.login(UserController.USER.getId(), UserController.USER.getPassword());
//        } else {
          Main.fail();
//        }
    }
    /**
     * 用户登录成功页面
     */
    public static void loginSuccessful(){
        if (UserController.USER.getIdentify() == 1){
            System.out.println("用户登录成功");
            System.out.println(UserController.USER.getName() + "用户,欢迎您!");
        } else if (UserController.USER.getIdentify() == 2){
            System.out.println("商家登录成功");
            System.out.println(UserController.USER.getName() + "老板,欢迎您!");
        }
    }
    /**
     * 用户权限未找到
     */
    public static void userIdentifyNotFound(){
        System.err.println("用户权限未找到");
    }
    /**
     * 用户登录失败
     */
    public static void userLoginFailed(){
        System.err.println("用户登录失败");
    }
    /**
     * 显示当前用户类型
     */
    public static void showUserIdentify(){
        if (UserController.USER.getIdentify() == 1){
            System.out.println("您是普通用户");
        } else if (UserController.USER.getIdentify() == 2){
            System.out.println("您是商家用户");
        } else {
            userIdentifyNotFound();
        }
    }
    public static void nameIsEmpty() {
        System.err.println("姓名为空");
    }
    public static void userNameIsEmpty() {
        System.err.println("用户名为空");
    }
    public static void userPasswordIsEmpty() {
        System.err.println("密码为空");
    }
    public static void showUserName() {
        System.out.println("您的姓名为:" + UserController.USER.getName());
    }
    public static void showUserUsername() {
        System.out.println("您的用户名为:" + UserController.USER.getUsername());
    }
    public static void showUserPassword() {
        System.out.println("您的密码为:" + UserController.USER.getPassword());
    }
    public static void userNameExist() {
        System.err.println("用户名已存在");
    }
    
    
    
    
    
    
}
