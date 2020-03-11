package com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV;

import java.sql.Time;

public class Plane extends AirV{
    private double wingsLength;
    private int enginesCount;
    private String type;
    private Time timeWithoutEngines;

    public Plane(double wingsLength, int enginesCount, String type, Time timeWithoutEngines) {
        this.wingsLength = wingsLength;
        this.enginesCount = enginesCount;
        this.type = type;
        this.timeWithoutEngines = timeWithoutEngines;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    public int getEnginesCount() {
        return enginesCount;
    }

    public void setEnginesCount(int enginesCount) {
        this.enginesCount = enginesCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Time getTimeWithoutEngines() {
        return timeWithoutEngines;
    }

    public void setTimeWithoutEngines(Time timeWithoutEngines) {
        this.timeWithoutEngines = timeWithoutEngines;
    }

    @Override
    public String toString() {
        return super.toString() +
                "wingsLength= " + wingsLength +
                ", enginesCount= " + enginesCount +
                ", type= '" + type + '\'' +
                ", timeWithoutEngines= " + timeWithoutEngines.toString() +
                '}';
    }
}
