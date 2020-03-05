package com.hillel.javaElementary.classes.Lesson_4.Warrior;

import java.util.ArrayList;

public class Warrior {
    private Ranks rank;
    private int level;
    private int experience;
    private ArrayList<String> achievements;
    private static final int TOPEXPERIENCE = 10000;


    public Warrior(){
        rank = Ranks.Pushover;
        level = 1;
        experience = 100;
        achievements = new ArrayList<>();
    }

    public void battle(int level) throws InvalidLevelException {
        if (level < 1 || level > 100){
            throw new InvalidLevelException("Invalid level");
        }

        Ranks enemy = Ranks.get(level/10);
        if (enemy.compareTo(rank) >= 1 && level - this.level >= 5){
            System.out.println("You've been defeated");
            return;
        }

        int diff = this.level-level;

        if (this.level == level){
            addExperience(10);
            printResponses(level, diff);
            return;
        }

        if (diff == 1){
            addExperience(5);
            printResponses(level, diff);
            return;
        }

        if (diff >= 2){
            printResponses(level, diff);
            return;
        }

        if (level - this.level >= 1){
            int reverseDiff = level - this.level;
            addExperience(20*diff*diff);
            printResponses(level, diff);
        }
    }

    public void training(String achievement, int experience, int level){
        if (this.level <= level){

            achievements.add(achievement);
            addExperience(experience);
            System.out.println(achievement);

        }else{
            System.out.println("Not strong enough");
        }
    }

    private void printResponses(int level, int diff){
        if (diff >= 2){

            System.out.println("Easy fight");

        }else if (diff == level || diff == -1){

            System.out.println("A good fight");

        }else if (diff < -1){

            System.out.println("An intense fight");
        }
    }

    private void dataUpdate(){
        if (level >= 100){
            return;
        }
        level = experience / 100;
        rank = Ranks.get(level/10);
    }

    private void addExperience(int experience){
        if (this.experience + experience <= TOPEXPERIENCE){

            this.experience += experience;

        }else{

            this.experience = TOPEXPERIENCE;
        }
        dataUpdate();
    }

    public void rank() {
        System.out.println(rank);
    }

    public void level() {
        System.out.println(level);
    }

    public void experience() {
        System.out.println(experience);
    }

    public void achievements() {
        System.out.println(achievements.toString());
    }
}
