package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.query.Query;
import com.bs.gy.rest.RestResult;
import com.bs.gy.service.ActiveService;

@RestController
@RequestMapping("/active")
public class ActiveController {

	@Autowired
	private ActiveService activeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(Query query){
		return RestResult.success().setResponse(activeService.getList(query.toMap()));
	}
	
}
