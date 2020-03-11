package com.hillel.javaElementary.classes.Lesson_8.Task_1_to_4;

import com.hillel.javaElementary.classes.Lesson_8.IStudentPrinter.IStudentPrinter;
import com.hillel.javaElementary.classes.Lesson_8.IStudentStringConverter.IStudentStringConverter;
import java.util.ArrayList;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Comparator<Student> nameComparator(){
        return new NameComparator();
    }

    public Comparator<Student> nameComparatorAnonym(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };
    }

    public Comparator<Student> ageComparator(){
        return new AgeComparator();
    }

    public Comparator<Student> ageComparatorAnonym(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        };
    }

    public Comparator<Student> defaultComparator(){
        return new DefaultComparator();
    }

    public IStudentStringConverter iniConverter(){
         return new IStudentStringConverter() {
            @Override
            public String convert() {
                StringBuilder builder = new StringBuilder();

                builder.append("Name ").append("= ").append(name).append("\n");
                builder.append("Age ").append("= ").append(age).append("\n");

                return builder.toString();
            }
        };
    }

    public IStudentStringConverter JSONConverter(){
        return  new IStudentStringConverter() {
            @Override
            public String convert() {
                StringBuilder builder = new StringBuilder();
                builder.append("{\n");

                builder.append("\t")
                        .append("\"name\" : ")
                        .append("\"")
                        .append(name)
                        .append("\",\n");
                builder.append("\t")
                        .append("\"age\" : ")
                        .append(age)
                        .append("\n");

                builder.append("}");
                return builder.toString();
            }
        };
    }

    public IStudentStringConverter XMLConverter(){
        return new IStudentStringConverter() {
            @Override
            public String convert() {
                StringBuilder builder = new StringBuilder();

                builder.append("<student>").append("\n");

                builder.append("\t").append("<name>").append(name).append("</name>").append("\n");
                builder.append("\t").append("<age>").append(age).append("</age>").append("\n");


                builder.append("</student>");

                return builder.toString();
            }
        };
    }

    public IStudentPrinter soutPrinter(IStudentStringConverter inputConverter){
        return new IStudentPrinter() {
            IStudentStringConverter converter = inputConverter;

            @Override
            public void print() {
                System.out.println(converter.convert());
            }
        };
    }

    public IStudentPrinter nowhereConverter(){
        return new IStudentPrinter() {
            /**
             *  Nothing to do
             */
            @Override
            public void print() {

            }
        };
    }


    public IStudentPrinter delegatingConverter(ArrayList<IStudentPrinter> inputPrinters){
        return new IStudentPrinter() {
            ArrayList<IStudentPrinter> printers = inputPrinters;

            @Override
            public void print() {
                for (IStudentPrinter temp: printers) {
                    temp.print();
                }
            }
        };
    }

    public Comparator<Student> defaultComparatorAnonym(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.name.equals(s2.name)){
                    return s1.age-s2.age;
                }else {
                    return s1.name.compareTo(s2.name);
                }
            }
        };
    }



    private static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    private static class AgeComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.age - s2.age;
        }
    }

    private static class DefaultComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.name.equals(s2.name)){
                return s1.age-s2.age;
            }else {
                return s1.name.compareTo(s2.name);
            }
        }
    }
}
