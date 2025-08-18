package com.wipro.sbmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sbmvc.entity.Address;
import com.wipro.sbmvc.entity.Department;
import com.wipro.sbmvc.entity.Employee;
import com.wipro.sbmvc.repo.EmployeeRepo;
import com.wipro.sbmvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public String save(Employee employee) {
		// TODO Auto-generated method stub
		if("CONTRACT".equalsIgnoreCase(employee.getEmpType())) {
			
			Department defaultDept = new Department();
			
			employee.setEmpSalary(15000);
			defaultDept.setDeptId("Dept001");
			defaultDept.setDeptName("Contract Department");
			employee.setDepartment(defaultDept);
		}
		
		empRepo.save(employee);
		return "Saved Successfully";
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		
		return empRepo.findByempName(empName);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public String update(int id , Employee employee) {
		try {
		Employee existing = empRepo.findById(id).get();
		existing.setEmpName(employee.getEmpName());
		existing.setEmpId(employee.getEmpId());
		existing.setEmpEmail(employee.getEmpEmail());
		existing.setEmpSalary(employee.getEmpSalary());
		existing.setEmpType(employee.getEmpType());
		existing.setAddress(employee.getAddress());
		existing.setDepartment(employee.getDepartment());
		
		empRepo.save(existing);
		
		} catch(RuntimeException ex) {
			return "Employee not found";
		}
		
		
		
		return "Updated Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if(!empRepo.existsById(id)) {
			throw new RuntimeException("Employee not found with id: " + id);
		}
		empRepo.deleteById(id);
		return "Deleted Successfully";
	}

}
