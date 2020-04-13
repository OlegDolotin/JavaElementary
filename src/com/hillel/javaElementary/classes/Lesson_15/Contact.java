package com.hillel.javaElementary.classes.Lesson_15;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String surname;
    private String phoneNumber;
    private int yearOfBirth;

    private static final long serialVersionUID = 1L;

    public Contact(String name, String surname, String phoneNumber, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return "Contact {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
