package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValue {

    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        for (int j = 0; j < 10000; j++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        System.out.println(i.get());

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            i.incrementAndGet();
        }
    }

}
