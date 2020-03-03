package com.hillel.javaElementary.classes.Lesson_5.Room;

public class TV extends RoomObject{
    private int diagonal;
    private int z;
    private boolean isSwitchedOn = false;

    public TV(int x, int y, int z, int diagonal){
        super(x, y);
        this.diagonal = diagonal;
        this.z = z;
    }

    public TV(double width, double height, double length, int diagonal){
        super(width, height, length);
        this.diagonal = diagonal;
    }

    public void switchOn(){
        isSwitchedOn = true;
    }

    public void switchOff(){
        isSwitchedOn = false;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getZ() {
        return z;
    }

    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
