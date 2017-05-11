package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Nature;
import com.bs.gy.service.NatureService;

@RestController
@RequestMapping("/nature")
public class NatureController  extends BaseController<Nature>{

	@Autowired
	private NatureService service;
	
}
