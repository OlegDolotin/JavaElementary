package com.hillel.javaElementary.classes.Lesson_3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Customer)){
            return false;
        }

        Customer other = (Customer) obj;
        return  Objects.equals(this.id, other.id) &&
                Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
