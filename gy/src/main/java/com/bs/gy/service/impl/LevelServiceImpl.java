package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Level;
import com.bs.gy.dao.LevelMapper;


public class LevelServiceImpl extends BaseServiceImpl<Level>{
	
	@Autowired
	private LevelMapper dao;

}
