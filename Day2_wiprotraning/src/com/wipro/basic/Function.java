package com.wipro.basic;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println(this.color+" of "+this.type+" is cool");
	}
}

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "Ballpoint";
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "Gel";
		
		pen1.write();
		pen2.write();
		
		int x= 5;
		System.out.println(isEven(x));
		

	}
	public static boolean isEven(int a)
	{
		return a%2==0?true:false;
	}

}
