package com.kaisikk.java.kaisikmtscourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(7);
        intList.add(52);
        intList.add(36);
        intList.add(78);
        intList.add(34);
        intList.add(-5);
        intList.add(9);
        intList.add(37);
        intList.add(58);
        intList.add(137);
        intList.add(936);
        intList.add(1037);

        Collections.sort(intList);


        // если ничего не найдет, то будет отрицательный индекс
        int index1 = Collections.binarySearch(intList, 58);


        List<Employe> employeList = new ArrayList<>();

        Employe employe1 = new Employe(1, "Kaisik", 10);
        Employe employe2 = new Employe(2, "Kamin", 10);
        Employe employe3 = new Employe(3, "Babur", 10);
        Employe employe4 = new Employe(7, "Zoomer", 10);
        Employe employe5 = new Employe(59, "Hackback", 10);
        Employe employe6 = new Employe(46, "Klima", 10);
        Employe employe7 = new Employe(5, "Healer", 10);
        Employe employe8 = new Employe(537, "Dps", 10);

        employeList.add(employe1);
        employeList.add(employe2);
        employeList.add(employe3);
        employeList.add(employe4);
        employeList.add(employe5);
        employeList.add(employe6);
        employeList.add(employe7);
        employeList.add(employe8);


        System.out.println(index1);

        Collections.sort(employeList);

        int index2 = Collections.binarySearch(employeList, new Employe(7, "Zoomer", 10));
        System.out.println(index2);

    }


}

class Employe implements Comparable<Employe> {

    int id;

    String name;

    int salary;

    public Employe(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employe o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

}
