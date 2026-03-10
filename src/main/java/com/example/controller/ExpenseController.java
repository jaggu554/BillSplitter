package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ExpenseRequest;
import com.example.service.ExpenseService;

@RestController
public class ExpenseController {

	
	@Autowired
	private ExpenseService service;
	
	@PostMapping("/add")
	public String addExpense(@RequestBody ExpenseRequest request) {
		return service.createExpense(request);
	}
}
