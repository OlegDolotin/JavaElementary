package com.hillel.javaElementary.classes.Lesson_14;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        FileWriterDemo.writeHello();
        FileWriterDemo.writeRandomNumbers();
        FileWriterDemo.readNumbers();

        Contact contact1 = new Contact("Danil","Chipchenskiy", "38096587363", 1998);
        Contact contact2 = new Contact("Oleg","Maruinsky", "380978327983", 2002);
        Contact contact3 = new Contact("Dima","Podzabornuy", "380956789663", 1988);
        Contact contact4 = new Contact("Jack","Born", "38096778363", 2001);
        Contact contact5 = new Contact("Vold","Parigskiy", "38096773363", 2000);
        Contact contact6 = new Contact("Voridiy","Boyrsiy", "38090987603", 1954);
        Contact contact7 = new Contact("Tima","Krivorogskyi", "38098760363", 1920);
        Contact contact8 = new Contact("Jackson","Volt", "38096329829", 1962);
        Contact contact9 = new Contact("Piter","Gus", "38096789673", 1940);
        Contact contact10 = new Contact("Kristina","Valusia", "38096873363", 1972);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);
        contacts.add(contact9);
        contacts.add(contact10);

        FileWriterDemo.writeContacts(contacts);
        System.out.println(FileWriterDemo.readContacts());
        FirstMain.main(new String[0]);
        SecondMain.main(new String[0]);
    }
}
