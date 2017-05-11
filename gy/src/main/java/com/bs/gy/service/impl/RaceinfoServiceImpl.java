package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Raceinfo;
import com.bs.gy.dao.RaceinfoMapper;
import com.bs.gy.service.RaceinfoService;

@Service
public class RaceinfoServiceImpl extends BaseServiceImpl<Raceinfo> implements RaceinfoService{
	
	@Autowired
	private RaceinfoMapper dao;

}
