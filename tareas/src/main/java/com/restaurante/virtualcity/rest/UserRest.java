package com.restaurante.virtualcity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserRest {
	//@GetMapping
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello Word";
	}

}
