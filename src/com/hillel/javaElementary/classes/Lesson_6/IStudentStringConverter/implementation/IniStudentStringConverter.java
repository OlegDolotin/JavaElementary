package com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;

public class IniStudentStringConverter implements IStudentStringConverter {


    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();

        builder.append("Name ").append("= ").append(student.getName()).append("\n");
        builder.append("Age ").append("= ").append(student.getAge()).append("\n");
        builder.append("Group ").append("= ").append(student.getGroupNumber()).append("\n");
        builder.append("Course ").append("= ").append(student.getCourse());

        return builder.toString();
    }
}
