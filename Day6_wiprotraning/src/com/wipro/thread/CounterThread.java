package com.wipro.thread;

public class CounterThread extends Thread {
	
	public Counter counter;
	
	public CounterThread(Counter counter2) {
		// TODO Auto-generated constructor stub
		this.counter = counter2;
	}

	 public void run() {
		 for(int i=0;i<10;i++) {
			 counter.increment();
			 try {
				 CounterThread.sleep(1000);
			 }
			 catch(InterruptedException e){
				 System.out.println(e);
				 
			 }
			
		 }
	
	}
}
//