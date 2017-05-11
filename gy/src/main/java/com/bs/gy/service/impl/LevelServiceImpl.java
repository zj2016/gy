package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Level;
import com.bs.gy.dao.LevelMapper;
import com.bs.gy.service.LevelService;

@Service
public class LevelServiceImpl extends BaseServiceImpl<Level> implements LevelService{
	
	@Autowired
	private LevelMapper dao;

}
