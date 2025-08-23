package com.wipro.productmgt.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgt.entity.Order;
import com.wipro.productmgt.entity.Product;
import com.wipro.productmgt.repo.OrderRepo;
import com.wipro.productmgt.repo.ProductRepo;
import com.wipro.productmgt.service.OrderService;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	ProductRepo productRepo;

	@Transactional
	@Override
	public void purchaseProduct(int productId, int orderQuantity) {
		// TODO Auto-generated method stub
		
		Product existingProduct = new Product();
		Order newOrder = new Order();
		existingProduct = productRepo.findById(productId).get();
		int productQuantity = existingProduct.getQuantity();
		if(productQuantity >= orderQuantity && orderQuantity >0) {
			existingProduct.setQuantity(productQuantity-orderQuantity);
			newOrder.setDate(LocalDate.now());
			newOrder.setOrderQuantity(orderQuantity);
			newOrder.setProductName(existingProduct.getName());
			newOrder.setProductId(existingProduct.getId());
			
			productRepo.save(existingProduct);
			orderRepo.save(newOrder);
		}

	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

}
