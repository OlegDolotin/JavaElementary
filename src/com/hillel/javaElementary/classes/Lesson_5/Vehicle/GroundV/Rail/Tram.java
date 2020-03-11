package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.Rail;

public class Tram extends Rail{
    private String typeOfTram;
    private String wayOfGettingPower;

    public Tram(String typeOfTram, String wayOfGettingPower) {
        this.typeOfTram = typeOfTram;
        this.wayOfGettingPower = wayOfGettingPower;
    }

    public String getTypeOfTram() {
        return typeOfTram;
    }

    public void setTypeOfTram(String typeOfTram) {
        this.typeOfTram = typeOfTram;
    }

    public String getWayOfGettingPower() {
        return wayOfGettingPower;
    }

    public void setWayOfGettingPower(String wayOfGettingPower) {
        this.wayOfGettingPower = wayOfGettingPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfTram= '" + typeOfTram + '\'' +
                ", wayOfGettingPower= '" + wayOfGettingPower + '\'';
    }
}
