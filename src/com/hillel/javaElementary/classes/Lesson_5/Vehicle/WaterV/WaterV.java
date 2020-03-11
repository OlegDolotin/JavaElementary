package com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.Vehicle;

public abstract class WaterV extends Vehicle {
    protected double displacement;
    protected double deadWeight;

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(double deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public String toString() {
        return  "displacement= " + displacement +
                ", deadWeight= " + deadWeight +
                ", maker= '" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption+ " liters" +
                ", width= " + width +
                ", length= " + length +
                ", height= " + height +
                ", weight= " + weight +
                ", maxSpeed= " + maxSpeed+" knots\n";
    }
}
