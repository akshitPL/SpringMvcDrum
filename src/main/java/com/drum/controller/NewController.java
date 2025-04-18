package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

	@RequestMapping("/v1")
	public String getResponse()
	{
		System.out.println("new.getResponse()");
		return "hello2";
	}
	
	
	
	@RequestMapping("/newlogin")
	public String loginRequest()
	{
		System.out.println("login.getResponse()");
		return "profile";
	}
}
