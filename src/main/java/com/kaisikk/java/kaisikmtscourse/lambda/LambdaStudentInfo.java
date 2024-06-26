package com.kaisikk.java.kaisikmtscourse.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaStudentInfo {

    static void testStudents(ArrayList<LambdaStudent> al, StudentsCheck sc){
        for (LambdaStudent s: al){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        LambdaStudent st1 = new LambdaStudent("Ivan", 'm', 22, 3, 8.3);
        LambdaStudent st2 = new LambdaStudent("Kolya", 'm', 28, 2, 6.4);
        LambdaStudent st3 = new LambdaStudent("Elena", 'f', 19, 1, 8.9);
        LambdaStudent st4 = new LambdaStudent("Petr", 'm', 35, 4, 7.0);
        LambdaStudent st5 = new LambdaStudent("Marya", 'f', 23, 3, 9.1);

        ArrayList<LambdaStudent> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        LambdaStudentInfo info = new LambdaStudentInfo();

        testStudents(students, new LambdaStudentCheckOverGrade());

//        info.printStudentOverGrade(students, 8);
//        info.printStudentsUnderAge(students, 30);
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');


    }

    interface StudentsCheck {
        boolean check(LambdaStudent s);
    }

//    void printStudentOverGrade(ArrayList<LambdaStudent> al, double grade){
//        System.out.println("Вывод по Grade");
//        for(LambdaStudent s: al){
//            if(s.getAvgGdare() > grade){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<LambdaStudent> al, int age){
//        System.out.println("Вывод по age");
//        for(LambdaStudent s: al){
//            if(s.getAge() < age){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<LambdaStudent> al, int age, double grade, char sex){
//        System.out.println("Суммарный вывод");
//        for (LambdaStudent s: al){
//            if(s.getAge() > age && s.getAvgGdare() < grade && s.getSex() == sex){
//                System.out.println(s);
//            }
//        }
//
//
//    }

}

class LambdaStudentCheckOverGrade implements LambdaStudentInfo.StudentsCheck {

    @Override
    public boolean check(LambdaStudent s) {
        return s.getAvgGdare() > 8;
    }
}
