package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.Phaser;

public class JavaPhaser {

    public static void main(String[] args) {
        // объект чтобы обрабатыать потоки по очереди
        Phaser phaser = new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);
    }

    static class Washer extends Thread {
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " washing the car");
                phaser.arriveAndAwaitAdvance();
            }

        }
    }

}
