package com.drum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/v1/")
public class WelcomeController {

	@RequestMapping("/C")
	@ResponseBody 
	public String getResponse()
	{
		System.out.println("WelcomeController.getResponse()");
		return "THIS IS MY FIRST PRSPNSE WITHOUT VIEW";
	}
	
	
	
	@RequestMapping("/login")
	public String loginRequest(@RequestParam("user") String userName , @RequestParam("pass") String pass, Model m){
		System.out.println("YOUR USERNAME IS:" +userName);
		System.out.println("YOUR USERNAME IS:" +pass);
		System.out.println("login.getResponse()");
		
		String mess = "hello" + userName +"and pass"+pass ;
		m.addAttribute("msg",mess);
		return "profile";
	}
}
