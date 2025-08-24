package com.wipro.foodms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="foods")
@Data
public class Food {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name = "food_name")
	String foodName;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "image_link")
	String image;
	
	@Column(name = "price")
	double price;

}
