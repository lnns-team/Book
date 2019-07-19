
package com.lnsf.book.controller;

import com.lnsf.book.model.User;
import com.lnsf.book.view.BgMain;
import com.lnsf.book.view.FgMain;
import com.lnsf.book.view.Main;
import com.lnsf.book.view.UserView;

public class UserController {
    public static User USER = null;
    
    public static void login(){
        UserView.login();
    }
    
	public static void login(String username, String password){
//        MainController.USER = 用户服务类.根据用户名和密码查找用户(username, password);
        if (UserController.USER.getId() == 1){
            UserView.loginSuccessful();
            FgMain.userMainView();
        } else if(UserController.USER.getId() == 2){
            UserView.loginSuccessful();
            BgMain.businessMainView();
        } else {
            UserView.userLoginFailed();
        }
	}
	
	public static void register(){
	    UserView.register();
	}
	/**
	 * 返回传入的identify是否正确
	 * @param identify
	 * @return
	 */
	public static boolean modifyUserIdentify(int identify){
	    if (identify == 1 || identify == 2){
	        USER.setId(identify);
	        UserView.showUserIdentify();
	        return true;
	    } else {
	        UserView.userIdentifyNotFound();
	        return false;
	    }
	}
	/**
	 * 根据name判断是否为空
	 * 不为空则修改USER.name
	 * @param name
	 * @return
	 */
	public static boolean updateUserUsername(String username){
	    boolean flag = false;
	    if (username == null || username.equals("")){
	        Main.fail();
	        UserView.userNameIsEmpty();
//	    } else if (用户服务类.判断输入用户名是否已经存在(name)){
	        Main.fail();
	        UserView.userNameExist();
	    } else {
	        USER.setName(username);
	        Main.success();
	        UserView.showUserUsername();
	        flag = true;
	    }
	    return flag;
	}
	   /**
     * 根据password判断是否为空
     * 不为空则修改USER.password
     * @param password
     * @return
     */
    public static boolean updateUserPassword(String password){
        boolean flag = false;
        if (password == null || password.equals("")){
            Main.fail();
            UserView.userPasswordIsEmpty();
        } else {
            USER.setPassword(password);
            Main.success();
            UserView.showUserPassword();
            flag = true;
        }
        return flag;
    }
    /**
     * 根据name判断是否为空
     * 不为空则修改USER.name
     * @param name
     * @return
     */
    public static boolean updateUserName(String name) {
        boolean flag = false;
        if (name == null || name.equals("")){
            Main.fail();
            UserView.nameIsEmpty();
        } else {
            USER.setName(name);
            Main.success();
            UserView.showUserName();
            flag = true;
        }
        return flag;
    }
	
	
	
	
	
	
}

