package com.kaisikk.java.kaisikmtscourse.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsSecond {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream()
                // accumulator что-то накапливает
                .reduce((accumulator, element) ->
                        accumulator * element).get();
        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream()
                .reduce((accumulator, element) ->
                        accumulator * element);

        if(o.isPresent()){
            System.out.println(o.get());
        } else {
            System.out.println("Ничего нет");
        }

        // 1 - изначальное значение аккумулятора
        int result2 =  list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);

        System.out.println(result2);



    }


}
