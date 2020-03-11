package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.Rail;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.GroundV;

public abstract class Rail extends GroundV {
    protected int carriageCount;
    protected double maxLoad;

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return  "carriageCount= " + carriageCount +
                ", maxLoad= " + maxLoad +
                ", clearance= " + clearance +
                ", wheelSetsCount= " + wheelSetsCount +
                ", maker= '" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption +" liters"+
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed + "km\\h"+"\n";
    }
}
