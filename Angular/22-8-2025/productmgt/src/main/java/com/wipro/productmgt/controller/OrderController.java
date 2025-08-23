package com.wipro.productmgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmgt.entity.Order;
import com.wipro.productmgt.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PatchMapping("/{id}")
	void placeOrder(@PathVariable int id, @RequestBody int quantity ) {
		orderService.purchaseProduct(id, quantity);
		
	}
	
	@GetMapping
	List<Order> findAll(){
		return orderService.findAll();
	}

}
