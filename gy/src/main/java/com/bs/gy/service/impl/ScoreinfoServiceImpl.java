package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Scoreinfo;
import com.bs.gy.dao.ScoreinfoMapper;
import com.bs.gy.service.ScoreinfoService;

@Service
public class ScoreinfoServiceImpl extends BaseServiceImpl<Scoreinfo> implements ScoreinfoService{
	
	@Autowired
	private ScoreinfoMapper dao;

}
