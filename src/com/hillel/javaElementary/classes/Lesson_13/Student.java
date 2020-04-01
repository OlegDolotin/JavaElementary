package com.hillel.javaElementary.classes.Lesson_13;

import com.sun.jdi.Value;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student deserialize(String value) throws MyDomainException {
        throw new MyDomainException();
    }

    public Student wrappedDeserialize(String value) throws MyDomainException{
        deserialize(value);
        return null;
    }

    public Student doubleWrappedDeserialize(String value) throws RuntimeException{
        try{
            wrappedDeserialize(value);
        }catch (MyDomainException e){
            throw new RuntimeException();
        }
        return null;
    }

    public void randomException(){
        switch (new Random().nextInt(3)){
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new IllegalArgumentException();
            case 3:
                throw new RuntimeException();
                default:
                    return;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name == ""){
            throw new IllegalArgumentException();
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 17){
            throw new IllegalArgumentException();
        }else {
            this.age = age;
        }
    }
}
