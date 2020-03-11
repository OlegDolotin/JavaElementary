package com.hillel.javaElementary.classes.Lesson_7;

import java.util.Date;

public interface IHumanLifecycleObserver {
    void onHumanWasBorn(boolean gender, String name, Date birthday);
    void onWentToKindergarten(String kindergartenName, int age);
    void onWentToSchool(String schoolName, int age);
    void onWentToUniversity(String universityName, int age);
    void onGotWork(String position, int salary);
    void onBoughtCar(String brand, int cost, int mileage);
    void onCreatingFamily(String wifeName, int age);
    void onGaveBirth(String childName, boolean gender, Date birthday);
    void onDeath(Date date);
}
