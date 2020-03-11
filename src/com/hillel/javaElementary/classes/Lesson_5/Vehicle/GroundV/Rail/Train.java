package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.Rail;

public class Train extends Rail{
    private String typeOfTrain;
    private int passengerCount;
    private String typeOfLoco;

    public Train(String typeOfTrain, int passengerCount, String typeOfLoco) {
        this.typeOfTrain = typeOfTrain;
        this.passengerCount = passengerCount;
        this.typeOfLoco = typeOfLoco;
    }

    public String getTypeOfTrain() {
        return typeOfTrain;
    }

    public void setTypeOfTrain(String typeOfTrain) {
        this.typeOfTrain = typeOfTrain;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTypeOfLoco() {
        return typeOfLoco;
    }

    public void setTypeOfLoco(String typeOfLoco) {
        this.typeOfLoco = typeOfLoco;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfTrain= '" + typeOfTrain + '\'' +
                ", passengerCount= " + passengerCount +
                ", typeOfLoco= '" + typeOfLoco + '\'';
    }
}
