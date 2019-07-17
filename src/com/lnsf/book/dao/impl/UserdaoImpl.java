package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IUserdao;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class UserdaoImpl implements IUserdao {

	@Override
	public List<User> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		List<User> list = new ArrayList<User>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from user");
			rs = prep.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("name"),
						rs.getInt("identify"), rs.getString("username"),
						rs.getString("password"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
