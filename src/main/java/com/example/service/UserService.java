package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Groups;
import com.example.model.User;
import com.example.repo.GroupsRepository;
import com.example.repo.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private GroupsRepository repo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private User user;
	// first with in the groups i am fetching the userid who paid the bill and total bill paid by him
	// how much he need to receive from the others users by subtraction his share.
	public String createSplit(Groups users) {
		
		Float total=users.getAmount();
		Integer ttlUsers=users.getUsers();
		users.setToPay(total/ttlUsers);
		Integer userId=users.getGroupId();
		// fetching user details from groups and adding in the 
		
		user.setUserId(userId);
		user.setPaidBy(total);
		user.setNeedToReceive((total-(total/ttlUsers)));
		// saving into the userDb
		userRepo.save(user);
		
		// saving into the groupsDb
		repo.save(users);
		return users.getGroupName()+" splited successfully among users";
	}
	
	
	
	
}
