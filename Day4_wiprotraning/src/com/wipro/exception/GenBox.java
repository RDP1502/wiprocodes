package com.wipro.exception;

public class GenBox <T>{
	T t;
	public void addObject(T t) {
		
		this.t = t;
	}
	
	public void getObject() {
		System.out.println(t);
	}

}
