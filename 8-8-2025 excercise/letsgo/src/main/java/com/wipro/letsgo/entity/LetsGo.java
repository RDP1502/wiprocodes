package com.wipro.letsgo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@Table(name = "vehicle_movement")
public class LetsGo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "vehid")
	int vehId;
	
	@Column(name = "lat")
	double lat;
	
	@Column(name = "longitude")
	double longitude;
	
	
	
}
