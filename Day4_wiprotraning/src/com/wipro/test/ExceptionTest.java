package com.wipro.test;

import com.wipro.exception.InvalidMonthException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkMonth(12);
		}
		catch(InvalidMonthException ex){
			
			
		}
		

	}
	static void checkMonth(int month) throws InvalidMonthException {
		if(month>12&&month<1) {
			throw new InvalidMonthException("Invalid Month") ;
			
		}
		else {
			System.out.println("Month is valid");
		}
	}

}
