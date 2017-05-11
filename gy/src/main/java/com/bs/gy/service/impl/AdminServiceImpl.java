package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Admin;
import com.bs.gy.dao.AdminMapper;

public class AdminServiceImpl extends BaseServiceImpl<Admin>{
	
	@Autowired
	private AdminMapper dao;

}
