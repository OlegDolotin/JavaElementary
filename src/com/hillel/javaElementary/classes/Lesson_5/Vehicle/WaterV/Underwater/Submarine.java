package com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.Underwater;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.WaterV;

import java.sql.Time;

public class Submarine extends WaterV {
    protected double maxDepth;
    protected Time timeUnderwater;
    protected double oxygenQuantity;

    public Submarine(double maxDepth, Time timeUnderwater, double oxygenQuantity) {
        this.maxDepth = maxDepth;
        this.timeUnderwater = timeUnderwater;
        this.oxygenQuantity = oxygenQuantity;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public Time getTimeUnderwater() {
        return timeUnderwater;
    }

    public void setTimeUnderwater(Time timeUnderwater) {
        this.timeUnderwater = timeUnderwater;
    }

    public double getOxygenQuantity() {
        return oxygenQuantity;
    }

    public void setOxygenQuantity(double oxygenQuantity) {
        this.oxygenQuantity = oxygenQuantity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "maxDepth=" + maxDepth +
                ", timeUnderwater= " + timeUnderwater +
                ", oxygenQuantity= " + oxygenQuantity;
    }
}
