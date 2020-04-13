package com.hillel.javaElementary.classes.Lesson_15;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Slava","076273873", 1999, true);
        Student student2 = new Student("Danil","023402343", 1999, false);
        Student student3 = new Student("Oleg","087678877", 2000, false);

        student1.addFriend(student2);
        student1.addFriend(student3);

        IOStudent ioStudent = new IOStudent();
        ioStudent.writeStudent(student1,new File("student.bin"));
        System.out.println(ioStudent.readStudent(new File("student.bin")));

        List<String> strings = new ArrayList<>();
        strings.add("sdfsfsdfsdfsfs");
        strings.add("kjhjhjklklhjjh");
        strings.add("yutghkjlkbgdfk");
        strings.add("nmjsuydhksfisk");
        strings.add("ykl;'sdlsd,f.,");
        strings.add("hjaklds..f,,.a");

        IOList ioList = new IOList();
        ioList.writeList(new File("strings.bin"), strings);
        System.out.println(ioList.readList(new File("strings.bin")).toString());


        Contact contact1 = new Contact("Slava", "Pupkin", "0938276728", 1982);
        Contact contact2 = new Contact("Piter", "Levich", "0987632435", 1962);
        Contact contact3 = new Contact("Doc", "Poopovin", "0935465464", 1952);
        Contact contact4 = new Contact("Jack", "Onil", "0923242345", 1972);

        List<Contact> contacts  = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        IOContact ioContact = new IOContact();
        ioContact.writeContact(contacts, new File("contacts.bin"));
        System.out.println(ioContact.readContact(new File("contacts.bin")).toString());

        ioContact.writeContactsWithSerializing(contacts, new File("serialisedContacts.bin"));
        System.out.println(ioContact.readContactWithSerialising(new File("serialisedContacts.bin")).toString());

        File file = new File("d:/Programing/JavaElementary");

        System.out.println(CountFiles.countFiles(file));
    }
}
