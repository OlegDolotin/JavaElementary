package com.hillel.javaElementary.classes.Lesson_8.Task_5;

import java.util.Date;

public class LoggingHumanLifecycleObserver implements IHumanLifecycleObserver{
    @Override
    public void onHumanWasBorn(BornParams params) {
        System.out.printf("%s was born with name %s and %s",
                          params.getGender() ? "Male":"Female",
                          params.getName(),
                          params.getBirthday().toString()+"\n");
    }

    @Override
    public void onWentToKindergarten(EducationParams params) {
        System.out.printf("Went to the %s kindergarten in %s age\n",
                          params.getEducationalEstablishment(),
                          params.getAge());
    }

    @Override
    public void onWentToSchool(EducationParams params) {
        System.out.printf("Went to the %s school in %s age\n",
                          params.getEducationalEstablishment(),
                          params.getAge());
    }

    @Override
    public void onWentToUniversity(EducationParams params) {
        System.out.printf("Went to the %s university in %s age\n",
                          params.getEducationalEstablishment(),
                          params.getAge());
    }

    @Override
    public void onGotWork(WorkParams params) {
        System.out.printf("Got work on %s position with salary = %s\n",
                          params.getPosition(),
                          params.getSalary());
    }

    @Override
    public void onBoughtCar(BoughtCarParams params) {
        System.out.printf("Bought car %s year for %s price with %s mileage\n",
                          params.getBrand(),
                          params.getCost(),
                          params.getMileage());
    }

    @Override
    public void onCreatingFamily(CreatingFamilyParams params) {
        System.out.printf("Got married on %s in %s age\n",
                          params.getWifeName(),
                          params.getAge());
    }

    @Override
    public void onGaveBirth(GaveBirthParams params) {
        System.out.printf("Gave birth the %s with %s name %s\n",
                          params.getGender() ? "Male":"Female",
                          params.getChildName(),
                          params.getBirthday().toString());
    }

    @Override
    public void onDeath(Date date) {
        System.out.printf("Died %s\n",
                          date.getTime());
    }
}
