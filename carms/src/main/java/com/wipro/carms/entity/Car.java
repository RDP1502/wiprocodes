package com.wipro.carms.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Table(name = "car")
@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "car_make")
	String make;
	
	 @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	 @JoinColumn(name = "registration_id", referencedColumnName = "id")
	 CarRegistrationDetails carRegistrationDetails;
	

}
