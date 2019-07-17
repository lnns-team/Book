package com.lnsf.book.dbutils;

import java.util.Scanner;

public class Input {
    /**
     * 输入整数的方法
     */
    public static int getInt() {
        int num = 0;
        String regex = "([1-9])|([1-9][0-9]+)";
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
    
    
}
