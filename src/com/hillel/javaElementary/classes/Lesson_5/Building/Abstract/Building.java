package com.hillel.javaElementary.classes.Lesson_5.Building.Abstract;

public abstract class Building {
    protected String name;
    protected int number;
    protected int quantityOfFloors;
    protected boolean hasElevator;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", quantityOfFloors=" + quantityOfFloors +
                ", hasElevator=" + hasElevator;
    }
}
