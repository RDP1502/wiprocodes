package com.wipro.oop;

public class Shape {
	String color;
	int sides;
	@Override
	public String toString() {
		return "Shape [color=" + color + ", sides=" + sides + "]";
	}
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(String color, int sides) {
		super();
		this.color = color;
		this.sides = sides;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}

	

}
