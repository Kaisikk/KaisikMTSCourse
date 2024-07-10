package com.kaisikk.java.kaisikmtscourse;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
                                                                           //  если true - хранит в порядке использования
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Kaisik", "Kaisikovich", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);

        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);

        System.out.println(lhm);

    }

}
