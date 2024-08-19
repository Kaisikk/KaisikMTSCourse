package com.kaisikk.java.kaisikmtscourse.async;

public class AsyncExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Работа в первом потоке");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Поток отработал");
    }
}
