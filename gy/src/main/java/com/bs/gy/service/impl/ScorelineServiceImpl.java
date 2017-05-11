package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Scoreline;
import com.bs.gy.dao.ScorelineMapper;


public class ScorelineServiceImpl extends BaseServiceImpl<Scoreline>{
	
	@Autowired
	private ScorelineMapper dao;

}
