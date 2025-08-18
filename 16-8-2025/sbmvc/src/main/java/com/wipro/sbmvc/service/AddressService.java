package com.wipro.sbmvc.service;

import java.util.List;

import com.wipro.sbmvc.entity.Address;

public interface AddressService {
	
	String save(Address address);
	List<Address> findAll();
	String update(int id, Address address);
	String delete(int id);
	

}
