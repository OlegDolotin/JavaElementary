package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.NotRail;

public class Car extends NotRail{
    private String typeOfEngine;
    private String drive;
    private String govNumber;


    public Car(String typeOfEngine, String drive, String govNumber) {
        this.typeOfEngine = typeOfEngine;
        this.drive = drive;
        this.govNumber = govNumber;
    }

    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfEngine= '" + typeOfEngine + '\'' +
                ", drive= '" + drive + '\'' +
                ", govNumber= '" + govNumber + '\'';
    }
}
