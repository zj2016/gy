package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Indexschool;
import com.bs.gy.dao.IndexschoolMapper;


public class IndexschoolServiceImpl extends BaseServiceImpl<Indexschool>{
	
	@Autowired
	private IndexschoolMapper dao;

}
