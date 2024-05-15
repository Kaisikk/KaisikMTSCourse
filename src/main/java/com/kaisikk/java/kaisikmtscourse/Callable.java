package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        java.util.concurrent.Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class MyCallable implements java.util.concurrent.Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i < 10; i++, j++) {
                Thread.sleep(300);
            }
            return j;
        }
    }

}
