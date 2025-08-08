package com.wipro.test2;

import static org.junit.jupiter.api.Assertions.*;
//Create a Junit Test case to check if a String is in uppercase or not.

import org.junit.jupiter.api.Test;

class UpperOrNot {
	String str = "rohan";

	@Test
	void test() {
		assertTrue(str.equals(str.toUpperCase()));	
	}

}
