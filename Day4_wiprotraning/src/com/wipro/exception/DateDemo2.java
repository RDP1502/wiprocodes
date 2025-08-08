package com.wipro.exception;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt1 = LocalDate.now();
		LocalDate dt = LocalDate.of(2024, 4, 5);
		
		System.out.println(isLeapYear(dt));
	}
	
	public static boolean isLeapYear(LocalDate dt) {
		int y = dt.getYear();
		if ((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0))){
			return true;
		}
		else {
			return false;
		}
	}

}
