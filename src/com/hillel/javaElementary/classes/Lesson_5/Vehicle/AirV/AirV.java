package com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.Vehicle;

public abstract class AirV extends Vehicle {
    protected double takeOffWeight;
    protected int wheelSetsCount;

    public int getWheelSetsCount() {
        return wheelSetsCount;
    }

    public void setWheelSetsCount(int wheelSetsCount) {
        this.wheelSetsCount = wheelSetsCount;
    }

    public double getTakeOffWeight() {
        return takeOffWeight;
    }

    public void setTakeOffWeight(double takeOffWeight) {
        this.takeOffWeight = takeOffWeight;
    }

    @Override
    public String toString() {
        return  "takeOffWeight= " + takeOffWeight +
                ", wheelSetsCount= " + wheelSetsCount +
                ", maker= '" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption + " gallon"+
                ", width= " + width +
                ", length= " + length +
                ", height= " + height +
                ", weight= " + weight +
                ", maxSpeed= " + maxSpeed +
                " knots\n";
    }
}
