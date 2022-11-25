package com.dbanalyzer.dbpkproject.manager.thread;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class ThreadForTasks extends Thread{

    private final Runnable task;

    @SneakyThrows
    @Override
    public void run() {
        task.run();
        Thread.sleep(1000);
    }
}
