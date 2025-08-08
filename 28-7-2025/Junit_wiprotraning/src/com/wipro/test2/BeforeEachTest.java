package com.wipro.test2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.junit.JunitTests;


class BeforeEachTest {
	
	
	static int value1;
	static JunitTests jTest;
	@BeforeAll
	
	static void setup() {
		jTest = new JunitTests();
		
	}
	
	@Test
	void test() {
		
		assertTrue(jTest.isEven(4));
	}
	@Test
	void test1() {
		assertFalse(jTest.isEven(4));
	}
}
