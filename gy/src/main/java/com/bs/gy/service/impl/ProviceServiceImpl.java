package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Provice;
import com.bs.gy.dao.ProviceMapper;


public class ProviceServiceImpl extends BaseServiceImpl<Provice>{
	
	@Autowired
	private ProviceMapper dao;

}
