package com.wipro.threadtest;

import com.wipro.thread.Counter;
import com.wipro.thread.CounterThread;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		CounterThread ct = new CounterThread(counter);
		CounterThread ct1 = new CounterThread(counter);
		
		
		ct.start();
		ct1.start();
		try {
			
			ct.join();
			ct1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(counter.getCounter());

	}

}
