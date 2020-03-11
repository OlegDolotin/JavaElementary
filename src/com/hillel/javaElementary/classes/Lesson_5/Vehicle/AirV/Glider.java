package com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV;

public class Glider extends AirV{
    private String typeOfMount;

    public Glider(String typeOfMount) {
        this.typeOfMount = typeOfMount;
    }

    public String getTypeOfMount() {
        return typeOfMount;
    }

    public void setTypeOfMount(String typeOfMount) {
        this.typeOfMount = typeOfMount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfMount= '" + typeOfMount + '\'';
    }
}
