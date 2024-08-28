package com.kaisikk.java.kaisikmtscourse.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeClass = Class.forName("com.kaisikk.java.kaisikmtscourse.reflection.Employee");

//        Employee o = (Employee) employeClass.newInstance();
//        System.out.println(o);


        Constructor<Employee> constructor1 = employeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeClass.getConstructor(int.class, String.class, String.class);

        Object obj2 = constructor2.newInstance(5, "Kaisik", "IT");
        System.out.println(obj2);

        Method method = employeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);
    }


}
