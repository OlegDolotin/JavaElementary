package com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.implementation;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.IStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;


public class SoutStudentPrinter implements IStudentPrinter {
    IStudentStringConverter converter;

    public SoutStudentPrinter(IStudentStringConverter converter){
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        System.out.println(converter.convert(student));
    }
}
