package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class JavaCyclicBarrier {

    public static void main(String[] args) {

        // объект чтобы одновременно запустить несколько потоков
        // ждет пока 3 потока не вызовут await
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());

        new SportsMan(cyclicBarrier);
        new SportsMan(cyclicBarrier);
        new SportsMan(cyclicBarrier);
    }

    static class Run extends Thread {

        @Override
        public void run() {
            System.out.println("run is begun");
        }
    }

    static class SportsMan extends Thread {
        CyclicBarrier cyclicBarrier;

        public SportsMan(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {
            try {
                // вызов метода await
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
