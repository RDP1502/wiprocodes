package com.wipro.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find the secound largest element in list
public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> numList = new ArrayList<>();
		List<Integer> numList1 = Arrays.asList(1,2,3,4,5);
//		System.out.println(numList1);
		int x=0;
		for(int num:numList1) {
			if(num>x) {
				x= num;
				
				//System.out.println(num);
			}
			
		}

	}
}
