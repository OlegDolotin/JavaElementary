package com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;

public class JSONStudentStringConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");

        builder.append("\t")
                .append("\"name\" : ")
                .append("\"")
                .append(student.getName())
                .append("\",\n");
        builder.append("\t")
                .append("\"age\" : ")
                .append(student.getAge())
                .append(",\n");
        builder.append("\t")
                .append("\"group\" : ")
                .append("\"")
                .append(student.getGroupNumber())
                .append("\",\n");
        builder.append("\t")
                .append("\"course\" : ")
                .append(student.getCourse())
                .append("\n");

        builder.append("}");
        return builder.toString();
    }
}
