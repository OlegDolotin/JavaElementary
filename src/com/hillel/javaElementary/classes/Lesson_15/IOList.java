package com.hillel.javaElementary.classes.Lesson_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOList {

    public void writeList(File file, List<String> list){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeShort(list.size());
            for (String element: list){
                dos.writeUTF(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readList(File file){
        List<String> output = new ArrayList<>();

        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            short size = dis.readShort();
            for (int i = 0; i < size; i++){
                output.add(dis.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

}
