package com.hillel.javaElementary.classes.Lesson_15;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class IOStudent {

    public void writeStudent(Student student, File file){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeUTF(student.getName());
            dos.writeUTF(student.getPhoneNumber());
            dos.writeInt(student.getYearOfBirth());
            dos.writeBoolean(student.isExcellentStudent());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readStudent(File file){
        Student output = new Student();
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            output.setName(dis.readUTF());
            output.setPhoneNumber(dis.readUTF());
            output.setYearOfBirth(dis.readInt());
            output.setExcellentStudent(dis.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }
}
