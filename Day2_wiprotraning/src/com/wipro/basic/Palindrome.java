package com.wipro.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rohan";
		int vC = 0;
		int cC = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			ch = Character.toLowerCase(ch);
			if(ch =='a'|| ch =='e'|| ch=='i'||ch=='o'|| ch=='u') {
				vC++;
			}
			else {
				cC++;
			}
			
		}
		System.out.println("Vowels : "+vC);
		System.out.println("Consonant : "+cC);	
	}
}
