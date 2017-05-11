package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Schoolimg;
import com.bs.gy.dao.SchoolimgMapper;
import com.bs.gy.service.SchoolimgService;

@Service
public class SchoolimgServiceImpl extends BaseServiceImpl<Schoolimg> implements SchoolimgService{
	
	@Autowired
	private SchoolimgMapper dao;

}
