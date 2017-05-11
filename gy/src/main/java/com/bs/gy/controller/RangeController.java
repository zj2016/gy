package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Range;
import com.bs.gy.service.RangeService;

@RestController
@RequestMapping("/range")
public class RangeController extends BaseController<Range> {

	@Autowired
	private RangeService service;
	
}
