package com.hillel.javaElementary.classes.Lesson_4.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior bruce_lee = new Warrior();
        bruce_lee.level();        // => 1
        bruce_lee.experience();   // => 100
        bruce_lee.rank();         // => "Pushover"
        bruce_lee.achievements(); // => []
        bruce_lee.training("Defeated Chuck Norris", 9000, 1); // => "Defeated Chuck Norris"
        bruce_lee.experience();   // => 9100
        bruce_lee.level();        // => 91
        bruce_lee.rank();         // => "Master"
        try {
            bruce_lee.battle(90);     // => "A good fight"
        }catch (InvalidLevelException e){
            System.out.println(e.getStackTrace());
        }
        bruce_lee.experience();   // => 9105
        bruce_lee.achievements(); // => ["Defeated Chuck Norris"]
    }


}
