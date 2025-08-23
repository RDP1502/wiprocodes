package com.wipro.productmgt.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "product_name")
	String productName;
	
	@Column(name = "order_quantity")
	int orderQuantity;
	
	@Column(name ="order_date")
	LocalDate date;
	
	@Column(name = "product_id")
	int productId;

}
