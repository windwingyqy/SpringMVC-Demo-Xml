package com.bonc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.model.User;
import com.bonc.model.UserBean;
import com.bonc.service.UserService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello/{str}")
	@ResponseBody
	public UserBean hello(@PathVariable("str") String str) {
		System.out.println("接收："+str);
		UserBean ub=new UserBean();
		ub.setUserName("ABC");
		ub.setUserPass("pass");
		return ub;
	}
	
	@RequestMapping("/hello2/{str}")
	@ResponseBody
	public String hello2(@PathVariable("str") String str) {
		System.out.println("接收："+str);
		return str;
	}
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public User getUser(@PathVariable long id) {
		return userService.selectUserById(id);
	}
}
