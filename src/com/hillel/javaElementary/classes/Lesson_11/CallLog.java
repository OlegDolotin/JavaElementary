package com.hillel.javaElementary.classes.Lesson_11;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class CallLog {
    private Contact contact;
    private Date timeEnd;
    private Time duration;
    private CallType callType;

    private CallLog(String number, Date timeEnd, CallType callType) {
        this.contact = new Contact("", number);
        this.timeEnd = timeEnd;
        this.callType = callType;
    }

    public CallLog (String number, Date timeEnd, CallType callType, Time duration){
        this.contact = new Contact("", number);
        this.timeEnd = timeEnd;
        this.callType = callType;
        this.duration = duration;
    }

    private CallLog(Contact contact, Date timeEnd, CallType callType) {
        this.contact = contact;
        this.timeEnd = timeEnd;
        this.callType = callType;
    }

    public static CallLog call(Contact contact, Date timeEnd, CallType callType){
        return new CallLog(contact, timeEnd, callType);
    }

    public static CallLog call(String number, Date timeEnd, CallType callType){
        return new CallLog(number, timeEnd, callType);
    }

    public Time getDuration() {
        return duration;
    }

    public CallType getCallType() {
        return callType;
    }

    public Contact getContact() {
        return contact;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallLog callLog = (CallLog) o;
        return Objects.equals(contact, callLog.contact) &&
                Objects.equals(timeEnd, callLog.timeEnd)&&
                Objects.equals(callType, callLog.callType)&&
                Objects.equals(duration, callLog.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, timeEnd, callType, duration);
    }

    @Override
    public String toString() {
        return contact.getName()+" "+timeEnd.toString()+" "+ callType.toString();
    }
}
