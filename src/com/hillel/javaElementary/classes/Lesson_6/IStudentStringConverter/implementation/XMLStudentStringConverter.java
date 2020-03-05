package com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;

public class XMLStudentStringConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();

        builder.append("<student>").append("\n");

        builder.append("\t").append("<name>").append(student.getName()).append("</name>").append("\n");
        builder.append("\t").append("<age>").append(student.getAge()).append("</age>").append("\n");
        builder.append("\t").append("<group>").append(student.getGroupNumber()).append("</group>").append("\n");
        builder.append("\t").append("<course>").append(student.getCourse()).append("</course>").append("\n");

        builder.append("</student>");

        return builder.toString();
    }
}
