package com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV;

public class Helicopter extends AirV{
    private int propellerCount;

    public Helicopter(int propellerCount) {
        this.propellerCount = propellerCount;
    }

    public int getPropellerCount() {
        return propellerCount;
    }

    public void setPropellerCount(int propellerCount) {
        this.propellerCount = propellerCount;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "propellerCount= " + propellerCount;
    }
}
