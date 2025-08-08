package com.wipro.annonymous;

public class MultiplyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiply mul = (a,b)->{return a*b;};
		int x = mul.intmultiply(3, 4);
		System.out.println(x);

	}

}
