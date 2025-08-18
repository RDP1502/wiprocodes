package com.wipro.sbmvc.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "dept_id")
	String deptId;
	
	@Column(name = "dept_name")
	String deptName;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	@ToString.Exclude
	public List<Employee> employees;

}
