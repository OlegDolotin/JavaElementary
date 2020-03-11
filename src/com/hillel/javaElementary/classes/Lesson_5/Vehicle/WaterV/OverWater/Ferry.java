package com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.OverWater;

public class Ferry extends OverWater{
    private String cargoType;
    private int passengerCount;
    private int maxCarWeight;

    public Ferry(String cargoType, int passengerCount, int maxCarWeight) {
        this.cargoType = cargoType;
        this.passengerCount = passengerCount;
        this.maxCarWeight = maxCarWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getMaxCarWeight() {
        return maxCarWeight;
    }

    public void setMaxCarWeight(int maxCarWeight) {
        this.maxCarWeight = maxCarWeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " cargoType= '" + cargoType + '\'' +
                ", passengerCount= " + passengerCount +
                ", maxCarWeight= " + maxCarWeight;
    }
}
