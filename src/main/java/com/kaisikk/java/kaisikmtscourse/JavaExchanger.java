package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.Exchanger;

public class JavaExchanger {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Mike(exchanger);
        new Anket(exchanger);

    }

    static class Mike extends Thread {
        Exchanger<String> exchanger = new Exchanger();

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {

            try {
                exchanger.exchange("Hi, my name is Mike");
                sleep(3000);
                exchanger.exchange("Im 20 years old");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    static class Anket extends Thread {
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


}
