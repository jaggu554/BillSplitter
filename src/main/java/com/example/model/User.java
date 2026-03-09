package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Component
public class User {

	@Id
	private Integer userId;
	
	private Float paidBy;
	
	private Float needToReceive;
	
	/*
	 * create splitwisetable
	 * with user id,
	 * group name
	 * list of users who are in the group expect the current user
	 * paid by amount by user by his share
	 * 
	 * */
	
	// assume users_tbl
	// create table users_tbl(user_id number(10) not null ,group_name varchar(30) 
	//not null, debitpending_tbl.user_id (10) ,
	// total_amount number(15) , need_to_receive number(15) ,
	
	// assume debitpending_tbl
	// one to many mapping  users_tbl.user_id.
	
	// create user_id number(10),users_tbl.reference_id ,debit number(15)
	
}
