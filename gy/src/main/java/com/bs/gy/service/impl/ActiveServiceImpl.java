package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Active;
import com.bs.gy.dao.ActiveMapper;
import com.bs.gy.service.ActiveService;

@Service
public class ActiveServiceImpl extends BaseServiceImpl<Active> implements ActiveService{
	
	@Autowired
	private ActiveMapper dao;

}
