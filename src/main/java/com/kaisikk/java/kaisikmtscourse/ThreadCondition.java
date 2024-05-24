package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCondition {

    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    public static void main(String[] args) {

        new AccountMinux().start();
        new AccountPlus().start();
    }

    static class AccountPlus extends Thread {

        @Override
        public void run() {
            lock.lock();
            account += 10;
            // сигнализируем, что поток отработал
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinux extends Thread {
        @Override
        public void run() {
            if (account < 10) {
                try {
                    lock.lock();
                    System.out.println(account);
                    // ждем пока поток отправит сигнал, что отработал
                    condition.await();
                    // продолжаем работу
                    System.out.println(account);
                    lock.unlock();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            account -= 10;
        }
    }

}
