package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Racetype;
import com.bs.gy.service.RacetypeService;

@RestController
@RequestMapping("/racetype")
public class RacetypeController extends BaseController<Racetype> {

	@Autowired
	private RacetypeService service;
	
}
