package com.hillel.javaElementary.classes.Lesson_7;

import java.util.Date;
import java.util.Objects;

public class NetworkReportingLifecycleObserver implements IHumanLifecycleObserver {
    private Objects networkService;

    /**
     * The class is stub! Nothing to do !
     *
     * @param gender
     * @param name
     * @param birthday
     */

    @Override
    public void onHumanWasBorn(boolean gender, String name, Date birthday) {
//        networkService.sendRequest(String.format("gender=%s, name=%s, birthday=%s",
//                                   gender ? "Male" :"Female",
//                                   name,
//                                   birthday.getTime()));
    }

    @Override
    public void onWentToKindergarten(String kindergartenName, int age) {

    }

    @Override
    public void onWentToSchool(String schoolName, int age) {

    }

    @Override
    public void onWentToUniversity(String universityName, int age) {

    }

    @Override
    public void onGotWork(String position, int salary) {

    }

    @Override
    public void onBoughtCar(String brand, int cost, int age) {

    }

    @Override
    public void onCreatingFamily(String wifeName, int age) {

    }

    @Override
    public void onGaveBirth(String childName, boolean gender, Date birthday) {

    }

    @Override
    public void onDeath(Date date) {

    }
}
