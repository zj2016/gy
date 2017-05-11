package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Question;
import com.bs.gy.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController  extends BaseController<Question>{

	@Autowired
	private QuestionService service;
	
}
