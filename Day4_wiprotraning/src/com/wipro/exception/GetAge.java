package com.wipro.exception;

import java.time.LocalDate;

public class GetAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dt = LocalDate.of(2002, 11, 15);
		System.out.println(getAge(dt));
		

	}
	public static int getAge(LocalDate dt) {
		LocalDate dt2 = LocalDate.now();
		int age = dt2.getYear() - dt.getYear();
		return age;
		
	}

}
