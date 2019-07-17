package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IAppraisedao;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.User;
import com.lnsf.book.util.DataAccess;

public class AppraisedaoImpl implements IAppraisedao{

	@Override
	public List<Appraise> select() {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs=null;
		List<Appraise> list = new ArrayList<Appraise>();
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select * from Appraise");
			rs = prep.executeQuery();
			while(rs.next())
			{
				Appraise appraise = new Appraise(rs.getInt("uid"), rs.getInt("rid"), rs.getString("about"));
				list.add(appraise);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Appraise appraise) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Appraise appraise) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Appraise appraise) {
		// TODO Auto-generated method stub
		return false;
	}

}
