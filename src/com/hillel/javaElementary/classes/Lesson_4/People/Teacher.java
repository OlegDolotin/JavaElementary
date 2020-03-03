package com.hillel.javaElementary.classes.Lesson_4.People;

import com.hillel.javaElementary.classes.Lesson_4.NotPeople.DepartmentList;
import com.hillel.javaElementary.classes.Lesson_4.NotPeople.FacultyList;

public class Teacher {
    private String name;
    private String surname;
    private int age;
    private int experience;
    private Position position;
    private DepartmentList departmentList;
    private FacultyList facultyList;

    public Teacher(String name, String surname, int age, int experience, Position position){
        this.name = name;
        this.surname =surname;
        this.age = age;
        this.experience = experience;
        this.position = position;
    }

    public String getName() {
        return name+" "+surname;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public Position getPosition() {
        return position;
    }

    public DepartmentList getDepartmentList() {
        return departmentList;
    }

    public FacultyList getFacultyList() {
        return facultyList;
    }
}
