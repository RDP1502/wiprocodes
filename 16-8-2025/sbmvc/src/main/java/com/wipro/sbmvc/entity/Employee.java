package com.wipro.sbmvc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "emp_id")
	String empId;
	
	@Column(name = "emp_name")
	String empName;
	
	@Column(name = "emp_email")
	String empEmail;
	
	@Column(name = "emp_salary")
	double empSalary;
	
	@Column(name = "emp_type")
	String empType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	@JsonManagedReference
	@ToString.Exclude
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	@JsonBackReference
	@ToString.Exclude
	public Department department;

}
