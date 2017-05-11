package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.School;
import com.bs.gy.dao.SchoolMapper;


public class SchoolServiceImpl extends BaseServiceImpl<School>{
	
	@Autowired
	private SchoolMapper dao;

}
