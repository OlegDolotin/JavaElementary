package com.hillel.javaElementary.classes.Lesson_5.Building;

import com.hillel.javaElementary.classes.Lesson_5.Building.Abstract.Building;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.ELiving;

public class LivingBuilding extends Building {
    private ELiving type;
    private int countOfRoom;
    private int contOfPeople;

    public LivingBuilding(String name, int number, int quantityOfFloor, ELiving type, int countOfRoom, int contOfPeople, boolean hasElevator) {
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloor;
        this.type = type;
        this.countOfRoom = countOfRoom;
        this.contOfPeople = contOfPeople;
        this.hasElevator = hasElevator;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "type=" + type +
                ", countOfRoom=" + countOfRoom +
                ", contOfPeople=" + contOfPeople;
    }
}
