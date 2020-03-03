package com.hillel.javaElementary.classes.Lesson_5.Room;

public class Cabinet extends RoomObject {
    private int shellQuantity;
    private boolean isClosed = true;

    public Cabinet(int x, int y, int shellQuantity){
        super(x,y);
        this.shellQuantity = shellQuantity;
    }

    public Cabinet(double width, double height, double length, int shellQuantity){
        super(width, height, length);
        this.shellQuantity = shellQuantity;
    }

    public boolean openDoors(){
        isClosed = false;
        return false;
    }

    public boolean closeDoors(){
        isClosed = true;
        return true;
    }
}
