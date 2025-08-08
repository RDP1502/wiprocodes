package com.wipro.exception;

import java.util.Comparator;

public class SortByempAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getEmpAge(), o2.getEmpAge());
		//return o1.getEmpAge().compareTo(o2.getEmpAge());
	}
	
}
