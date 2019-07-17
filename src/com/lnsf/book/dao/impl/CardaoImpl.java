package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ICardao;
import com.lnsf.book.model.Car;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class CardaoImpl implements ICardao{

	@Override
	public List<Car> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Car> list = new ArrayList<Car>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from Car");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Car car = new Car(rs.getInt("id"), rs.getInt("menuid"), rs.getInt("num"),
						rs.getInt("tid"));
				list.add(car);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

}
