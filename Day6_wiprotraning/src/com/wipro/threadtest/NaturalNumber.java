package com.wipro.threadtest;

import com.wipro.thread.ThreadDemo;
import com.wipro.thread.ThreadDemo1;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo1 thread2 = new ThreadDemo1();
		
		
		thread1.start();
		
		try {
			thread1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
