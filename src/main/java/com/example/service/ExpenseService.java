package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ExpenseRequest;
import com.example.model.Expense;
import com.example.model.Split;
import com.example.repo.ExpenseRepository;
import com.example.repo.SplitRepository;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository ExpRepo;
	
	@Autowired
	private SplitRepository splitRepo;
	
	
	
	
	public String createExpense(ExpenseRequest request) {
		
		Expense expense=new Expense();
		expense.setPayerId(request.getUserId());
		expense.setAmount(request.getAmount());
		expense=ExpRepo.save(expense);
		
		double share =request.getAmount()/request.getUserIds().size();
		for(Long userId:request.getUserIds()) {
			
			Split split=new Split();
			
			split.setExpenseId(expense.getId());
			split.setUserId(userId);
			split.setAmountOwed(share);
		}
		
	return "Expense added successfully";
	}
	
}
