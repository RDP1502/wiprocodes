package com.wipro.oop;

public abstract class Animal {
	String name;
	String gender;
	int numEye;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getNumEye() {
		return numEye;
	}
	public void setNumEye(int numLag) {
		this.numEye = numLag;
	}
	public abstract void see(int numEye);
	@Override
	public String toString() {
		return "Animal [name=" + name + ", gender=" + gender + ", numEye=" + numEye + "]";
	}

	
	
	

	
}
