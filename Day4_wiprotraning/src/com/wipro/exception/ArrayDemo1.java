package com.wipro.exception;

import java.util.ArrayList;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0;i<5;i++) {
			list.add(i);
		}
		System.out.println(list);
		list.remove(2);
		list.add(1);
		System.out.println(list);

	}

}
