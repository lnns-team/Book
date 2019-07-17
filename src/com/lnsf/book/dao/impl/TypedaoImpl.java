package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ITypedao;
import com.lnsf.book.model.Type;
import com.lnsf.book.util.DataAccess;

public class TypedaoImpl implements ITypedao {

	@Override
	public List<Type> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Type> list = new ArrayList<Type>();
		try {
			conn = DataAccess.getConnection();
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Type type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Type type) {
		// TODO Auto-generated method stub
		return false;
	}

}
