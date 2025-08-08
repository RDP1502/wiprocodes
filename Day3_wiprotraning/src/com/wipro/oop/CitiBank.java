package com.wipro.oop;

public class CitiBank implements BankOps {

	@Override
	public void deposite(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("Depositing money in your account");
		
	}

	@Override
	public double withdraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("Taking money from HDFC Bank");
		return 0;
	}
    
	

}
