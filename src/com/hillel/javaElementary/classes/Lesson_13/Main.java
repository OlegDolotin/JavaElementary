package com.hillel.javaElementary.classes.Lesson_13;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Olegator", 20);
        System.out.println("// deserialize");
        try {
            student.deserialize("Olegator");
        }catch (MyDomainException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("// wrappedDeserialize");

        try {
            student.wrappedDeserialize("jaksdl");
        }catch (MyDomainException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("// doubleWrappedDeserialize");

        try{
            student.doubleWrappedDeserialize("sdfdsfds");
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("// random Exception");

        try{
            student.randomException();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            student = null;
        }

        System.out.println("Student = "+student);
    }
}
