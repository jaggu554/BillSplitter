package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Groups;
import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/user/spilt")
	public String createSplit(@RequestBody Groups users) {
		
		return service.createSplit(users);
	}
}
