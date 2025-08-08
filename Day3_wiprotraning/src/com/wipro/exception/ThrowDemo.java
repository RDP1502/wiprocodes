package com.wipro.exception;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(changeCurrency(0));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		

	}
	static int changeCurrency(int number) throws NumberFormatException {
		if(number==0) {
			throw new NumberFormatException("Number is zero");
		}
		return number *80;
		
		
	}

}
