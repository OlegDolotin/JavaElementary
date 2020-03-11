package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.NotRail;

public class Motorcycle extends NotRail{
    private String typeOfEngine;

    public Motorcycle(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfEngine= '" + typeOfEngine + '\'';
    }
}
