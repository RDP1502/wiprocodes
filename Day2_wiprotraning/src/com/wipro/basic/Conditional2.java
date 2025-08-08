package com.wipro.basic;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = -1;
		int absValue = Math.abs(value);
		System.out.println("Input Value is " + value);
		
		if((value<0))
		{
			System.out.println("Negative");
		}
		else if((value>0))
		{
			System.out.println("Postive");
		}
		else if(absValue<1)
		{
			System.out.println("Small");
		}
		else if(absValue>100000)
		{
			System.out.println("Large");
		}
		else 
		{
			System.out.println("other");
		}	

	}

}
