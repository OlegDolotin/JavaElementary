package com.hillel.javaElementary.classes.Lesson_13;

public class MyDomainException extends Exception{
    private String message = "Doesn't match regex!";

    @Override
    public String getMessage() {
        return message;
    }


}
