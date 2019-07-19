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
	/**
	 * 根据id判断类型是否存在
	 */
	@Override
	public boolean selectById(int id) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = false;
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				result.add(list.get(i));
			}
		}
		if (result.size() > 0) flag = true;
		return flag;
	}
	/**
	 * 根据rid返回类型列表
	 */
	@Override
	public List<Type> selectByRId(int rid) {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid)
			{
				result.add(list.get(i));
			}
		}
		return result;
	}
	/**
	 * 根据rid判断类型是否存在
	 */
	@Override
	public boolean selectByRid(int rid) {
		TypedaoImpl typedao = new TypedaoImpl();
		boolean flag = false;
		List<Type> list = new ArrayList<Type>();
		List<Type> result = new ArrayList<Type>();
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getRid() == rid)
			{
				result.add(list.get(i));
			}
		}
		if (result.size() > 0) flag = true;
		return flag;
	}
	/**
	 * 根据类型id返回类型名
	 */
	@Override
	public String getNameById(int id) {
		TypedaoImpl typedao = new TypedaoImpl();
		List<Type> list = new ArrayList<Type>();
		String name = null;
		list = typedao.select();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == id)
			{
				name = list.get(i).getName();
			}
		}
		return name;
	}
	
	
}
