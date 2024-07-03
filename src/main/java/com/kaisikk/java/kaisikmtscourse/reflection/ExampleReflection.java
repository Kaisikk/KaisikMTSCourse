package com.kaisikk.java.kaisikmtscourse.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ExampleReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class exampleReflection = Class.forName("com.kaisikk.java.kaisikmtscourse.reflection.ReflectionTest");
//
//        Class exampleReflection2 = ExampleReflection.class;
//
//        ExampleReflection exampleReflection3 = new ExampleReflection();
//
//        Class exampleReflection4 = exampleReflection3.getClass();


        Field someField = exampleReflection.getField("id");

        System.out.println("Type of id field = " + someField.getType());

        Field[] fields = exampleReflection.getFields();

        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Field[] allFields = exampleReflection.getDeclaredFields();

        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Method someMethod1 = exampleReflection.getMethod("increaseSalary");

        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = exampleReflection.getMethod("setSalary", double.class);

        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));


        Method[] methods = exampleReflection.getMethods();

        for(Method method: methods){

            System.out.println(
                    "Name of method = " + method.getName() +
                    " Return type of method setSalary = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));

        }

    }

}
