package com.kaisikk.java.kaisikmtscourse.streams.dto;

import com.kaisikk.java.kaisikmtscourse.Student;
import com.kaisikk.java.kaisikmtscourse.lambda.LambdaStudent;

import java.util.ArrayList;
import java.util.List;

public class FlatMapDto {

    private String name;

    private List<LambdaStudent> students;

    public FlatMapDto(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public List<LambdaStudent> getStudents() {
        return students;
    }


    public void addStudentOnFaculty(LambdaStudent student){
        this.students.add(student);
    }

}
