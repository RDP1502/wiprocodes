package com.wipro.exception;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> currencyCode= new TreeMap<>();
		currencyCode.put("USD", "United States Dollar");
		currencyCode.put("INR", "Indian Ruppee");
		currencyCode.put("EUR", "Euro");
		
		System.out.println(currencyCode);
		
		for(Map.Entry<String, String> data:currencyCode.entrySet())
		{
			System.out.println(data.getKey() +"-"+ data.getValue());
			
		}

	}

}
