package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.School;
import com.bs.gy.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController extends BaseController<School> {

	@Autowired
	private SchoolService service;
	
}
