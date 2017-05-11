package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.City;
import com.bs.gy.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController extends BaseController<City> {

	@Autowired
	private CityService service;
	
}
