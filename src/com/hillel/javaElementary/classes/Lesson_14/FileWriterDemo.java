package com.hillel.javaElementary.classes.Lesson_14;

import com.hillel.javaElementary.classes.Lesson_10.ContactTable.Pair;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileWriterDemo {

    public static void writeHello(){

        try(FileWriter writer = new FileWriter("WriterDemo.txt")){

            writer.write("Hello, World!");

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void writeRandomNumbers(){


        try(BufferedWriter writer = new BufferedWriter(
                                    new OutputStreamWriter(
                                    new FileOutputStream("RandomNumbers.txt"), "UTF8"))) {

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
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        int sum = 0;

        try(Scanner scanner = new Scanner(new FileInputStream("RandomNumbers.txt"), Charset.forName("UTF-8"))){

            scanner.useDelimiter(",");
            while (scanner.hasNextInt()){
                if (count > 99){
                    break;
                }
                numbers.add(scanner.nextInt());
                sum += numbers.get(count);
                count++;
            }


            System.out.println(sum/numbers.size());
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

        try(BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(
                                            new FileInputStream("Contacts.txt"), Charset.forName("UTF-8")))){
            String line;
            String[]arguments;
            while ((line = reader.readLine()) != null){
                arguments = line.split(" / ");
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

