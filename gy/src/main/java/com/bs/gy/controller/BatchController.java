package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Batch;
import com.bs.gy.service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController extends BaseController<Batch> {

	@Autowired
	private BatchService service;
	
}
