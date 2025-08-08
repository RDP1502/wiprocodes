package com.wipro.stream;

public class FoodItem {
	
	String FoodName;
	String FoodType;
	String Cuisine;
	
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getFoodType() {
		return FoodType;
	}
	public void setFoodType(String foodType) {
		FoodType = foodType;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	public FoodItem(String foodName, String foodType, String cuisine) {
		super();
		FoodName = foodName;
		FoodType = foodType;
		Cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "FoodItem [FoodName=" + FoodName + ", FoodType=" + FoodType + ", Cuisine=" + Cuisine + "]";
	}
	public int compareTo(FoodItem b) {
		// TODO Auto-generated method stub
		return this.getCuisine().compareTo(b.getCuisine());
	}
	
	
}
