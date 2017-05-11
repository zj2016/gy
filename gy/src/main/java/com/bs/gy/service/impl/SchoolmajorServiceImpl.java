package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Schoolmajor;
import com.bs.gy.dao.SchoolmajorMapper;
import com.bs.gy.service.SchoolmajorService;

@Service
public class SchoolmajorServiceImpl extends BaseServiceImpl<Schoolmajor> implements SchoolmajorService{
	
	@Autowired
	private SchoolmajorMapper dao;

}
