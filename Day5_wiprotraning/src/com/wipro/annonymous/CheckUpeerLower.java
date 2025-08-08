package com.wipro.annonymous;

import java.util.function.Predicate;

public class CheckUpeerLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkUperLower = str ->{
			if (str.equals(str.toLowerCase())){
				return true;
				
			}
			else {
				return false;
			}
			
		};
		 
			System.out.println(checkUperLower.test("fine"));

	}

}
