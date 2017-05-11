package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Provice;
import com.bs.gy.dao.ProviceMapper;
import com.bs.gy.service.ProviceService;

@Service
public class ProviceServiceImpl extends BaseServiceImpl<Provice> implements ProviceService{
	
	@Autowired
	private ProviceMapper dao;

}
