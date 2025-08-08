package com.wipro.exception;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt1 = LocalDate.of(2023, 11, 10);
		LocalDate dt2 = LocalDate.of(2025, 1, 12);
		getDateDiff(dt1, dt2);
		

	}
	public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
		int d = dt1.getDayOfMonth() - dt2.getDayOfMonth();
		int m = dt1.getMonthValue() - dt2.getMonthValue();
		int y = dt1.getYear() - dt2.getYear();
			
		System.out.println("Year"+ y+" Month " +m+" Day " +d);
		
 }

}
