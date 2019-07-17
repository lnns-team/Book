package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ICardao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Car;
import com.lnsf.book.model.User;

public class CardaoImpl implements ICardao{

	@Override
	public List<Car> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Car> list = new ArrayList<Car>();
		try {
			conn = DButil.getConnection();
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
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("insert into Car values(?, ?, ?, ?)");
			prep.setInt(1, car.getId());
			prep.setInt(2, car.getMenuid());
			prep.setInt(3, car.getNum());
			prep.setInt(4, car.getTid());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Car car) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("update Car set menuid = ?, num = ?, "
					+ "tid = ? where id = ?");
			prep.setInt(1, car.getMenuid());
			prep.setInt(2, car.getNum());
			prep.setInt(3, car.getTid());
			prep.setInt(4, car.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Car car) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = DButil.getConnection();
			prep = conn.prepareStatement("delete from Car where id = ?");
			prep.setInt(1, car.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
