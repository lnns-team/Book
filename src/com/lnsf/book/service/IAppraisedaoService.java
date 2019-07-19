package com.lnsf.book.service;

import java.util.List;

import com.lnsf.book.model.Appraise;

public interface IAppraisedaoService {
	
	List<Appraise> select();			//查询评价
	
	boolean insert(Appraise appraise);	//插入评价
	
	boolean update(Appraise appraise);	//更新评价
	
	boolean delete(Appraise appraise);	//删除评价
}
