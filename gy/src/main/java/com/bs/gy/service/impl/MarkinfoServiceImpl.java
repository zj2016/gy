package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Markinfo;
import com.bs.gy.dao.MarkinfoMapper;


public class MarkinfoServiceImpl extends BaseServiceImpl<Markinfo>{
	
	@Autowired
	private MarkinfoMapper dao;

}
