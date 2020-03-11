package com.hillel.javaElementary.classes.Lesson_5.Building;

import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EAgricultural;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EIndustrial;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.ELiving;
import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EMunicipal;

public class Main {
    public static void main(String[] args) {
        AgriculturalStorage storage = new AgriculturalStorage("Some storage", 3, 2, EAgricultural.Storage, 10000, "Wheat");
        System.out.println(storage.toString());
        Factory factory = new Factory("Some factory", 6, 4, EIndustrial.Production, "metal", true);
        System.out.println();
        System.out.println(factory.toString());
        Pigsty pigsty = new Pigsty("Some pigsty", 1, 1, EAgricultural.Livestock, 100, "some  kind");
        System.out.println();
        System.out.println(pigsty.toString());
        LivingBuilding house = new LivingBuilding("Sinergia", 6, 10, ELiving.MultiFamily, 400, 1500, true);
        System.out.println();
        System.out.println(house.toString());
        MunicipalBuilding building = new MunicipalBuilding("Metalurg", 10, 3, EMunicipal.SportsComplex);
        System.out.println();
        System.out.println(building.toString());
    }


}
