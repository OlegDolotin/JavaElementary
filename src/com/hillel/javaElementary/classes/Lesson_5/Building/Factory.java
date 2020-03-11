package com.hillel.javaElementary.classes.Lesson_5.Building;

import com.hillel.javaElementary.classes.Lesson_5.Building.Abstract.IndustrialBuilding;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EIndustrial;

public class Factory extends IndustrialBuilding {
    private String product;
    private boolean isAutomated;

    public Factory(String name, int number, int quantityOfFloors, EIndustrial type, String product, boolean isAutomated) {
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloors;
        this.type = type;
        this.product = product;
        this.isAutomated = isAutomated;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "product='" + product + '\'' +
                ", isAutomated=" + isAutomated;
    }
}
