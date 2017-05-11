package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Markinfo;
import com.bs.gy.service.MarkinfoService;

@RestController
@RequestMapping("/markinfo")
public class MarkinfoController extends BaseController<Markinfo> {

	@Autowired
	private MarkinfoService service;
	
}
