package com.hillel.javaElementary.classes.Lesson_8.Task_5;

import java.util.Date;
import java.util.Random;
import com.hillel.javaElementary.classes.Lesson_8.Task_5.IHumanLifecycleObserver.*;

public class HumanLifecycle {

    public void startLife(IHumanLifecycleObserver observer){
        Random random = new Random();
        observer.onHumanWasBorn(new BornParams(random.nextBoolean(),
                                              "Piter",
                                               new Date()));
        observer.onWentToKindergarten( new EducationParams("Cartoon",
                                                           2));
        observer.onWentToSchool(new EducationParams("Specialised number 40",
                                                    6));
        observer.onWentToUniversity(new EducationParams("Sinergia",
                                                        18));
        observer.onGotWork( new WorkParams("Junior developer ",
                                           700));
        observer.onBoughtCar( new BoughtCarParams("Mersedes 220 2001",
                                                  6400,
                                                  500000));
        observer.onCreatingFamily( new CreatingFamilyParams("Kris",
                                                            24));
        observer.onGaveBirth( new GaveBirthParams("Don",
                                                  random.nextBoolean(),
                                                  new Date()));
        observer.onDeath(new Date(3452342));
    }
}
