package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDistinct {


    public static void main(String[] args) {

        Stream<Integer> intList = Stream.of(1,2,3,4,5,1,2,3);

        intList
                // оставляет только уникальные элементы проверяя с помощью equals
                .distinct()
                .forEach(System.out::println);

    }


}
