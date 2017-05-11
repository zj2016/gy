package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Azan;
import com.bs.gy.dao.AzanMapper;


public class AzanServiceImpl extends BaseServiceImpl<Azan>{
	
	@Autowired
	private AzanMapper dao;

}
