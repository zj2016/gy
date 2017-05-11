package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Nature;
import com.bs.gy.dao.NatureMapper;
import com.bs.gy.service.NatureService;

@Service
public class NatureServiceImpl extends BaseServiceImpl<Nature> implements NatureService{
	
	@Autowired
	private NatureMapper dao;

}
