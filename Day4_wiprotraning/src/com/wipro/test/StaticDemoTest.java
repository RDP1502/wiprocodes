package com.wipro.test;

import com.wipro.exception.StaticDemo;

public class StaticDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo demo1 = new StaticDemo();
		demo1.staticData = 11; // used for show the data
		demo1.nonStaticData = 12; // used for hide the data 
		
		StaticDemo demo2  = new StaticDemo();
		System.out.println(demo2.staticData);
		System.out.println(demo2.nonStaticData);
		
		

	}

}
