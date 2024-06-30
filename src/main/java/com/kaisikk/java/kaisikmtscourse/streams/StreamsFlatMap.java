package com.kaisikk.java.kaisikmtscourse.streams;

import com.kaisikk.java.kaisikmtscourse.lambda.LambdaStudent;
import com.kaisikk.java.kaisikmtscourse.streams.dto.FlatMapDto;

import java.util.ArrayList;
import java.util.List;

public class StreamsFlatMap {

    public static void main(String[] args) {

        FlatMapDto f1 = new FlatMapDto("Economics");

        FlatMapDto f2 = new FlatMapDto("Applied mathematics");

        LambdaStudent student = new LambdaStudent("Kaisik", 'm', 24, 3, 11.0);
        LambdaStudent student2 = new LambdaStudent("Barbar", 'm', 24, 2, 9.0);
        LambdaStudent student3 = new LambdaStudent("Vito", 'm', 34, 5, 12.0);
        LambdaStudent student4 = new LambdaStudent("Zoomer", 'm', 19, 1, 3.0);
        LambdaStudent student5 = new LambdaStudent("Lena", 'f', 60, 10, 2.0);

        f1.addStudentOnFaculty(student);
        f2.addStudentOnFaculty(student2);
        f1.addStudentOnFaculty(student3);
        f2.addStudentOnFaculty(student4);
        f1.addStudentOnFaculty(student5);
        f1.addStudentOnFaculty(student5);

        List<FlatMapDto> dtoList = new ArrayList<>();

        dtoList.stream()
                .flatMap(dto -> dto.getStudents().stream())
                .forEach(e -> System.out.println(e.getName()));

    }


}
