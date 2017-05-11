package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Active;
import com.bs.gy.bean.Admin;
import com.bs.gy.query.Query;
import com.bs.gy.rest.RestResult;
import com.bs.gy.service.ActiveService;

@RestController
@RequestMapping("/active")
public class ActiveController extends BaseController<Active> {

	@Autowired
	private ActiveService service;
	
}
