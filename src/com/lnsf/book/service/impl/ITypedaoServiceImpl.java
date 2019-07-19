package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.service.ITypedaoService;
import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.model.Type;

public class ITypedaoServiceImpl implements ITypedaoService{
	

	@Override
	public List<Type> select() {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		list = typedao.select();
		return list;
	}

	@Override
	public boolean insert(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.insert(type);
		return flag;
	}

	@Override
	public boolean update(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.update(type);
		return flag;
	}

	@Override
	public boolean delete(Type type) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = typedao.delete(type);
		return flag;
	}
	
}
