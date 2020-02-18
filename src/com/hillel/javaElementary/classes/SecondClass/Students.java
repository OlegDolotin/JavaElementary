package com.hillel.javaElementary.classes.SecondClass;

import java.util.ArrayList;

public class Students {

    private Student[] students;

    public Students(Student[] students){
        this.students = students;
    }

    public void sortByName(){
        Student temp;
        for (int i = 0; i < students.length-1; i++){
            for (int j = i+1; j < students.length; j++){
                if (students[i].getName().compareTo(students[j].getName()) > 0){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void sortByAge(){
        Student temp;
        for (int i = 0; i < students.length-1; i++){
            for (int j = i+1; j < students.length; j++){
                if (students[i].getAge() > students[j].getAge()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public Student findStudentByName(String name){
        for (int i = 0; i < students.length; i++){
            if(students[i].getName().contains(name)){
                return students[i];
            }
        }
        return null;
    }

    public ArrayList <Student> findStudentsByName(String name){
        ArrayList<Student> output = new ArrayList<>();

        for (int i =0; i < students.length; i++){
            if (students[i].getName().contains(name)){
                output.add(students[i]);
            }
        }
        return output;
    }

    public int length(){
        return students.length;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < students.length; i++){
            output += students[i].getName()+"\n";
        }
        return output;
    }
}
