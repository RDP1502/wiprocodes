package com.wipro.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		List<Integer> numList = Arrays.asList(12,3,4,5,6,7);
		int finaNum = numList
				.stream()
				.reduce(0,(a,b)->(a+b));
	

				System.out.println(finaNum);

	}

}
