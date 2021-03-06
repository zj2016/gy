package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Scoreinfo;
import com.bs.gy.service.ScoreinfoService;

@RestController
@RequestMapping("/scoreinfo")
public class ScoreinfoController extends BaseController<Scoreinfo> {

	@Autowired
	private ScoreinfoService service;
	
}
