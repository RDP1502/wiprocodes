package com.wipro.orderms.dto;

import lombok.Data;

@Data
public class OrderDto {
	
	int id;
	String orderNumber;
	double orderValue;
	String orderStatus;
	
}
