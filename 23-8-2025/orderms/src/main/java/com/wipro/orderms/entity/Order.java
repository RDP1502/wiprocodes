package com.wipro.orderms.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_details")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "order_id")
	String orderId;
	
	@Column(name = "order_value")
	double orderValue;
	
	
	@Column(name = "order_time")
	LocalDate orderTime;
	
	 @ElementCollection
	    @CollectionTable(
	        name = "order_foods",
	        joinColumns = @JoinColumn(name = "order_id")
	    )
	    @Column(name = "food_id")
	    private List<Integer> foodIds;

}
