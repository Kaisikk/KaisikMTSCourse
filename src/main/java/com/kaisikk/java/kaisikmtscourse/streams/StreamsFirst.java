package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFirst {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela ?");
        list.add("Ok");
        list.add("poka");


        List<Integer> list2 = list.stream()
                // теперь стрим из int
                .map(String::length)
                .toList();

        // стрим из массива
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                }).toArray();

    }
}
