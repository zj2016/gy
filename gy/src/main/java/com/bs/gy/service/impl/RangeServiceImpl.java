package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Range;
import com.bs.gy.dao.RangeMapper;
import com.bs.gy.service.RangeService;

@Service
public class RangeServiceImpl extends BaseServiceImpl<Range> implements RangeService{
	
	@Autowired
	private RangeMapper dao;

}
