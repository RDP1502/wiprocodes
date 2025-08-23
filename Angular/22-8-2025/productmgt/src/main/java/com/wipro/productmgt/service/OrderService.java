package com.wipro.productmgt.service;

import java.util.List;

import com.wipro.productmgt.entity.Order;

public interface OrderService {
	
	void purchaseProduct(int productId, int orderQuantity);
	List<Order> findAll();

}
