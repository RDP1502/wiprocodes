package com.wipro.fileio;

public class Gpay implements Payment{
	
	public void doPayment(double amount) {
		System.out.println("Done by gpay");
		
	}
	
	public void takePayment(double amount) {
		System.out.println("Recived in Gpay");
	}
	
	
	
}
