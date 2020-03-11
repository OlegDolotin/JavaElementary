package com.hillel.javaElementary.classes.Lesson_5.Building;

import com.hillel.javaElementary.classes.Lesson_5.Building.Abstract.AgriculturalBuilding;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EAgricultural;

public class Pigsty extends AgriculturalBuilding {
    private int quantityOfPig;
    private String kindOfPig;

    public Pigsty(String name, int number, int quantityOfFloors, EAgricultural type, int quantityOfPig, String kindOfPig) {
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloors;
        this.type = type;
        this.quantityOfPig = quantityOfPig;
        this.kindOfPig = kindOfPig;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "quantityOfPig=" + quantityOfPig +
                ", kindOfPig='" + kindOfPig + '\'';
    }
}
