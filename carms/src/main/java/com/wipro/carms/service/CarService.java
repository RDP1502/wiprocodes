package com.wipro.carms.service;

import java.util.List;

import com.wipro.carms.entity.Car;

public interface CarService {
	
	String save(Car car);
	List<Car> findAll();
	String update(int id, Car car);
	String delete(int id);
}
