package com.wipro.oop.test;
import com.wipro.oop.PaymentMethod;
import com.wipro.oop.PhonePay;
import com.wipro.oop.Gpay;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentMethod payThrough = new Gpay();
		payThrough.pay(20.0);
		payThrough.pay(2);
		payThrough = new PhonePay();
		payThrough.pay(29.9);
		
	}

}
