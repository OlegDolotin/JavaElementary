package com.hillel.javaElementary.classes.Lesson_14;

import java.io.FileWriter;
import java.io.IOException;

public class FirstMain {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("data.txt")) {

            writer.write("Olegator / Dolotin / 0972376483 / 2000");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
