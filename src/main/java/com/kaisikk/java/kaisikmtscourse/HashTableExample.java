package com.kaisikk.java.kaisikmtscourse;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {

        // хэш таблица синхронизированная, в отличие от мапы
        Hashtable table = new Hashtable();

        table.put(1, "abc");
        table.put("12345test", "test");


        System.out.println(table);
        System.out.println(new Integer(1).hashCode());
        System.out.println("StringHash".hashCode());

        Enumeration elements = table.elements();

        Enumeration keys = table.keys();

        while (elements.hasMoreElements()) {
            System.out.println("Object value is: " + elements.nextElement());
        }

        while (keys.hasMoreElements()) {
            System.out.println("Key = " + keys.nextElement());
        }

    }

}
