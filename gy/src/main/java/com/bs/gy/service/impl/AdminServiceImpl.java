package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Admin;
import com.bs.gy.dao.AdminMapper;
import com.bs.gy.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	
	@Autowired
	private AdminMapper dao;

}
