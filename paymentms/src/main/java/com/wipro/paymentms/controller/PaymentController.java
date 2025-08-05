package com.wipro.paymentms.controller;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.service.PaymentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping
	void save(@RequestBody Payment payment) {
		paymentService.save(payment);
	}
	
	@GetMapping
	List<Payment> findAll(){
		return paymentService.findAll();
	}
//	@GetMapping("/order/{orderId}")
//    public Payment getPaymentByOrderId(@PathVariable int orderId) {
//		return paymentService.;
//        // Return PaymentDTO
//    }
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable int id) {
		paymentService.delete(id);
	}

}
