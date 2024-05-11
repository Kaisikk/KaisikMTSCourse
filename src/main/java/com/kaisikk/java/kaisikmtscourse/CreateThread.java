package com.kaisikk.java.kaisikmtscourse;

public class CreateThread {

    public static void main(String[] args) {
        MyThread newThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        newThread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("new Thread");
            someMehtod();
        }

        private void someMehtod() {
            throw new RuntimeException();
        }

    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("runnable");
        }
    }


}
