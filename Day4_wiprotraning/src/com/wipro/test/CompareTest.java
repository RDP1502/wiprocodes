package com.wipro.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;

import com.wipro.exception.Employee;
import com.wipro.exception.SortByempAge;
import com.wipro.exception.SortByempId;
import com.wipro.exception.SortByempName;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Atharv","1234",23,20000.99);
		Employee emp2 = new Employee("Vinay", "1231", 25, 40000.99);
		Employee emp3 = new Employee("Harsh", "1221", 62, 60000.99);
		Employee emp4 = new Employee("Shreyash", "1131", 26, 50000.99);
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		Collections.sort(empList);
		System.out.println("Sorted by Employee Salary: "+empList);
		
		
		SortByempId byEmpId = new SortByempId();
		Collections.sort(empList, byEmpId);
		System.out.println("Sorted by Employee Id: "+empList);
		
		SortByempAge byempAge = new SortByempAge();
		Collections.sort(empList, byempAge);
		System.out.println("Sorted by Employee Age: "+empList);
		
		
		SortByempName byempName = new SortByempName();
		Collections.sort(empList, byempName);
		System.out.println("Sorted by Employee Name: "+ empList);
		
	}

}
