package com.hillel.javaElementary.classes.ThirdLesson;

public class Apples extends FruitsAndVegetables{
    private final long id = 0;
    private final double price = 12.5;

    public Apples(double weight){
        this.weight = weight;
    }

    public double getPrice() {
        return weight*price;
    }
}
