package com.wipro.foodms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.foodms.entity.Food;

public interface FoodRepo extends JpaRepository<Food, Integer>{


}
