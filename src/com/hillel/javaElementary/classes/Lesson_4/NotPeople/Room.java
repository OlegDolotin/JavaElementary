package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

public class Room {
    private int roomNumber;
    private DepartmentList department;
    private FacultyList faculty;

    public Room(int roomNumber, DepartmentList department, FacultyList faculty) {
        this.roomNumber = roomNumber;
        this.department = department;
        this.faculty = faculty;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public DepartmentList getDepartment() {
        return department;
    }

    public FacultyList getFaculty() {
        return faculty;
    }
}
