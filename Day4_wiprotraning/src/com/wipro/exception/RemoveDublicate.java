package com.wipro.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		Set<Integer> set1 = new HashSet<>();
		set1.addAll(list);
		System.out.println(set1);
		
		

	}

}
