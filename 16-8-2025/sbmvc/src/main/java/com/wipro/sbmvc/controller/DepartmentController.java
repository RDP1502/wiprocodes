package com.wipro.sbmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sbmvc.entity.Department;
import com.wipro.sbmvc.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@PostMapping
	public String save(@RequestBody Department dept) {
		return deptService.save(dept);
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable int id, @RequestBody Department dept) {
		return deptService.update(id, dept);
	}
	
	@GetMapping
	public List<Department> findAll(){
		return deptService.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Department getById(@PathVariable int id) {
		return deptService.findById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable int id) {
		return deptService.delete(id);
	}
	
	   @GetMapping("/list")
	    public String listDepartments(Model model) {
	        model.addAttribute("departments", deptService.findAll());
	        return "department-list"; // maps to /WEB-INF/views/department-list.jsp
	    }

}
