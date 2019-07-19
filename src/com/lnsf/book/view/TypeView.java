package com.lnsf.book.view;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.dbutils.Input;
import com.lnsf.book.model.Type;

public class TypeView {
    /**
     * 显示类别表
     */
    public static void showType(){
        List<Type> list = new ArrayList<Type>();
        list = (new TypedaoImpl()).select();
        if (list.isEmpty()){
            System.out.println("类别表为空");
        } else {
            for (Type t : list){
                System.out.println(t.getId() + "./t" + t.getName());
            }
            System.out.print("请选择类别:");
        }
        
    }
    /**
     * 输入类别id提示
     */
    public static void inputTypeId(){
        System.out.print("请输入类别id:");
    }
    
    
    
}
