package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.User;
import com.bs.gy.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

	@Autowired
	private UserService service;
	
}
