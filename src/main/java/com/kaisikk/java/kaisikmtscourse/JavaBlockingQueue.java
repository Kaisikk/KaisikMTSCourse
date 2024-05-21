package com.kaisikk.java.kaisikmtscourse;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class JavaBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();


        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                queue.add("this is string");
            }
        }.start();

    }

}
