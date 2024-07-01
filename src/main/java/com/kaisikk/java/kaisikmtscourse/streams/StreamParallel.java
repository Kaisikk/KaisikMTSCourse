package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        // параллельный стрим
        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();

        System.out.println(sumResult);

    }


}
