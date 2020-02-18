package com.hillel.javaElementary.classes.SecondClass;

public class Student {

    private String name;
    private int age;
    private  int course;
    private String gender;

    public Student(String name, String gender, int age, int course){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name +" "+ age;
    }
}
