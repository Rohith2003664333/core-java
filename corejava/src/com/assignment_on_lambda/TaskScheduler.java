package com.assignment_on_lambda;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler;

    public TaskScheduler() {
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void scheduleTask(Task task, int interval) {
        scheduler.scheduleAtFixedRate(task::execute, 0, interval, TimeUnit.SECONDS);
    }

    public void stop() {
        scheduler.shutdown();
    }

}


