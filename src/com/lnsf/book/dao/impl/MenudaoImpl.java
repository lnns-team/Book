package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IMenudao;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class MenudaoImpl implements IMenudao{

	@Override
	public List<Menu> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Menu> list = new ArrayList<Menu>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from menu");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Menu menu = new Menu(rs.getInt("id"), rs.getString("name"), 
						rs.getInt("price"), rs.getInt("rid") ,rs.getString("mdescribe"),
						rs.getInt("type"));
				list.add(menu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

}
