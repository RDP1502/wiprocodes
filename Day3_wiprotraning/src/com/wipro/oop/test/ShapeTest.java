package com.wipro.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setColor("Black");
		circle.setSides(0);
		System.out.println(circle);
		System.out.println(circle.getColor());
		System.out.println(circle.getSides());
		
		
		Rectangle rect = new Rectangle();
		rect.setColor("Blue");
		rect.setSides(4);
		System.out.println(rect);
		System.out.println(rect.getColor());
		System.out.println(rect.getSides());
		
		Square squ = new Square();
		squ.setColor("gold");
		squ.setSides(4);
		System.out.println(squ);
		
		
		
		

	

	}

}
