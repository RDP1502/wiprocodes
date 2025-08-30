package com.wipro.productms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.productms.entity.Product;
import com.wipro.productms.repo.ProductRepo;
import com.wipro.productms.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public ResponseEntity save(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		
		return new ResponseEntity<>("Product details saved sucessfully", HttpStatus.OK);
	}

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
	public ResponseEntity update(int id, Product product) {
		// TODO Auto-generated method stub
		Optional<Product> extProduct = productRepo.findById(id);
		if(extProduct.isPresent()) {
			Product savedProduct = extProduct.get();
			savedProduct.setProductName(product.getProductName());
			savedProduct.setProductDesc(product.getProductDesc());
			savedProduct.setMake(product.getMake());
			savedProduct.setProductCat(product.getProductCat());
			savedProduct.setAvailableQty(product.getAvailableQty());
			savedProduct.setDateOfManufacture(product.getDateOfManufacture());
			savedProduct.setImgUrl(product.getImgUrl());
			savedProduct.setPrice(product.getPrice());
			savedProduct.setProdRating(product.getProdRating());
			savedProduct.setUom(product.getUom());
			productRepo.save(savedProduct);
			return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Product not found", HttpStatus.NO_CONTENT);
		}
		
	}

	@Override
	public ResponseEntity delete(int id) {
		// TODO Auto-generated method stub
		Optional<Product> optProduct = productRepo.findById(id);
		if(optProduct.isPresent()) {
			productRepo.deleteById(id);
			return new ResponseEntity<>("Product is deleted", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Product not found", HttpStatus.NO_CONTENT);
		}
	}
}
