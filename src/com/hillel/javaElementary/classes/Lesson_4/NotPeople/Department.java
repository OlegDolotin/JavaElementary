package com.hillel.javaElementary.classes.Lesson_4.NotPeople;


import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_4.People.Teacher;

import java.util.ArrayList;

public class Department {
    private EFaculty faculty;
    private EDepartment department;
    private ArrayList<Student> students;
    private ArrayList<Group> groups;
    private ArrayList<Teacher> teachers;

    public Department(ArrayList<Student> students, ArrayList<Group> groups,
                      EFaculty faculty, EDepartment department, ArrayList<Teacher> teachers){
        this.students = students;
        this.groups = groups;
        this.faculty = faculty;
        this.department = department;
        this.teachers = teachers;
    }

    public EFaculty getFaculty() {
        return faculty;
    }

    public EDepartment getDepartment() {
        return department;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
