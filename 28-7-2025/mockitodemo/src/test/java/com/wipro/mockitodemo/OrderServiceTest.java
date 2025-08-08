package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class OrderServiceTest {

	@Test
	void test() {
		OrderService order = mock(OrderService.class);
		when(order.placeOrder("“ORD-01”")).thenReturn("Successfull");
		String str = order.placeOrder("“ORD-01”");
		assertEquals(str, "Successfull" );
	}
}
