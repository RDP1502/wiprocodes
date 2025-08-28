package com.wipro.orderms.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class OrderItem {
	
	private Integer foodId;
    private Integer quantity;

}
