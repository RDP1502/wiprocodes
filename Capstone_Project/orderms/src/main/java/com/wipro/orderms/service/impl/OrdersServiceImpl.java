package com.wipro.orderms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderms.entity.OrderMaster;
import com.wipro.orderms.entity.Orders;
import com.wipro.orderms.repo.OrderMasterRepo;
import com.wipro.orderms.repo.OrderRepo;
import com.wipro.orderms.service.OrderService;

@Service
public class OrdersServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	OrderMasterRepo orderMasterRepo;
	
	@Autowired
	RestTemplate  restTemplate;
	
	@Autowired
	KafkaTemplate kafkaTemplate;

	@Override
	public ResponseEntity save(Orders orders) {
		// TODO Auto-generated method stub
		List<OrderMaster> orderMaster = orderMasterRepo.findAll();
		String orderId = null;
		if(orderMaster!= null) {
			OrderMaster orderMasterData =orderMaster.get(orderMaster.size()-1);
			int value=orderMasterData.getValue()+1;
			String strValue=String.format("%04d", value);
		    orderId="ORD-"+strValue;
			System.out.println(orderId);
			orderMasterData.setValue(value);
			orderMasterRepo.save(orderMasterData);
		}
		if(orders.getOrderStatus()!= "Successfull" && orders.getOrderStatus()!= "Cancelled") {
			orders.setOrderStatus("Pending");
			orderRepo.save(orders);
		}else {
			orderRepo.save(orders);
		}
		return new ResponseEntity<>("Order saved successfully", HttpStatus.OK);
	}

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-generated method stub
		Optional<Orders> savedOrder = orderRepo.findById(id);
		if(savedOrder.isPresent()) {
			return savedOrder.get();
		}else {
			return null;
		}	
	}

	@Override
	public ResponseEntity update(int orderId, Orders orders) {
		// TODO Auto-generated method stub
		Orders savedOrder = orderRepo.findByOrderId(orderId);
		if(savedOrder.getOrderId()== orderId && savedOrder.getOrderStatus() != "Successfull"
				&& savedOrder.getOrderStatus() != "Cancelled") {
			savedOrder.setItems(orders.getItems());
			savedOrder.setOrderDate(orders.getOrderDate());
			savedOrder.setOrderId(orders.getOrderId());
			savedOrder.setUserId(orders.getUserId());
			savedOrder.setTotalAmount(orders.getTotalAmount());
			orderRepo.save(savedOrder);
			return new ResponseEntity("Order updated successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Order not found", HttpStatus.NO_CONTENT);
		}
	}

	@Override
	public ResponseEntity delete(int id) {
		// TODO Auto-generated method stub
		Optional<Orders> extOrder = orderRepo.findById(id);
		if(extOrder.isPresent()) {
			orderRepo.deleteById(id);
			return new ResponseEntity<>("Order deleted successfully" , HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Order not found" , HttpStatus.NO_CONTENT);
		}
	}

	@Override
	public List<Orders> findByUserId(int userId) {
		// TODO Auto-generated method stub
		List<Orders> allOrders = orderRepo.findAll();
		List<Orders> userOrders=null;
		for(Orders orders:allOrders) {
			if(orders.getUserId()== userId) {
				userOrders.add(orders);
			}
		}
		
		return userOrders;
	}

}
