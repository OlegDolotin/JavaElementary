package com.hillel.javaElementary.classes.Lesson_5.Building;

import com.hillel.javaElementary.classes.Lesson_5.Building.Abstract.Building;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EMunicipal;

public class MunicipalBuilding extends Building {
    private EMunicipal type;

    public MunicipalBuilding(String name, int number, int quantityOfFloors, EMunicipal type){
        this.type = type;
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "type=" + type;
    }
}
