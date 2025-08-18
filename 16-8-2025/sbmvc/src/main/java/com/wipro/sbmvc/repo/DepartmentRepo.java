package com.wipro.sbmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.sbmvc.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
