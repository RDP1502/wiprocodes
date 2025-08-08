package com.wipro.annonymous;

import java.util.function.Consumer;

public class ComsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> nextNumer = (num)-> System.out.println(num+1);
		nextNumer.accept(13);

	}

}
