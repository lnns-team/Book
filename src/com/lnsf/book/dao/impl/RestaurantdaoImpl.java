package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IRestaurantdao;
import com.lnsf.book.model.Restaurant;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class RestaurantdaoImpl implements IRestaurantdao{

	@Override
	public List<Restaurant> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Restaurant> list = new ArrayList<Restaurant>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from Restaurant");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Restaurant restaurant = new Restaurant(rs.getInt("id"), rs.getInt("userid"), 
						rs.getString("name"), rs.getString("address"));
				list.add(restaurant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return false;
	}

}
