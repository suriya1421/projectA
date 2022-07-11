package com.chainsys.application.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org. springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Service
{
	@RequestMapping("/welcome")
  public String welcomePage() {
	  return "<h1>Welcome</h1>";
  }
	@RequestMapping("/home")
	public String homePage() {
		String html="<div>A key element of Spring is infrastructural support at the application level: Spring focuses on the \"plumbing\" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments.</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getdata(@RequestParam(value="city",defaultValue="madurai")String city) {
		return "<h1>welcome to"+city+"</h1>";
		
		
	}
	
	
}
