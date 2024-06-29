package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.stream.Stream;

public class StreamsPeek {

    public static void main(String[] args) {

        Stream<Integer> intList = Stream.of(1,2,3,4,5,1,2,3);

        // peek применяется если не надо изменять состояние потока
        System.out.println(intList.distinct().peek(System.out::println).count());

    }

}
