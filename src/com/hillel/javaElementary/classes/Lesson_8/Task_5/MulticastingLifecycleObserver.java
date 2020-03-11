package com.hillel.javaElementary.classes.Lesson_8.Task_5;

import java.util.Date;

public class MulticastingLifecycleObserver implements IHumanLifecycleObserver {

    private final IHumanLifecycleObserver[] observers;

    public MulticastingLifecycleObserver(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    @Override
    public void onHumanWasBorn(BornParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onHumanWasBorn(params);
        }
    }

    @Override
    public void onWentToKindergarten(EducationParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToKindergarten(params);
        }
    }

    @Override
    public void onWentToSchool(EducationParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToSchool(params);
        }
    }

    @Override
    public void onWentToUniversity(EducationParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onWentToUniversity(params);
        }
    }

    @Override
    public void onGotWork(WorkParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onGotWork(params);
        }
    }

    @Override
    public void onBoughtCar(BoughtCarParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onBoughtCar(params);
        }
    }

    @Override
    public void onCreatingFamily(CreatingFamilyParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onCreatingFamily(params);
        }
    }

    @Override
    public void onGaveBirth(GaveBirthParams params) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onGaveBirth(params);
        }
    }

    @Override
    public void onDeath(Date date) {
        for (IHumanLifecycleObserver observer:observers){
            observer.onDeath(date);
        }
    }
}
