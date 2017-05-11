package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Two;
import com.bs.gy.dao.TwoMapper;


public class TwoServiceImpl extends BaseServiceImpl<Two>{
	
	@Autowired
	private TwoMapper dao;

}
