package com.wipro.exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = null;
		try {
			fname.toUpperCase();
		}
		catch(NullPointerException ex) {
			System.out.println("You are trying to change in null");
		}
					
	}

}
