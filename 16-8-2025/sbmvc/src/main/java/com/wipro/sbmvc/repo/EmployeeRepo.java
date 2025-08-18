package com.wipro.sbmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.sbmvc.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByempName(String empName);

}
