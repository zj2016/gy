package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Major;
import com.bs.gy.dao.MajorMapper;


public class MajorServiceImpl2 extends BaseServiceImpl<Major>{
	
	@Autowired
	private MajorMapper dao;

}
