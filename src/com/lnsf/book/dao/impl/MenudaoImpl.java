
package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IMenudao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.User;

public class MenudaoImpl implements IMenudao{

	@Override
	public List<Menu> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Menu> list = new ArrayList<Menu>();
		try {
			conn = DButil.getConnection();
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
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("insert into Menu values(?, ?, ?, ?, ?, ?)");
			prep.setInt(1, menu.getId());
			prep.setString(2, menu.getName());
			prep.setInt(3, menu.getPrice());
			prep.setInt(4, menu.getRid());
			prep.setString(5, menu.getMDescribe());
			prep.setInt(6, menu.getType());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Menu menu) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("update Menu set name = ?, price = ?, mdescribe = ?, "
					+ "type = ? where id = ?");
			prep.setString(1, menu.getName());
			prep.setInt(2, menu.getPrice());
			prep.setString(3, menu.getMDescribe());
			prep.setInt(4, menu.getType());
			prep.setInt(5, menu.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Menu menu) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("delete from Menu where id = ?");
			prep.setInt(1, menu.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}