package com.wipro.test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.wipro.junit.JunitTests;

class FixturesTest {
	static JunitTests jUnit;
	static boolean val;
	@BeforeAll
	static void setUp() {
		
		jUnit = new JunitTests();
		val = jUnit.isEven(2);
		
	}

	@Test
	void test() {
		assertTrue(val);
	}

}
