package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Azan;
import com.bs.gy.service.AzanService;

@RestController
@RequestMapping("/azan")
public class AzanController extends BaseController<Azan> {

	@Autowired
	private AzanService service;
	
}
