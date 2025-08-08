package com.wipro.fileio;

public class PhonePay implements Payment{
	
	
	public void doPayment(double amount){
		System.out.println("Done by PhonePay");
		
	}
	public void takePayment(double amount) {
		System.out.println("Recived in PhonePay");
	}

}
