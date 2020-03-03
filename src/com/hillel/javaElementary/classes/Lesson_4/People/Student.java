package com.hillel.javaElementary.classes.Lesson_4.People;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String groupNumber;
    private int course;



    public Student(String name, String surname, int age, String groupNumber, int course){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
        this.course = course;
    }

    public String getName() {
        return name+" "+surname;
    }



    public int getAge() {
        return age;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int getCourse() {
        return course;
    }
}
