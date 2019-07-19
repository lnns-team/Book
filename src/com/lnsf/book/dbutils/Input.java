package com.lnsf.book.dbutils;

import java.util.Scanner;

public class Input {
    /**
     * 输入整数的方法
     */
    public static int getInt() {
        int num = 0;
        String regex = "([0-9])|([1-9][0-9]+)";
        do {
            Scanner sc = new Scanner(System.in);
            String nums = sc.next();

            if (nums.matches(regex)) {
                num = Integer.parseInt(nums);
            } else {
                System.err.println("输入有误,请输入检查输入!");
                continue;
            }
            break;
        } while (true);
        return num;
    }
    /**
     * 输入字符串的方法
     * @return
     */
    public static String getString() {
        String string = null;
        Scanner sc = new Scanner(System.in);
        string = sc.next();
        return string;
    }
    
}
