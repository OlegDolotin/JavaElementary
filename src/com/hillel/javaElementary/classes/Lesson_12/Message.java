package com.hillel.javaElementary.classes.Lesson_12;

import java.util.Objects;

public class Message {
    private Contact contact;
    private String message;


    public Message(String number, String message) {
        this.contact = new Contact("", number);
        this.message = message;
    }

    public Message(Contact contact, String message) {
        this.contact = contact;
        this.message = message;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(contact, message1.contact) &&
                Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, message);
    }

    @Override
    public String toString() {
        return contact + " "+message;
    }
}
