package com.hillel.javaElementary.classes.Lesson_4;

import com.hillel.javaElementary.classes.Lesson_4.People.Position;
import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_4.NotPeople.*;
import com.hillel.javaElementary.classes.Lesson_4.People.Teacher;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg","Dolotin", 19, "6.04.051.010.17.02", 2);
        Student student2 = new Student("Jack","Polo", 21, "6.04.186.010.18.01", 4);
        Student student3 = new Student("Tom","Kat", 20, "6.04.051.010.17.03", 3);
        Student student4 = new Student("Kate","Whats", 18, "6.04.051.010.19.01", 1);
        Student student5 = new Student("Pitter","Parker", 22, "6.04.051.012.17.02", 5);
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Group group1 = new Group(EDepartment.CSaIT, EFaculty.EI, students, "6.04.051.010.17.02");
        Group group2 = new Group(EDepartment.CSaIT, EFaculty.F, students, "6.04.186.010.18.01");
        Group group3 = new Group(EDepartment.CSaIT, EFaculty.IER, students, "6.04.051.010.17.03");
        Group group4 = new Group(EDepartment.CSaIT, EFaculty.ToFC, students, "6.04.051.010.19.01");
        Group group5 = new Group(EDepartment.CSaIT, EFaculty.CaIB, students, "6.04.051.012.17.02");
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        groups.add(group5);
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Bill", "Gates    ", 53, 21, Position.phd);
        Teacher teacher2 = new Teacher("Ilon", "Mask     ", 40, 18, Position.headOfDepartment);
        Teacher teacher3 = new Teacher("Mark", "Tsukerberg", 45, 22, Position.professor);
        Teacher teacher4 = new Teacher("Nill", "Armstrong", 77, 42, Position.assistantProfessor);
        Teacher teacher5 = new Teacher("Tom", "Kruz", 50, 25, Position.phd);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        Department department1 = new Department(students, groups, EFaculty.EI, EDepartment.CSaIT, teachers);
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(department1);
        Faculty faculty1 = new Faculty(departments, EFaculty.EI);
        Room room1 = new Room(320, EDepartment.CSaIT, EFaculty.EI);
        Room room2 = new Room(418, EDepartment.CSaIT, EFaculty.EI);
        Room room3 = new Room(115, EDepartment.CSaIT, EFaculty.EI);
        Room room4 = new Room(410, EDepartment.CSaIT, EFaculty.EI);
        Room room5 = new Room(223, EDepartment.CSaIT, EFaculty.EI);
        Lesson lesson1 = new Lesson(group1, teacher1, new GregorianCalendar(2020, 3,2,10,15), "Web", room1);
        Lesson lesson2 = new Lesson(group2, teacher2, new GregorianCalendar(2020,3,2,12,10), "CMS", room2);
        Lesson lesson3 = new Lesson(group3, teacher3, new GregorianCalendar(2020,3,2,12,10), "PHP", room2);
        Lesson lesson4 = new Lesson(group4, teacher4, new GregorianCalendar(2020,3,2,13,55), "CSS", room4);
        Lesson lesson5 = new Lesson(group5, teacher5, new GregorianCalendar(2020, 3,2,10,15), "JS", room1);
        Schedule schedule = new Schedule();
        schedule.add(lesson1);
        schedule.add(lesson2);
        schedule.add(lesson3);
        schedule.add(lesson4);
        schedule.add(lesson5);
        schedule.sortByDateTime();
        System.out.println(schedule.printSchedule());
    }
}
