package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Markinfo;
import com.bs.gy.dao.MarkinfoMapper;
import com.bs.gy.service.MarkinfoService;

@Service
public class MarkinfoServiceImpl extends BaseServiceImpl<Markinfo> implements MarkinfoService{
	
	@Autowired
	private MarkinfoMapper dao;

}
