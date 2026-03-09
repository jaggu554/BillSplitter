package com.example.model;

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
@Table(name="groups_tbl")
public class Groups {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer groupId;
	
	private Integer users;
	
	private Float amount;
	
	private Float toPay;
	
	
	private Integer userId;
	private String groupName;
	
}
