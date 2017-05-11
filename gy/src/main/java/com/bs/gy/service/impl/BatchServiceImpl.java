package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Batch;
import com.bs.gy.dao.BatchMapper;


public class BatchServiceImpl extends BaseServiceImpl<Batch>{
	
	@Autowired
	private BatchMapper dao;

}
