package com.hillel.javaElementary.classes.ThirdLesson;

public class Pork extends FruitsAndVegetables{
    private final long id = 0;
    private final double price = 12.5;

    public Pork(double weight){
        this.weight = weight;
    }

    public double getPrice() {
        return weight*price;
    }
}
