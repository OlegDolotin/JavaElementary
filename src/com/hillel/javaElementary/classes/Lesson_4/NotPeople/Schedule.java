package com.hillel.javaElementary.classes.Lesson_4.NotPeople;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Schedule {
    private ArrayList<Lesson> lessons;

    public Schedule(){
        lessons = new ArrayList<>();
    }

    public boolean add(Lesson lesson){
        for (Lesson temp: lessons) {
            if (temp.equals(lesson)&& temp.getDate().getTimeInMillis()+5400 > lesson.getDate().getTimeInMillis()){
                return false;
            }
        }
        lessons.add(lesson);
        return true;
    }

    public void sortByDateTime(){
        Lesson temp;
        for (int i = 0; i < lessons.size()-1; i++){
            for (int j = i+1; j < lessons.size(); j++){
                if (lessons.get(i).getDate().compareTo(lessons.get(j).getDate()) > 0){
                    temp = lessons.get(i);
                    lessons.set(i, lessons.get(j));
                    lessons.set(j, temp);
                }
            }
        }
    }

    public String printSchedule(){
        String output = "Date and Time      |    Subject    |    Room    |     Teacher     |    Group\n";
        GregorianCalendar date;
        for (Lesson temp: lessons) {
            date = temp.getDate();
            output += date.get(Calendar.DATE)+"."+date.get(Calendar.MONTH)+"."+date.get(Calendar.YEAR)+" "+
                      date.get(Calendar.HOUR_OF_DAY)+":"+date.get(Calendar.MINUTE)+":"+ date.get(Calendar.SECOND)+"   |"+
                      "      "+temp.getSubject()+"      |     "+temp.getRoom().getRoomNumber()+"    | "+temp.getTeacher().getName()+"  | "+
                      temp.getGroup().getGroupNumber()+"\n";
        }
        return output;
    }

}
