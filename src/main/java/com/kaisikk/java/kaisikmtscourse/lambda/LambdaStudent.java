package com.kaisikk.java.kaisikmtscourse.lambda;

public class LambdaStudent {

    private String name;

    private char sex;

    private Integer age;

    private Integer cource;

    private Double avgGdare;

    public LambdaStudent(String name, char sex, Integer age, Integer cource, Double avgGdare) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.cource = cource;
        this.avgGdare = avgGdare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCource() {
        return cource;
    }

    public void setCource(Integer cource) {
        this.cource = cource;
    }

    public Double getAvgGdare() {
        return avgGdare;
    }

    public void setAvgGdare(Double avgGdare) {
        this.avgGdare = avgGdare;
    }

    @Override
    public String toString() {
        return "LambdaStudent{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", cource=" + cource +
                ", avgGdare=" + avgGdare +
                '}';
    }
}
