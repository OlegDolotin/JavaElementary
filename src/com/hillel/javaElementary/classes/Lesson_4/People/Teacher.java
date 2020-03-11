package com.hillel.javaElementary.classes.Lesson_4.People;

import com.hillel.javaElementary.classes.Lesson_4.NotPeople.EDepartment;
import com.hillel.javaElementary.classes.Lesson_4.NotPeople.EFaculty;

public class Teacher {
    private String name;
    private String surname;
    private int age;
    private int experience;
    private Position position;
    private EDepartment departmentList;
    private EFaculty facultyList;

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

    public EDepartment getDepartmentList() {
        return departmentList;
    }

    public EFaculty getFacultyList() {
        return facultyList;
    }
}
