package com.gentech.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")


public class DemoController {
	
	//http://localhost:8081/v1/demo/msg
	@GetMapping("/msg")
    public String getMessage()	
    {
		return"Welcome to SpringBoot Learning In Eclipse";
    }

}
