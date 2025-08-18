package com.wipro.sbmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sbmvc.entity.Address;
import com.wipro.sbmvc.repo.AddressRepo;
import com.wipro.sbmvc.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepo addressRepo;
	

	@Override
	public String save(Address address) {
		// TODO Auto-generated method stub
		addressRepo.save(address);
		
		return "Saved Successfully";
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}

	@Override
	public String update(int id, Address address) {
		// TODO Auto-generated method stub
		try {
		Address existing = addressRepo.findById(id).get();
		existing.setCity(address.getCity());
		existing.setState(address.getState());
		existing.setZipcode(address.getZipcode());
		} catch(RuntimeException ex) {
			return "Address not found";
		}
		return "Updated Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if(!addressRepo.existsById(id)) {
			return "Address not Found";
		}
		addressRepo.deleteById(id);
		return "Deleted Successfully";
	}

}
