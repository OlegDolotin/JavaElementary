package com.hillel.javaElementary.classes.Lesson_7;

import java.util.Date;

public class MulticastingLifecycleObserver implements IHumanLifecycleObserver {

    private final IHumanLifecycleObserver[] observers;

    public MulticastingLifecycleObserver(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    @Override
    public void onHumanWasBorn(boolean gender, String name, Date birthday) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onHumanWasBorn(gender, name, birthday);
        }
    }

    @Override
    public void onWentToKindergarten(String kindergartenName, int age) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToKindergarten(kindergartenName, age);
        }
    }

    @Override
    public void onWentToSchool(String schoolName, int age) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToSchool(schoolName, age);
        }
    }

    @Override
    public void onWentToUniversity(String universityName, int age) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToUniversity(universityName, age);
        }
    }

    @Override
    public void onGotWork(String position, int salary) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onGotWork(position, salary);
        }
    }

    @Override
    public void onBoughtCar(String brand, int cost, int age) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onBoughtCar(brand, cost, age);
        }
    }

    @Override
    public void onCreatingFamily(String wifeName, int age) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onCreatingFamily(wifeName, age);
        }
    }

    @Override
    public void onGaveBirth(String childName, boolean gender, Date birthday) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onGaveBirth(childName, gender, birthday);
        }
    }

    @Override
    public void onDeath(Date date) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onDeath(date);
        }
    }
}
