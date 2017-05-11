package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Indexschool;
import com.bs.gy.dao.IndexschoolMapper;
import com.bs.gy.service.IndexschoolService;

@Service
public class IndexschoolServiceImpl extends BaseServiceImpl<Indexschool> implements IndexschoolService{
	
	@Autowired
	private IndexschoolMapper dao;

}
