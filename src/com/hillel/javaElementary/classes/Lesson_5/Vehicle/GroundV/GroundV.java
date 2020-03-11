package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.Vehicle;

public abstract class GroundV extends Vehicle {
    protected double clearance;
    protected int wheelSetsCount;

    public int getWheelSetsCount() {
        return wheelSetsCount;
    }

    public void setWheelSetsCount(int wheelSetsCount) {
        this.wheelSetsCount = wheelSetsCount;
    }

    public double getClearance() {
        return clearance;
    }

    public void setClearance(double clearance) {
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return  "clearance= " + clearance +
                ", wheelSetsCount= " + wheelSetsCount +
                ", maker= '" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption +
                ", width= " + width +
                ", length= " + length +
                ", height= " + height +
                ", weight= " + weight +
                ", maxSpeed= " + maxSpeed + "km\\h";
    }
}
