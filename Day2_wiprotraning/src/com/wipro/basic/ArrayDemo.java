package com.wipro.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {100,67,98,678,45,123};
		int value=0;
		for(int i=0;i<number.length;i++)
		{
		if(value<number[i])
		{
			value=number[i];
		}
		}
		System.out.println(value);
	}

}
