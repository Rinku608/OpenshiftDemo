package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class Student {
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  
	
	@RequestMapping("/welcomeUser")  
	public String user()   
	{  
	return "Welcome User rinku";  
	}
	
}
