package com.wipro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wipro.exception.Employee;

public class CompareByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Atharv","1",23,20000.99);
		Employee emp2 = new Employee("Vinay", "2", 25, 40000.99);
		Employee emp3 = new Employee("Harsh", "21", 62, 60000.99);
		Employee emp4 = new Employee("Shreyash", "4", 26, 50000.99);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		Comparator<Employee> SortByempId = (o1, o2)->{
			return o1.compareTo(o2);
		};
		
		Collections.sort(empList, SortByempId);
		System.out.println(empList);
		

	}

}
