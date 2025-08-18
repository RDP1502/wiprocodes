package com.wipro.sbmvc.service;

import java.util.List;

import com.wipro.sbmvc.entity.Department;

public interface DepartmentService {
	
	String save(Department department);
	List<Department> findAll();
	Department findById(int id);
	String update(int id, Department department);
	String delete(int id);
	

}
