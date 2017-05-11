package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Range;
import com.bs.gy.dao.RangeMapper;


public class RangeServiceImpl extends BaseServiceImpl<Range>{
	
	@Autowired
	private RangeMapper dao;

}
