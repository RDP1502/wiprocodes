package com.wipro.annonymous;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> fn = s->{return s.length();};
		System.out.println(fn.apply("Rohan"));
		
		Function<String, String> fn1 = s->{return s.toUpperCase();};
		System.out.println(fn1.apply("Rohan"));
		
		List<Integer> numList = Arrays.asList(1,2,3,4);
		Function<List<Integer>, Integer> dosum =list->{
			int sum = 0;
			for(int i:list) {
				sum=sum+i;
			}
			return sum;
		};
		int sumval = dosum.apply(numList);
		System.out.println(sumval);
	}

}
