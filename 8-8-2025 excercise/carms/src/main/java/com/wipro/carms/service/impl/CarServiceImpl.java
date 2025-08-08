package com.wipro.carms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carms.entity.Car;
import com.wipro.carms.repo.CarRepo;
import com.wipro.carms.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepo carRepo;

	@Override
	public String save(Car car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
		
		return "Saved Successfully";
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}

	@Override
	public String update(int id, Car car) {
		// TODO Auto-generated method stub
		Car existing = carRepo.findById(id).get();
		existing.setMake(car.getMake());
        existing.setCarRegistrationDetails(car.getCarRegistrationDetails());
        carRepo.save(existing);
		
		
		return "Updated Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		carRepo.deleteById(id);
		return "Deleted Successfully";
	}

}
