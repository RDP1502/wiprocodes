package com.wipro.basic;

class Userorders {
	String customerName;
	String productName;
	String email;
	long phoneNumber;
	int quantity;
	String city;
	String state;
	float amount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void getOrderInfo() {
		System.out.println("Customer name is "+this.customerName + " his order of "+this.productName
				+this.amount+" is now processing and will ship to "+this.city+","+this.state);
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class Orders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userorders user1 = new Userorders();
		user1.customerName = "Rohan";
		user1.email = "rdpawar1511@gmail.com";
		user1.phoneNumber = 9096243673l;
		user1.productName = "hp laptop";
		user1.city = "sangli";
		user1.state = "Maharashtra";
		user1.amount = 45000;
		
		
		user1.getOrderInfo();
		System.out.println(user1.getPhoneNumber());
		System.out.println(user1.getAmount());
	}

}
