package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Major;
import com.bs.gy.service.MajorService;

@RestController
@RequestMapping("/major")
public class MajorController extends BaseController<Major> {

	@Autowired
	private MajorService service;
	
}
