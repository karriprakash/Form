package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class ProjectController {

	@RequestMapping("/helloWorld")
	public @ResponseBody String helloWorld() {
		return "<a href='form'> Click here to display form </a>";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "/jsp/index.jsp";
	}
	
	@RequestMapping("/save/{username}")
	public @ResponseBody String save(@PathVariable String username) {
		return "<h1> Hello " + username + "</h1>";
	}
}
