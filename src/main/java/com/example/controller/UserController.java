package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/user")
	public ResponseEntity<String> create(@RequestBody User user){
		String msg=service.createUser(user);
		
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all/users")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	
	@GetMapping("/user")
	public User getByUserId(@RequestParam Long id) {
		
		return service.getByUserId(id).get();
	}
}
