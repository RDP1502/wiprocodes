package com.wipro.sbmvc.service;

import java.util.List;

import com.wipro.sbmvc.entity.Employee;

public interface EmployeeService {
	
	String save(Employee employee);
	List<Employee> findAll();
	List<Employee> findByName(String empName);
	Employee findById(int id);
	String update(int id, Employee employee);
	String delete(int id);
	

}
