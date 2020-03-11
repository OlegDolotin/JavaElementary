package com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.NotRail;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.GroundV;

public abstract class NotRail extends GroundV {
    protected int seatsCount;

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    @Override
    public String toString() {
        return "seatsCount= " + seatsCount +
                ", clearance= " + clearance +
                ", wheelSetsCount= " + wheelSetsCount +
                ", maker= '" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption +" liters" +
                ", width= " + width +
                ", length= " + length +
                ", height= " + height +
                ", weight= " + weight +
                ", maxSpeed=" + maxSpeed +"km\\h"+"\n";
    }
}

