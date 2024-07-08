package com.kaisikk.java.kaisikmtscourse;

import java.util.TreeMap;

public class MapTree {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Kaisik", "Kaisikovich", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasya", "Smirnov", 1);
        Student st6 = new Student("Sanya", "Kapustin", 3);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.9, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.1, st5);
        treeMap.put(7.2, st6);

        System.out.println(treeMap);

        System.out.println(treeMap.get(6.4));

        treeMap.remove(7.5);

        // сортировка по убыванию
        System.out.println(treeMap.descendingMap());

        // вывести больше чем 7.3
        System.out.println(treeMap.tailMap(7.3));

        // выведет меньше чем 5.2
        System.out.println(treeMap.headMap(5.2));

        // последний элемент
        System.out.println(treeMap.lastEntry());

        // вывести в начале
        treeMap.firstEntry();

    }

}
