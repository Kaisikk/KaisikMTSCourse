package com.kaisikk.java.kaisikmtscourse;

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
    }

}
