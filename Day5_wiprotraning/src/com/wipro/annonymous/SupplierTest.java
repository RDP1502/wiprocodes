package com.wipro.annonymous;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> tomorrow = ()->LocalDate.now().plusDays(1).getDayOfWeek().toString();
			
		System.out.println(tomorrow.get());
			
		};

	}


