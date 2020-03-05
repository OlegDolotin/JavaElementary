package com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.implementation;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.IStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;

import java.util.ArrayList;

public class DelegatingStudentPrinter implements IStudentPrinter {
    ArrayList<IStudentPrinter> printers;

    public DelegatingStudentPrinter(ArrayList<IStudentPrinter> printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter temp: printers) {
            temp.print(student);
        }
    }
}
