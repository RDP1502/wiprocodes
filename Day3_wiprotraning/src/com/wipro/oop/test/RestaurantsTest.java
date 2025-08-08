package com.wipro.oop.test;

import com.wipro.oop.Restaurants;

public class RestaurantsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Restaurants restaurant1 = new Restaurants();
		Restaurants restaurant1 = new Restaurants("R123","StarRest","Sangli",5,"Best");
		System.out.println(restaurant1.toString());
		System.out.println(restaurant1.getRating());
	

	}

}
