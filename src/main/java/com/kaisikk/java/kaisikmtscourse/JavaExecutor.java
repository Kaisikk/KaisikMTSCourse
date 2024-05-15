package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyCallable());
        executorService.shutdown();
    }


    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "2";
        }
    }

}
