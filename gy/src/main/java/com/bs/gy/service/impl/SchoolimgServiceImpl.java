package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Schoolimg;
import com.bs.gy.dao.SchoolimgMapper;


public class SchoolimgServiceImpl extends BaseServiceImpl<Schoolimg>{
	
	@Autowired
	private SchoolimgMapper dao;

}
