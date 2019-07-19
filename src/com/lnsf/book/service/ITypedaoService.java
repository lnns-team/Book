package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Type;

public interface ITypedaoService {
	List<Type> select();			//查询类型
	
	boolean insert(Type type);		//插入类型
	
	boolean update(Type type);		//更新类型
	
	boolean delete(Type type);		//删除类型
}
