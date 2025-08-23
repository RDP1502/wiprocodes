package com.wipro.productmgt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productmgt.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
	

}
