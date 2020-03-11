package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

import  com.hillel.javaElementary.classes.Lesson_4.People.Student;
import java.util.ArrayList;

public class Group {
    private EDepartment department;
    private EFaculty faculty;
    private ArrayList<Student> students;
    private String group;

    public Group(EDepartment department, EFaculty faculty, ArrayList<Student> students, String group) {
        this.department = department;
        this.faculty = faculty;
        this.students = students;
        this.group = group;
    }

    public EDepartment getDepartment() {
        return department;
    }

    public EFaculty getFaculty() {
        return faculty;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getGroupNumber() {
        return group;
    }
}
