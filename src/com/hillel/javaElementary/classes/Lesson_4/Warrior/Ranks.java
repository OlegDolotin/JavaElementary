package com.hillel.javaElementary.classes.Lesson_4.Warrior;

public enum Ranks {
    Pushover(0),
    Novice(1),
    Fighter(2),
    Warrior(3),
    Veteran(4),
    Sage(5),
    Elite(6),
    Conqueror(7),
    Champion(8),
    Master(9),
    Greatest(10);

    private int ordinal;

    Ranks(int i) {
        ordinal = i;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public static Ranks get(int index){
        return Ranks.values()[index];
    }
}
