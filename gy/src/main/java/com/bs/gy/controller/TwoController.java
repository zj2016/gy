package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Two;
import com.bs.gy.service.TwoService;

@RestController
@RequestMapping("/two")
public class TwoController extends BaseController<Two> {

	@Autowired
	private TwoService service;
	
}
