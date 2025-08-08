package com.wipro.thread;

public class ThreadDemo extends Thread {
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.print(i);
		}
		
	}

}
