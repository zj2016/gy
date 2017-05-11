package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Two;
import com.bs.gy.dao.TwoMapper;
import com.bs.gy.service.TwoService;

@Service
public class TwoServiceImpl extends BaseServiceImpl<Two> implements TwoService{
	
	@Autowired
	private TwoMapper dao;

}
