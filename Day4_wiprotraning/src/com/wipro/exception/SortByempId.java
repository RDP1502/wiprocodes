package com.wipro.exception;

import java.util.Comparator;

public class SortByempId implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId().compareTo(o2.getEmpId());
	}
}
