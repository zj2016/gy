package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Scoreline;
import com.bs.gy.service.ScorelineService;

@RestController
@RequestMapping("/scoreline")
public class ScorelineController extends BaseController<Scoreline> {

	@Autowired
	private ScorelineService service;
	
}
