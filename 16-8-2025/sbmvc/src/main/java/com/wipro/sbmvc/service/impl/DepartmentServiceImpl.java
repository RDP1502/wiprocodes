package com.wipro.sbmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sbmvc.entity.Department;
import com.wipro.sbmvc.repo.DepartmentRepo;
import com.wipro.sbmvc.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepo deptRepo;

	@Override
	public String save(Department department) {
		// TODO Auto-generated method stub
		
		deptRepo.save(department);
		
		return "Saved Successfully";
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		
		return deptRepo.findAll();
	}

	@Override
	public Department findById(int id) {
		// TODO Auto-generated method stub
		
		
		return deptRepo.findById(id).get();
	}

	@Override
	public String update(int id, Department department) {
		// TODO Auto-generated method stub
		try {
		Department existing = new Department();
		existing.setDeptName(department.getDeptName());
		existing.setDeptId(department.getDeptId());
		
		}catch(RuntimeException ex) {
			return "Department Not Found";
		}
		return "Updated Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if(!deptRepo.existsById(id)) {
			return "Department not Found";
		}
		deptRepo.deleteById(id);
		return "Deleted the department";
	}

}
