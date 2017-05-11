package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Scoreline;
import com.bs.gy.dao.ScorelineMapper;
import com.bs.gy.service.ScorelineService;

@Service
public class ScorelineServiceImpl extends BaseServiceImpl<Scoreline> implements ScorelineService{
	
	@Autowired
	private ScorelineMapper dao;

}
