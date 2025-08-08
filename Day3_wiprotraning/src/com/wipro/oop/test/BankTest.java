package com.wipro.oop.test;

import com.wipro.oop.CitiBank;
import com.wipro.oop.HdfcBank;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank hdfcUser = new HdfcBank();
		CitiBank citiUser = new CitiBank();
		
		hdfcUser.deposite(5000, "442266");
		citiUser.deposite(4000, "45455");
		hdfcUser.withdraw(400, "442266");
		citiUser.withdraw(503, "454555");
		
	}

}
