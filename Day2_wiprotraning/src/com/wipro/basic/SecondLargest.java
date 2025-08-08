package com.wipro.basic;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {2, 7, 11, 15};
		int target = 9;
		int[] added = {0,0};
		for(int i=0; i<value.length;i++)
		{
			if(((i+1)<value.length)&& ((value[i]+value[i+1] == target)))
			{
				added[0] = i;
				added[1] = i+1;
			}
		}
		
		System.out.println(added[0]+""+added[1]);
	}
}
