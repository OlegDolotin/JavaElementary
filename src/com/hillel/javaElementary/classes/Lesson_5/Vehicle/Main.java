package com.hillel.javaElementary.classes.Lesson_5.Vehicle;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.AirV.*;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.NotRail.Car;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.NotRail.Motorcycle;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.Rail.Train;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.GroundV.Rail.Tram;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.OverWater.Ferry;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.OverWater.Tanker;
import com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.Underwater.Submarine;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        AirBalloon balloon = new AirBalloon(4000, "O2");
        System.out.println(balloon.toString());
        Glider glider = new Glider("some mount");
        System.out.println();
        System.out.println(glider.toString());
        Helicopter helicopter = new Helicopter(2);
        System.out.println();
        System.out.println(helicopter.toString());
        Plane plane = new Plane(30, 2, "passenger", new Time(50));
        System.out.println();
        System.out.println(plane.toString());
        Train train = new Train("Passenger", 2000, "Electric");
        System.out.println();
        System.out.println(train.toString());
        Tram tram =  new Tram("Technical", "battery");
        System.out.println();
        System.out.println(tram.toString());
        Car car = new Car("Internal combustion engine", "AWD", "AH2034OY");
        System.out.println();
        System.out.println(car.toString());
        Motorcycle motorcycle = new Motorcycle("Electric");
        System.out.println();
        System.out.println(motorcycle.toString());
        Ferry ferry = new Ferry("Car", 40, 121321);
        System.out.println();
        System.out.println(ferry.toString());
        Tanker tanker = new Tanker("oil", 1212334);
        System.out.println();
        System.out.println(tanker.toString());
        Submarine submarine = new Submarine(250, new Time(10), 3000);
        System.out.println();
        System.out.println(submarine.toString());
    }
}
