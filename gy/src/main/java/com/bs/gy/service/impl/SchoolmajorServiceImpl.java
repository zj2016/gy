package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Schoolmajor;
import com.bs.gy.dao.SchoolmajorMapper;


public class SchoolmajorServiceImpl extends BaseServiceImpl<Schoolmajor>{
	
	@Autowired
	private SchoolmajorMapper dao;

}
