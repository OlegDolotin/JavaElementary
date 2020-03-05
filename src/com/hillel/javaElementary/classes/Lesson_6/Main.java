package com.hillel.javaElementary.classes.Lesson_6;

import com.hillel.javaElementary.classes.Lesson_4.People.Student;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.IStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.implementation.DelegatingStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.implementation.NowhereStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentPrinter.implementation.SoutStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.IStudentStringConverter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation.IniStudentStringConverter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation.JSONStudentStringConverter;
import com.hillel.javaElementary.classes.Lesson_6.IStudentStringConverter.implementation.XMLStudentStringConverter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * Creating test instance Student and Ini Converter
         */
        Student student1 = new Student("Oleg", "Dolotin", 20,"6.04.186.010.17.02", 3);
        IStudentStringConverter converter = new IniStudentStringConverter();

        /**
         * Testing method convert and sout
         */

        String output = converter.convert(student1);
//        System.out.println(output);

        /**
         * Testing JSON Student Converter
         */

        converter = new JSONStudentStringConverter();
        output = converter.convert(student1);
//        System.out.println(output);

        /**
         * Testing XML Student Converter
         */

        converter = new XMLStudentStringConverter();
        output = converter.convert(student1);
//        System.out.println(output);

        SoutStudentPrinter printer = new SoutStudentPrinter(new XMLStudentStringConverter());
//        printer.print(student1);
        ArrayList<IStudentPrinter> array = new ArrayList<>();
        array.add(new SoutStudentPrinter(new JSONStudentStringConverter()));
        array.add(new NowhereStudentPrinter());


        DelegatingStudentPrinter printer1 = new DelegatingStudentPrinter(array);
        printer1.print(student1);
    }
}
