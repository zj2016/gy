package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Subject;
import com.bs.gy.dao.SubjectMapper;
import com.bs.gy.service.SubjectService;

@Service
public class SubjectServiceImpl extends BaseServiceImpl<Subject> implements SubjectService{
	
	@Autowired
	private SubjectMapper dao;

}
