package com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV;

public class AirBalloon extends AirV{
    private double countOfAir;
    private String typeOfAir;

    public AirBalloon(double countOfAir, String typeOfAir) {
        this.countOfAir = countOfAir;
        this.typeOfAir = typeOfAir;
    }

    public String getTypeOfAir() {
        return typeOfAir;
    }

    public void setTypeOfAir(String typeOfAir) {
        this.typeOfAir = typeOfAir;
    }

    public double getCountOfAir() {
        return countOfAir;
    }

    public void setCountOfAir(double countOfAir) {
        this.countOfAir = countOfAir;
    }

    @Override
    public String toString() {
        return super.toString()+
                "countOfAir=" + countOfAir +
                ", typeOfAir='" + typeOfAir + '\'';
    }
}
