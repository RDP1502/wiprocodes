package com.wipro.thread;

public class Counter {
	int counter = 0;
	
       synchronized int increment() {
		return counter++;
		
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + "]";
	}

	

	public Counter() {
		// TODO Auto-generated constructor stub
	}
	

}
