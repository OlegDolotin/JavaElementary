package com.hillel.javaElementary.classes.Lesson_3;

public class Customer {
    private String name;
    private long id;

    public Customer(String name, long id){
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
