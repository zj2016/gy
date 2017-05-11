package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Batch;
import com.bs.gy.dao.BatchMapper;
import com.bs.gy.service.BatchService;

@Service
public class BatchServiceImpl extends BaseServiceImpl<Batch> implements BatchService{
	
	@Autowired
	private BatchMapper dao;

}
