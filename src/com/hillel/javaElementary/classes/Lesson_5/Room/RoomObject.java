package com.hillel.javaElementary.classes.Lesson_5.Room;

public class RoomObject {
    protected int x;
    protected int y;
    protected double width;
    protected double height;
    protected double length;

    public RoomObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public RoomObject(double width, double height, double length){
        this.width = width;
        this.height =height;
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
