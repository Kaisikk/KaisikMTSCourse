package com.kaisikk.java.kaisikmtscourse.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaPartioning {

    public static void main(String[] args) {

        LambdaStudent st1 = new LambdaStudent("Ivan", 'm', 22, 3, 8.3);
        LambdaStudent st2 = new LambdaStudent("Kolya", 'm', 28, 2, 6.4);
        LambdaStudent st3 = new LambdaStudent("Elena", 'f', 19, 1, 8.9);
        LambdaStudent st4 = new LambdaStudent("Petr", 'm', 35, 4, 7.0);
        LambdaStudent st5 = new LambdaStudent("Marya", 'f', 23, 3, 9.1);

        List<LambdaStudent> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Map<Integer, List<LambdaStudent>> map = studentList.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCource()));

        for (Map.Entry<Integer, List<LambdaStudent>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

    }


}
