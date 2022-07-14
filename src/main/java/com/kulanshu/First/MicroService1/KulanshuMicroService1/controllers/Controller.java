package com.kulanshu.First.MicroService1.KulanshuMicroService1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   
	
	public Controller()
	{
		System.out.println("UserController");

	}
	@GetMapping("/users123")
	public String getUsers() {
		System.out.println("In Console");
		return "Kulanshu";
	}
}
