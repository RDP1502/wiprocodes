package com.wipro.fileio;

import java.util.Scanner;

public class ShopTestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1 for gpay 2 for phonepay: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			Payment gpay = new Gpay();
			
		}
		else if(n ==2) {
			Payment phonePay = new PhonePay();
			
		}

	}

}
