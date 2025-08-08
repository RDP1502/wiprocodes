package com.wipro.thread;

public class ThreadDemo1 extends Thread {
	public void run() {
		
		for(char i='a';i<='j';i++) {
			System.out.print(i);
		}
		
	}

}


