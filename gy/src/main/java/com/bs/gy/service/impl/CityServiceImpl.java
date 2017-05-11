package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.City;
import com.bs.gy.dao.CityMapper;
import com.bs.gy.service.CityService;

@Service
public class CityServiceImpl extends BaseServiceImpl<City> implements CityService{
	
	@Autowired
	private CityMapper dao;

}
