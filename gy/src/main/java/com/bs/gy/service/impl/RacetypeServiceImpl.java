package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Racetype;
import com.bs.gy.dao.RacetypeMapper;


public class RacetypeServiceImpl extends BaseServiceImpl<Racetype>{
	
	@Autowired
	private RacetypeMapper dao;

}
