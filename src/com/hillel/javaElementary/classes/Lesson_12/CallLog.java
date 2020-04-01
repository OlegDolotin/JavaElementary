package com.hillel.javaElementary.classes.Lesson_12;

import java.util.Date;
import java.util.Objects;

public class CallLog {
    private Contact contact;
    private Date timeStart;
    private CallType callType;

    private CallLog(String number, Date timeStart, CallType callType) {
        this.contact = new Contact("", number);
        this.timeStart = timeStart;
        this.callType = callType;
    }

    private CallLog(Contact contact, Date timeEnd, CallType callType) {
        this.contact = contact;
        this.timeStart = timeEnd;
        this.callType = callType;
    }

    public static CallLog call(Contact contact, Date timeEnd, CallType callType){
        return new CallLog(contact, timeEnd, callType);
    }

    public static CallLog call(String number, Date timeEnd, CallType callType){
        return new CallLog(number, timeEnd, callType);
    }

    public Contact getContact() {
        return contact;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallLog callLog = (CallLog) o;
        return Objects.equals(contact, callLog.contact) &&
                Objects.equals(timeStart, callLog.timeStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, timeStart);
    }

    @Override
    public String toString() {
        return contact.getName()+" "+ timeStart.toString()+" "+ callType.toString();
    }
}
