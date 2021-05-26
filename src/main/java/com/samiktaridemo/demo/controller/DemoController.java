package com.samiktaridemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.samiktaridemo.demo.model.SenderResponse;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class DemoController {

	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/admin")
	public SenderResponse adminEndPoint() {
		System.out.println("==== in adminEndPoint ====");
		return new SenderResponse("Hello From Admin");
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/manager")
	public SenderResponse managerEndPoint() {
		System.out.println("==== in managerEndPoint ====");
		return new SenderResponse("Hello From Manager");
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/collaborateur")
	public SenderResponse collaborateurEndPoint() {
		System.out.println("==== in collaborateurEndPoint ====");
		return new SenderResponse("Hello From Collaborateur");
	}
}