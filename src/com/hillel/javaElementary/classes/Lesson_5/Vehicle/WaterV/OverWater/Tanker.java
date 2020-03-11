package com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.OverWater;

public class Tanker extends OverWater{
    private String typeOfFluid;
    private int countOfFluid;

    public Tanker(String typeOfFluid, int countOfFluid) {
        this.typeOfFluid = typeOfFluid;
        this.countOfFluid = countOfFluid;
    }

    public String getTypeOfFluid() {
        return typeOfFluid;
    }

    public void setTypeOfFluid(String typeOfFluid) {
        this.typeOfFluid = typeOfFluid;
    }

    public int getCountOfFluid() {
        return countOfFluid;
    }

    public void setCountOfFluid(int countOfFluid) {
        this.countOfFluid = countOfFluid;
    }

    @Override
    public String toString() {
        return super.toString() +
                " typeOfFluid= '" + typeOfFluid + '\'' +
                ", countOfFluid= " + countOfFluid;
    }
}
