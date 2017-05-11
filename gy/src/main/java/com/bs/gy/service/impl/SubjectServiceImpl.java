package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Subject;
import com.bs.gy.dao.SubjectMapper;


public class SubjectServiceImpl extends BaseServiceImpl<Subject>{
	
	@Autowired
	private SubjectMapper dao;

}
