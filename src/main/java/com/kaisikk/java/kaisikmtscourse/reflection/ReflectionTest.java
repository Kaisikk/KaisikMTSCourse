package com.kaisikk.java.kaisikmtscourse.reflection;

public class ReflectionTest {

    public int id;

    public String name;

    public String department;

    private double salary;

    public ReflectionTest() {
    }

    public ReflectionTest(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public ReflectionTest(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("newDepartment is: " + department);
    }

    public void increaseSalary() {
        salary*= 2;
    }
    @Override
    public String toString() {
        return "ReflectionTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
