package com.wipro.exception;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt = LocalDate.of(2023, Month.NOVEMBER, 1);
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dtNew = dt.format(dateFormatter);
		
		System.out.println("Formatted Date: " + dtNew);
	}

}
