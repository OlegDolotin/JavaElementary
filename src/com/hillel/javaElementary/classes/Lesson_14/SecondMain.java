package com.hillel.javaElementary.classes.Lesson_14;

import java.io.FileInputStream;
import java.io.IOException;

public class SecondMain {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data.txt")) {

            byte[] bytesData = new byte[fis.available()];
            fis.read(bytesData);
            String data = new String(bytesData);
            String[] arguments = data.split(" / ");
            Contact contact = new Contact(arguments[0], arguments[1], arguments[2], Integer.parseInt(arguments[3]));
            System.out.println(contact);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
