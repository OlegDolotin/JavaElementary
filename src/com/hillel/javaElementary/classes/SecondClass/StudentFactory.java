package com.hillel.javaElementary.classes.SecondClass;

import java.util.Random;

public class StudentFactory {

    private final static String[] names = new String[3];
    private final static String[] genders = new String[2];
    private Random random = new Random();

    static {
        names[0] = "Bob Morley";
        names[1] = "Jack Swim";
        names[2] = "Jennis Palon";
        genders[0] = "men";
        genders[1] = "girl";
    }

    public Student createStudent(String fullName, String gender){
        return new Student(getRandomName(), getRandomGender(), getValidRandomValue(), getValidRandomValue());
    }

    private int getValidRandomValue(){
        int value = -1;
        while (value < 0){
            value = random.nextInt(101);
        }
        return value;
    }

    private String getRandomName(){
        return names[random.nextInt(names.length)];
    }

    private String getRandomGender(){
        return genders[random.nextInt(genders.length)];
    }


}
