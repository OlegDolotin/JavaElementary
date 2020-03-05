package com.hillel.javaElementary.classes.Lesson_5.Building;

public class AgriculturalStorage extends AgriculturalBuilding{
    private int capacity;
    private int filledOut;
    private String crop;

    public AgriculturalStorage(String name, int number,int quantityOfFloors, AgriculturalBuildingType type , int capacity, String crop) {
        this.name = name;
        this.number = number;
        this.quantityOfFloors = quantityOfFloors;
        this.type = type;
        this.capacity = capacity;
        this.crop = crop;
        filledOut = 0;
    }

    public boolean load(int count){
        if (filledOut+count > capacity || count < 0){
            return false;
        }
        filledOut += count;
        return true;
    }

    public boolean unload(int count){
        if (filledOut-count < 0 || count < 0){
            return false;
        }
        filledOut -= count;
        return true;
    }

    public int unloadAll(){
        int output = filledOut;
        filledOut = 0;
        return output;
    }
}
