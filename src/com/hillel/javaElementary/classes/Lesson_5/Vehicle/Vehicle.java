package com.hillel.javaElementary.classes.Lesson_5.Vehicle;

public abstract class Vehicle {
    protected String maker;
    protected String country;
    protected double consumption;
    protected int width;
    protected int length;
    protected int height;
    protected double weight;
    protected double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "maker='" + maker + '\'' +
                ", country= '" + country + '\'' +
                ", consumption= " + consumption +
                ", width= " + width +
                ", length= " + length +
                ", height= " + height +
                ", weight= " + weight +
                ", maxSpeed= " + maxSpeed+"\n";
    }
}
