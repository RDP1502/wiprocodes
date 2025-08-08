package com.wipro.test2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestDemo {
	
	
	
	   @Test
	    void test() {
	        String input = null;

	        assertThrows(NullPointerException.class, () -> {
	            input.toUpperCase();
	        });
	    }
}
