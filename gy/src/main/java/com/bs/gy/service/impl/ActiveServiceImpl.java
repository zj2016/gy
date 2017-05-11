package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Active;
import com.bs.gy.dao.ActiveMapper;
import com.bs.gy.service.ActiveService;

public class ActiveServiceImpl extends BaseServiceImpl<Active> implements ActiveService{
	
	@Autowired
	private ActiveMapper dao;

}
