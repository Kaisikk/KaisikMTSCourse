package com.kaisikk.java.kaisikmtscourse;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Ilya", "Kaisik", 2);
        Student st2 = new Student("Gregory", "Briggs", 4);
        Student st3 = new Student("Zaur", "Kamin", 1);
        Student st4 = new Student("Nekit", "Babur", 3);
        Student st5 = new Student("Vito", "Klirik", 5);

        treeMap.put(5.8, st1);
        treeMap.put(7.2, st3);
        treeMap.put(7.9, st5);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);

        System.out.println(treeMap);
        System.out.println(treeMap.get(5.8));
        System.out.println(5.9);

        // реверс по ключам
        System.out.println(treeMap.descendingMap());

        // получение только того, у кого ключ выше или равен переданному значению
        System.out.println(treeMap.tailMap(7.5));

        // вывод только тех, у кого ключ меньше переданного значения
        System.out.println(treeMap.headMap(7.2));

        // получение самого последнего элемента
        System.out.println(treeMap.lastEntry());

        // вывод первого элемента
        System.out.println(treeMap.firstEntry());
    }


}
