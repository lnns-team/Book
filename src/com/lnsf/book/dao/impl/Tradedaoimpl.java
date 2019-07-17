package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ITradedao;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class Tradedaoimpl implements ITradedao{

	@Override
	public List<Trade> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Trade> list = new ArrayList<Trade>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from Trade");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Trade trade = new Trade(rs.getInt("id"), rs.getInt("userid"),
						rs.getString("usertele"), rs.getInt("rid"), rs.getString("status"),
						rs.getString("address"), rs.getInt("money"));
				list.add(trade);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Trade trade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Trade trade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Trade trade) {
		// TODO Auto-generated method stub
		return false;
	}

}
