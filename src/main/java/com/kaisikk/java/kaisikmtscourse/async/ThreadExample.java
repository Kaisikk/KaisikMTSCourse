package com.kaisikk.java.kaisikmtscourse.async;

public class ThreadExample {

    public static void main(String[] args) {
        new Thread(new AsyncExample(), "ExampleThread").start();

        Runnable runnable = () -> {

            System.out.println("Запуск имплементации Runnable");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.println("Поток имплементация Runnable отработал");

        };

    }

}
