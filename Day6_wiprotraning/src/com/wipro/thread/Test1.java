package com.wipro.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int j = 1; j <= 5; j++) {
            int taskId = j; // capture the value of j for each lambda
            ex.submit(() -> {
                System.out.println("Starting Task-" + taskId);
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Task-" + taskId + " : " + i);
                    try {
                        Thread.sleep(1000); // 1-second delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Completed Task-" + taskId);
            });
        }
		ex.shutdown();
	}

}
