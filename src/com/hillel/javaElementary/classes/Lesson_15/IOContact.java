package com.hillel.javaElementary.classes.Lesson_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOContact {

    public void writeContact(List<Contact> contacts, File file){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeShort(contacts.size());
            for (Contact contact: contacts){
                dos.writeUTF(contact.getName());
                dos.writeUTF(contact.getSurname());
                dos.writeUTF(contact.getPhoneNumber());
                dos.writeInt(contact.getYearOfBirth());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeContactsWithSerializing(List<Contact> contacts, File file){
        try(ObjectOutputStream oos = new ObjectOutputStream(
                                         new DataOutputStream(
                                             new FileOutputStream(file)))) {
            oos.writeShort(contacts.size());
            for (Contact contact: contacts){
                oos.writeObject(contact);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Contact> readContact(File file){
        List<Contact> result = new ArrayList<>();
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            short size = dis.readShort();
            for (int i = 0; i < size; i++){
                result.add(new Contact(dis.readUTF(), dis.readUTF(), dis.readUTF(),dis.readInt()));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }

    public List<Contact> readContactWithSerialising(File file){
        List<Contact> result = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(
                                        new DataInputStream(
                                            new FileInputStream(file)))){
            short size = ois.readShort();
            while (size-- !=0 ){
                result.add((Contact)ois.readObject());
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }


}
