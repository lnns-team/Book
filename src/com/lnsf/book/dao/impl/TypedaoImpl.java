package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ITypedao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Type;

public class TypedaoImpl implements ITypedao {

	@Override
	public List<Type> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Type> list = new ArrayList<Type>();
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("select * from type");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Type type = new Type(rs.getInt("id"), rs.getString("name"));
				list.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Type type) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("insert into Type values(?, ?)");
			prep.setInt(1, type.getId());
			prep.setString(2, type.getName());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Type type) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("update Type set name = ? where id = ?");
			prep.setString(1, type.getName());
			prep.setInt(2, type.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Type type) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("delete from Type where id = ?");
			prep.setInt(1, type.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
