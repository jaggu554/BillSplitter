package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseRequest {

	private Long userId;
	
	private Float amount;
	
	private List<Long> userIds;
}
