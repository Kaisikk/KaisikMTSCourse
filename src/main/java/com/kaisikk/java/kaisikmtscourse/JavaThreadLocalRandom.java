package com.kaisikk.java.kaisikmtscourse;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JavaThreadLocalRandom {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ThreadLocalRandom.current().nextInt());

        System.out.println(TimeUnit.DAYS.toMillis(14));
    }

}
