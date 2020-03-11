package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

import java.util.ArrayList;

public class Faculty {
    private ArrayList<Department> departments;
    private EFaculty faculty;

    public Faculty(ArrayList<Department> departments, EFaculty faculty){
        this.departments = departments;
        this.faculty = faculty;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public EFaculty getFaculty() {
        return faculty;
    }
}
