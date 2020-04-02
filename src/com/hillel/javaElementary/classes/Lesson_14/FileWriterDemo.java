package com.hillel.javaElementary.classes.Lesson_14;

import com.hillel.javaElementary.classes.Lesson_10.ContactTable.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class FileWriterDemo {

    public static void writeHello(){

        try(FileWriter writer = new FileWriter("WriterDemo.txt")){

            writer.write("Hello, World!");

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void writeRandomNumbers(){


        try(FileWriter writer = new FileWriter("RandomNumbers.txt")) {

            String output = "";
            for (int i = 0; i < 1000; i++){
                if (i != 999){
                    output +=random()+",";
                }else {
                    output +=random();
                }
            }

            writer.write(output);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static int random(){
        Random random = new Random();
        if (random.nextInt(2) == 0){
            return random.nextInt(501) * -1;
        }else{
            return random.nextInt(651);
        }

    }

    public static void readNumbers() {
        byte[] bytesData = new byte[440];

        try(InputStream stream = new FileInputStream("RandomNumbers.txt")){
            stream.read(bytesData);
            String line = new String(bytesData);
            String[] stringNumbers = line.split(",");
            int[] numbers = new int[100];
            int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                numbers[i] = Integer.parseInt(stringNumbers[i]);
                sum += numbers[i];
            }
            System.out.println(sum/numbers.length);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeContacts(List<Contact> contacts){
        try(FileWriter writer = new FileWriter("Contacts.txt")){

            for (Contact contact: contacts){
                writer.write(contact.getName()+" / "+
                                 contact.getSurname()+" / "+
                                 contact.getPhoneNumber()+" / "+
                                 contact.getYearOfBirth()+"\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Collection<Contact> readContacts(){
        byte[] bytesData;
        ArrayList<Contact> contacts = new ArrayList<>();

        try(FileInputStream fis = new FileInputStream("Contacts.txt")){
            bytesData = new byte[fis.available()];
            fis.read(bytesData);

            String data = new String(bytesData);
            String[] lines = data.split("\n");
            String[] arguments;

            for (int i = 0; i < lines.length; i++){
                arguments = lines[i].split(" / ");
                contacts.add(new Contact(arguments[0], arguments[1], arguments[2], Integer.parseInt(arguments[3])));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        contacts = sortByYearOfBirth(contacts);

        return contacts.subList(0, 5);
    }

    private static ArrayList<Contact> sortByYearOfBirth(ArrayList<Contact> contacts){
        Contact temp;
        for (int i = 0; i < contacts.size() - 1; i++){
            for (int j = i+1; j < contacts.size(); j++){
                if (contacts.get(i).getYearOfBirth() > contacts.get(j).getYearOfBirth()){
                    temp = contacts.get(i);
                    contacts.set(i, contacts.get(j));
                    contacts.set(j, temp);
                }
            }
        }
        return contacts;
    }
}

