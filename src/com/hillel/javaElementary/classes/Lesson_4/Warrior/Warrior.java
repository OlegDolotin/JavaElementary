package com.hillel.javaElementary.classes.Lesson_4.Warrior;

public class Warrior {
    private Ranks rank;
    private int level;
    private int experience;

    public Warrior(){
        rank = Ranks.Pushover;
        level = 1;
        experience = 100;
    }

    public void battle(Warrior enemy) throws InvalidLevelException {
        if (enemy.level < 1 || enemy.level > 100){
            throw new InvalidLevelException("Invalid level");
        }
    }

    public Ranks getRank() {
        return rank;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}
