package com.hillel.javaElementary.classes.Lesson_5.Building;

public class Pigsty extends AgriculturalBuilding{
    private int quantityOfPig;
    private String kindOfPig;

    public Pigsty(String name, int number,int quantityOfFloors, AgriculturalBuildingType type, int quantityOfPig, String kindOfPig) {
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloors;
        this.type = type;
        this.quantityOfPig = quantityOfPig;
        this.kindOfPig = kindOfPig;
    }

}
