package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

public class Room {
    private int roomNumber;
    private EDepartment department;
    private EFaculty faculty;

    public Room(int roomNumber, EDepartment department, EFaculty faculty) {
        this.roomNumber = roomNumber;
        this.department = department;
        this.faculty = faculty;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public EDepartment getDepartment() {
        return department;
    }

    public EFaculty getFaculty() {
        return faculty;
    }
}
