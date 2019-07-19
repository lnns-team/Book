package com.lnsf.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.service.IAppraisedaoService;

public class IAppraisedaoServiceImpl implements IAppraisedaoService{

	@Override
	public List<Appraise> select() {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		List<Appraise> list = new ArrayList<Appraise>();
		list = appraisedao.select();
		return list;
	}

	@Override
	public boolean insert(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.insert(appraise);
		return flag;
	}

	@Override
	public boolean update(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.update(appraise);
		return flag;
	}

	@Override
	public boolean delete(Appraise appraise) {
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		boolean flag = appraisedao.delete(appraise);
		return flag;
	}
	
}
