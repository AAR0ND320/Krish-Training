package com.aaron.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getGreeting() {
		return "Hello Spring from GET";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String postGreeting() {
		return "Hello Spring from POST";
	}
	
}
