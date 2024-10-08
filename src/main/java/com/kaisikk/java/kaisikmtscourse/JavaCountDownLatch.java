package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.CountDownLatch;

public class JavaCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        // объект с определенным количеством потоков
        CountDownLatch countDownLatch = new CountDownLatch(3);
        countDownLatch.countDown();
        countDownLatch.await();
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        // ждем пока все свободные потоки закончат работать
        countDownLatch.await();
        System.out.println("all jobs done");
    }

}

class Work extends Thread {
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("done workl");
        // уменьшаем максимально возможное количество потоков
        countDownLatch.countDown();
    }
}
