package com.wipro.exception;

import java.util.HashSet;
import java.util.Set;

public class Differenceset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		Set <Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set1.removeAll(set2);
		System.out.println(set1);
		

	}

}
