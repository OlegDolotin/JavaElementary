package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

import java.util.ArrayList;

public class Faculty {
    private ArrayList<Department> departments;
    private FacultyList faculty;

    public Faculty(ArrayList<Department> departments, FacultyList faculty){
        this.departments = departments;
        this.faculty = faculty;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public FacultyList getFaculty() {
        return faculty;
    }
}
