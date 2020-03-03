package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

import  com.hillel.javaElementary.classes.Lesson_4.People.Student;
import java.util.ArrayList;

public class Group {
    private DepartmentList department;
    private FacultyList faculty;
    private ArrayList<Student> students;
    private String group;

    public Group(DepartmentList department, FacultyList faculty, ArrayList<Student> students, String group) {
        this.department = department;
        this.faculty = faculty;
        this.students = students;
        this.group = group;
    }

    public DepartmentList getDepartment() {
        return department;
    }

    public FacultyList getFaculty() {
        return faculty;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getGroupNumber() {
        return group;
    }
}
