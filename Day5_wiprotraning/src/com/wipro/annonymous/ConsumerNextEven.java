package com.wipro.annonymous;

import java.util.function.Consumer;

public class ConsumerNextEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> nextEven = (num) -> System.out.println(num%2!=0? num+1:num);
		nextEven.accept(5);

	}

}
