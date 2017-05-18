package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Active;
import com.bs.gy.bean.Home;
import com.bs.gy.query.Query;
import com.bs.gy.rest.RestO;
import com.bs.gy.service.ActiveService;
import com.bs.gy.service.UserService;
import com.bs.gy.utils.DateUtils;
import com.bs.gy.utils.DateUtils.DatePattern;

@RestController
@RequestMapping()
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ActiveService activeService;
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String home() {
		
		Map<String, Object> params = new Query().toMap();
		int total = userService.getCount(params);
		params.put("registertime", DateUtils.getNowDateTime(DatePattern.yyyy_MM_dd));
		int now = userService.getCount(params);
		params.clear();
		params.put("time", DateUtils.getNowDateTime(DatePattern.yyyy_MM_dd));
		List<Active> list = activeService.getList(params);
		int hot = 0;
		if(!list.isEmpty()){
			hot = list.get(0).getCount();
		}
		Home home = new Home();
		home.setUserTotal(total);
		home.setUserNow(now);
		home.setUserHot(hot);
		return RestO.success().setData(home).toJson();
		
	}
	
}
