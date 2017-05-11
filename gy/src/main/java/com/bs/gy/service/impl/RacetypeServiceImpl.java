package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Racetype;
import com.bs.gy.dao.RacetypeMapper;
import com.bs.gy.service.RacetypeService;

@Service
public class RacetypeServiceImpl extends BaseServiceImpl<Racetype> implements RacetypeService{
	
	@Autowired
	private RacetypeMapper dao;

}
