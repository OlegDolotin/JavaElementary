package com.hillel.javaElementary.classes.Lesson_5.Human;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int kidsQuantity;

    public Human(String name, String surname, int kidsQuantity){
        this.name = name;
        this.surname = surname;
        this.kidsQuantity = kidsQuantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (!(obj instanceof Human)){
            return false;
        }

        Human other = (Human)obj;
        return  Objects.equals(other.name, this.name)&&
                Objects.equals(other.surname, this.surname)&&
                Objects.equals(other.kidsQuantity, this.kidsQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, kidsQuantity);
    }

    @Override
    public String toString() {
        return String.format("name=%s, surname=%s",name, surname);
    }
}
