package com.wipro.oop;

public class Restaurants {
	String restaurantId;
	String restaurantName;
	String restaurantAddress;
	int rating;
	String review;
	
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	public Restaurants(String restaurantId, String restaurantName, String restaurantAddress, int rating,
			String review) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
		this.review = review;
	}
	public Restaurants(String restaurantId, String restaurantName) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
	}
	@Override
	public String toString() {
		return "Restaurants [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantAddress=" + restaurantAddress + ", rating=" + rating + ", review=" + review + "]";
	}
	
	
	
		
	}
	

