package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.City;
import com.bs.gy.dao.CityMapper;


public class CityServiceImpl extends BaseServiceImpl<City>{
	
	@Autowired
	private CityMapper dao;

}
