package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Major;
import com.bs.gy.dao.MajorMapper;
import com.bs.gy.service.MajorService;

@Service
public class MajorServiceImpl2 extends BaseServiceImpl<Major> implements MajorService{
	
	@Autowired
	private MajorMapper dao;

}
