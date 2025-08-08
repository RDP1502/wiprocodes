package com.wipro.test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Example {
	
	String expected = "Junit";
	String actual = "Junit";

	@Test
	public void test() {
		assertEquals(expected, actual);
	}
	@Test
	public void test1() {
		assertSame(expected, actual);
	}

}
