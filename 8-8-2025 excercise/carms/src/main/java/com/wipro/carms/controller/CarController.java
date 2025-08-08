package com.wipro.carms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.carms.entity.Car;
import com.wipro.carms.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping
	public String save(@RequestBody Car car) {
		return carService.save(car);
	}
	
	@GetMapping
	public List<Car> findAll(){
		return carService.findAll();
	}
	
	@PutMapping("{id}")
	public String update(@PathVariable int id, @RequestBody Car car) {
		return carService.update(id, car);
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable int id) {
		return carService.delete(id);
	}
	
	

}
