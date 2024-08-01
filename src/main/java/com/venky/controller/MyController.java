package com.venky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String homePage()
	{
		return "/home";
	}
	@RequestMapping("/aboutUrl")
	public String aboutPage()
	{
		return "/about";
	}
	@RequestMapping("/contact")
	public String contactPage()
	{
		return "/contact";
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "/login";
	}
	@RequestMapping("/register")
	public String registerPage()
	{
		return "/register";
	}

}
