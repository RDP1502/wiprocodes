package com.wipro.productmgt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productmgt.entity.Product;
import com.wipro.productmgt.repo.ProductRepo;
import com.wipro.productmgt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> optProduct = productRepo.findById(id);
		if(optProduct.isPresent()) {
			return optProduct.get();
		}
		return null;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		
		productRepo.save(product);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		productRepo.deleteById(id);

	}

}
