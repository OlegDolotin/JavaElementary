package com.hillel.javaElementary.classes.Lesson_8.Task_5;

import java.util.Date;
import java.util.Objects;

public class NetworkReportingLifecycleObserver implements IHumanLifecycleObserver {
    private Objects networkService;

    /**
     * The class is stub! Nothing to do !
     *
     *
     */

    @Override
    public void onHumanWasBorn(BornParams params) {
//        networkService.sendRequest(String.format("gender=%s, name=%s, birthday=%s",
//                                   gender ? "Male" :"Female",
//                                   name,
//                                   birthday.getTime()));
    }

    @Override
    public void onWentToKindergarten(EducationParams params) {

    }

    @Override
    public void onWentToSchool(EducationParams params) {

    }

    @Override
    public void onWentToUniversity(EducationParams params) {

    }

    @Override
    public void onGotWork(WorkParams params) {

    }

    @Override
    public void onBoughtCar(BoughtCarParams params) {

    }

    @Override
    public void onCreatingFamily(CreatingFamilyParams params) {

    }

    @Override
    public void onGaveBirth(GaveBirthParams params) {

    }

    @Override
    public void onDeath(Date date) {

    }
}
