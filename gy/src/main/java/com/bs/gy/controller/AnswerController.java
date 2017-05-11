package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Answer;
import com.bs.gy.query.Query;
import com.bs.gy.rest.RestResult;
import com.bs.gy.service.AnswerService;

@RestController
@RequestMapping("/answer")
public class AnswerController extends BaseController<Answer>{

	@Autowired
	private AnswerService service;
	
}
