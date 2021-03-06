package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Level;
import com.bs.gy.service.LevelService;

@RestController
@RequestMapping("/level")
public class LevelController extends BaseController<Level> {

	@Autowired
	private LevelService service;
	
}
