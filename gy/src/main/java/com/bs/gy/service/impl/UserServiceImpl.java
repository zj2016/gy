package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.User;
import com.bs.gy.dao.UserMapper;


public class UserServiceImpl extends BaseServiceImpl<User>{
	
	@Autowired
	private UserMapper dao;

}
