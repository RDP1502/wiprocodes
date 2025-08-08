package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.wipro.stream.FoodItem;

public class FoodItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodItem item1 = new FoodItem("Frid Rice", "Veg","Chinese");
		FoodItem item2 = new FoodItem("Egg Rice", "Non Veg","Chinese");
		FoodItem item3 = new FoodItem("ContinentalFood1", "Veg","Continental");
		FoodItem item4 = new FoodItem("ContiFood Rice", "Veg","Continental");
		FoodItem item5 = new FoodItem("Thai Rice", "Veg","Thai");
		FoodItem item6 = new FoodItem("Thai Rice", "Veg","Thai");
		
		Comparator<? super String> comp= (a,b)->{
			return a.compareTo(b);
		};
		
		
		List<String> foodList = new ArrayList<>();
		
		
		List<String> chineseList = foodList
				.stream()
				.filter(f->f.equalsIgnoreCase("Chinese"))
				.peek(c->c.toCharArray())
				.sorted(comp)	
				.collect(Collectors.toList());
		System.out.println(chineseList);
		

	}

}
