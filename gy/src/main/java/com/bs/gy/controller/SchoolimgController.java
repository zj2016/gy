package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Schoolimg;
import com.bs.gy.service.SchoolimgService;

@RestController
@RequestMapping("/schoolimg")
public class SchoolimgController extends BaseController<Schoolimg> {

	@Autowired
	private SchoolimgService service;
	
}
