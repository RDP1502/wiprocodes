package com.wipro.oop.test;

import com.wipro.oop.Converter;

public class ConvertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter first = new Converter();
		System.out.println(first.convert(1));
		System.out.println(first.convert(1, 2));
		System.out.println(first.convert(4.5));

	}
}