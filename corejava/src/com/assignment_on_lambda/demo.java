package com.assignment_on_lambda;

public class demo {

	public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        taskScheduler.scheduleTask(() -> System.out.println("Task 1 executed"), 2);
        taskScheduler.scheduleTask(() -> System.out.println("Task 2 executed"), 5); 
        taskScheduler.scheduleTask(() -> System.out.println("Task 3 executed"), 10); 
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        taskScheduler.stop();
    }
}
