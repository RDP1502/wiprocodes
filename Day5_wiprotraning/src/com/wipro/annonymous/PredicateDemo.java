package com.wipro.annonymous;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> palindromeCheck= str ->{
			String reversed = new StringBuilder(str).reverse().toString();
			return str.equalsIgnoreCase(reversed);
		};
		
		System.out.println(palindromeCheck.test("madam"));

	}

}
