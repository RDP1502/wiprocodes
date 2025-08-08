package com.wipro.annonymous;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Double, Double> giveFra = num-> (num-Math.floor(num));
		System.out.println(giveFra.apply(123.45));

	}

}
