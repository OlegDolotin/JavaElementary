package com.hillel.javaElementary.classes.Lesson_4.NotPeople;

import com.hillel.javaElementary.classes.Lesson_4.People.Teacher;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Lesson {
    private Group group;
    private Teacher teacher;
    private GregorianCalendar date;
    private String subject;
    private Room room;

    public Lesson(Group group, Teacher teacher, GregorianCalendar date, String subject, Room room) {
        this.group = group;
        this.teacher = teacher;
        this.date = date;
        this.subject = subject;
        this.room = room;
    }

    public Group getGroup() {
        return group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Lesson)){
            return false;
        }
        Lesson other = (Lesson)obj;
        return  this.getDate().equals(other.getDate()) &&
                this.room.getRoomNumber() == other.room.getRoomNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, teacher, group, subject, room);
    }
}
