package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.query.Query;
import com.bs.gy.rest.RestO;
import com.bs.gy.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController<Admin>{

	@Autowired
	private AdminService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	public String login(String username, String password, HttpServletRequest request) {
		
		Query query = new Query();
		Map<String, Object> params = query.toMap();
		params.put("username", username);
		params.put("password", password);
		List<Admin> list = service.getList(params);
		if (list.isEmpty()) {
			return RestO.error("登录失败，用户名密码不匹配").toJson();
		}
		Admin admin = list.get(0);
		request.getSession().setAttribute("_admin", admin);
		return RestO.success().toJson();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	public String register(Admin admin){
		Query query = new Query();
		Map<String, Object> params = query.toMap();
		params.put("username", admin.getUsername());
		List<Admin> list = service.getList(params);
		if (!list.isEmpty()) {
			return RestO.error("用户名已经存在").toJson();
		}
		
		int result = service.add(admin);
		if (result > 0) {
			return RestO.success().toJson();
		}
		return RestO.error("注册失败，请重试！").toJson();
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("_admin");
		return RestO.success().toJson();
	}
	
}
