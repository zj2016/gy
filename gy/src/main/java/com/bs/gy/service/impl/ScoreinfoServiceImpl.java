package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Scoreinfo;
import com.bs.gy.dao.ScoreinfoMapper;


public class ScoreinfoServiceImpl extends BaseServiceImpl<Scoreinfo>{
	
	@Autowired
	private ScoreinfoMapper dao;

}
