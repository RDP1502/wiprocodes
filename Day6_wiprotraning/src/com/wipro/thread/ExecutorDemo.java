package com.wipro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for(int j=1;j<=5;j++) {
			int taskId = j;
			ex.submit(()->{
				for(int i=1;i<=10;i++) {
					System.out.println("Task  - "+" "+taskId+" for "+ i);
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Task Completed "+ taskId);
			});
		}
		ex.shutdown();
		

	}

}
