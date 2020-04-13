package com.hillel.javaElementary.classes.Lesson_15;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String phoneNumber;
    private int yearOfBirth;
    private boolean isExcellentStudent;
    private List<Student> friends;

    public Student(){
        //Nothing
    }

    public Student(String name, String phoneNumber, int yearOfBirth, boolean isExcellentStudent) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.isExcellentStudent = isExcellentStudent;
        friends = new ArrayList<>();
    }

    public List<Student> getFriends() {
        return friends;
    }

    public Student getFriend(int index) {
        return friends.get(index);
    }

    public void addFriend(Student friend) {
        this.friends.add(friend);
    }

    public void removeFriend(Student friend){
        this.friends.remove(friend);
    }

    public boolean isExcellentStudent() {
        return isExcellentStudent;
    }

    public void setExcellentStudent(boolean excellentStudent) {
        isExcellentStudent = excellentStudent;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", isExcellentStudent=" + isExcellentStudent +
                '}';
    }
}
