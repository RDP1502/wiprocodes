package com.wipro.fileio;

import java.util.Arrays;

import java.util.List;

public class EmployeesDemo {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("John", 25, 40000),
	            new Employee("Alice", 35, 60000),
	            new Employee("Bob", 40, 70000),
	            new Employee("Charlie", 20, 30000),
	            new Employee("David", 38, 55000)
	        );

	         List<Employee>list = employees.stream()
	        		 .filter(e->e.getEmpAge()>30&&e.getEmpSalary()>50000).toList();
	         System.out.println();
 	
	    }
	}

//
