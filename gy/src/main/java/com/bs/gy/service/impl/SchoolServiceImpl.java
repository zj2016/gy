package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.School;
import com.bs.gy.dao.SchoolMapper;
import com.bs.gy.service.SchoolService;

@Service
public class SchoolServiceImpl extends BaseServiceImpl<School> implements SchoolService{
	
	@Autowired
	private SchoolMapper dao;

}
