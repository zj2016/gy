package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Azan;
import com.bs.gy.dao.AzanMapper;
import com.bs.gy.service.AzanService;

@Service
public class AzanServiceImpl extends BaseServiceImpl<Azan> implements AzanService{
	
	@Autowired
	private AzanMapper dao;

}
