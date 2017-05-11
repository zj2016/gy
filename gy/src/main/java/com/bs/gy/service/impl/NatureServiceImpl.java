package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Nature;
import com.bs.gy.dao.NatureMapper;


public class NatureServiceImpl extends BaseServiceImpl<Nature>{
	
	@Autowired
	private NatureMapper dao;

}
