package com.hillel.javaElementary.classes.Lesson_7;

import java.util.Date;

public class LoggingHumanLifecycleObserver implements IHumanLifecycleObserver{
    @Override
    public void onHumanWasBorn(boolean gender, String name, Date birthday) {
        System.out.printf("%s was born with name %s and %s",
                          gender ? "Male":"Female",
                          name,
                          birthday.toString()+"\n");
    }

    @Override
    public void onWentToKindergarten(String kindergartenName, int age) {
        System.out.printf("Went to the %s kindergarten in %s age\n",
                          kindergartenName,
                          age);
    }

    @Override
    public void onWentToSchool(String schoolName, int age) {
        System.out.printf("Went to the %s school in %s age\n",
                          schoolName,
                          age);
    }

    @Override
    public void onWentToUniversity(String universityName, int age) {
        System.out.printf("Went to the %s university in %s age\n",
                          universityName,
                          age);
    }

    @Override
    public void onGotWork(String position, int salary) {
        System.out.printf("Got work on %s position with salary = %s\n",
                          position,
                          salary);
    }

    @Override
    public void onBoughtCar(String brand, int cost, int mileage) {
        System.out.printf("Bought car %s year for %s price with %s mileage\n",
                          brand,
                          cost,
                          mileage);
    }

    @Override
    public void onCreatingFamily(String wifeName, int age) {
        System.out.printf("Got married on %s in %s age\n",
                          wifeName,
                          age);
    }

    @Override
    public void onGaveBirth(String childName, boolean gender, Date birthday) {
        System.out.printf("Gave birth the %s with %s name %s\n",
                          gender ? "Male":"Female",
                          gender,
                          birthday);
    }

    @Override
    public void onDeath(Date date) {
        System.out.printf("Died %s\n",
                          date.getTime());
    }
}
