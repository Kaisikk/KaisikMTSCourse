package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.stream.Stream;

public class StreamsCount {

    public static void main(String[] args) {
        Stream<Integer> intList = Stream.of(1,2,3,4,5,1,2,3);

        System.out.println(intList.count());

    }


}
