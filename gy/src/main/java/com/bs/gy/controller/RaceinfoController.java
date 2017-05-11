package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Raceinfo;
import com.bs.gy.service.RaceinfoService;

@RestController
@RequestMapping("/raceinfo")
public class RaceinfoController  extends BaseController<Raceinfo>{

	@Autowired
	private RaceinfoService service;
	
}
