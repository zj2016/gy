package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.dao.SchoolAllMapper;
import com.bs.gy.service.SchoolAllService;
import com.bs.gy.vo.SchoolAll;

@Service
public class SchoolAllServiceImpl extends BaseServiceImpl<SchoolAll> implements SchoolAllService{
	
	@Autowired
	private SchoolAllMapper dao;
	

}
