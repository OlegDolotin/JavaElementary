package com.hillel.javaElementary.classes.Lesson_7;

import java.util.Date;
import java.util.Random;

public class HumanLifecycle {

    public void startLife(IHumanLifecycleObserver observer){
        Random random = new Random();
        observer.onHumanWasBorn(random.nextBoolean(),
                          "Piter",
                                 new Date());
        observer.onWentToKindergarten("Cartoon",
                                      2);
        observer.onWentToSchool("Specialised number 40",
                                6);
        observer.onWentToUniversity("Sinergia",
                                    18);
        observer.onGotWork("Junior developer ",
                           700);
        observer.onBoughtCar("Mersedes 220 2001",
                             6400,
                             500000);
        observer.onCreatingFamily("Kris",
                                  24);
        observer.onGaveBirth("Don",
                              random.nextBoolean(),
                              new Date());
        observer.onDeath(new Date(3452342));
    }
}
