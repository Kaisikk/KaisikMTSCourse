package com.kaisikk.java.kaisikmtscourse;

public class VolatileTest {


    // volatile делает так чтобы переменные не кешировались в потоках
    volatile static int i = 0;

    public static void main(String[] args) {

        new MyThread().start();
        new MyThreadRead().start();

    }


    static class MyThread extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }
    }

}
