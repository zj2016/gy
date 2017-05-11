package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Raceinfo;
import com.bs.gy.dao.RaceinfoMapper;


public class RaceinfoServiceImpl extends BaseServiceImpl<Raceinfo>{
	
	@Autowired
	private RaceinfoMapper dao;

}
