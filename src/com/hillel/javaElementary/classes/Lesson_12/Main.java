package com.hillel.javaElementary.classes.Lesson_12;


import java.util.*;
import java.lang.reflect.Array;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Oleg","0976543247");
        Contact contact2 = new Contact("Slava","0976876578");
        Contact contact3 = new Contact("Danil","0976765454");

        Message message1 = new Message(contact1, "dsjkflsdjfslds");
        Message message2 = new Message(contact2, "sdfksldsfdsfds");
        Message message3 = new Message(contact3, "sdflslfsd;s;fs");

        CallLog callLog1 = CallLog.call(contact1, new Date(), CallType.incoming);
        CallLog callLog2 = CallLog.call(contact2, new Date(), CallType.canceled);
        CallLog callLog3 = CallLog.call(contact3, new Date(), CallType.outcoming);

        Collection<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        Collection<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);
        messages.add(message3);

        Collection<CallLog> logs = new ArrayList<>();
        logs.add(callLog1);
        logs.add(callLog2);
        logs.add(callLog3);


        try {
            Contact[] arr1 = toArray(contacts, new Contact[2]);
            Message[] arr2 = toArray(messages, new Message[0]);
            CallLog[] arr3 = toArray(logs, new CallLog[0]);
            for (int i = 0; i < arr1.length; i++){
                System.out.println(arr1[i].toString());
            }

            System.out.println();

            for (int i = 0; i < arr2.length; i++){
                System.out.println(arr2[i].toString());
            }

            System.out.println();

            for (int i = 0; i < arr3.length; i++){
                System.out.println(arr3[i].toString());
            }
            System.out.println();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Collection<Contact> forCheckingContacts = filter(contacts, value -> value.getName().contains("O"));
        System.out.println(forCheckingContacts);
        System.out.println();


        String input = "0976876578";
        forCheckingContacts = filter(contacts, value -> value.getName().contains(input) || value.getNumber().equals(input));
        System.out.println(forCheckingContacts);
        System.out.println();

        Collection<Message> forCheckingMessages = filter(messages, value -> value.getContact().equals(contact2) );
        System.out.println(forCheckingMessages);
        System.out.println();


        forCheckingMessages = filter(messages, value -> value.getContact().getName().contains(input) ||
                                               value.getContact().getNumber().equals(input) ||
                                               value.getMessage().contains(input));
        System.out.println(forCheckingMessages);
        System.out.println();

        Collection<CallLog> forCheckingCallLogs = filter(logs, value -> value.getContact().getNumber().equals(contact3.getNumber()));
        System.out.println(forCheckingCallLogs);
        System.out.println();

        forCheckingCallLogs = filter(logs, value -> value.getContact().getName().contains(input) ||
                                                    value.getContact().getNumber().equals(input));
        System.out.println(forCheckingCallLogs);
        System.out.println();

        Deque<Contact> contactQueue = new LinkedList<>();
        DequeWrapper<Contact> wrapper = new DequeWrapper<>(contactQueue);
        //FiFo
        wrapper.add(contact1, Flag.FiFo);
        wrapper.add(contact2, Flag.FiFo);
        wrapper.add(contact3, Flag.FiFo);
        wrapper.print(Flag.FiFo);

        wrapper.clear();
        System.out.println();

        //LiFo
        wrapper.add(contact1, Flag.LiFo);
        wrapper.add(contact2, Flag.LiFo);
        wrapper.add(contact3, Flag.LiFo);
        wrapper.print(Flag.LiFo);

    }

    public void add(){

    }

    public static<T> Collection<T> filter(Collection<T> collection, Predicate<T> predicate){
        Collection<T> result = new ArrayList<>();

        for (T element: collection){
            if (predicate.test(element)){
                result.add(element);
            }
        }
        return result;
    }

    public static<T> T[] toArray(Collection<T> collection, T[] input) throws ClassNotFoundException{
        T[] result;

        if(input.length != collection.size()){
            result = (T[]) Array.newInstance(getClass(collection), collection.size());
        }else {
            result = input;
        }

        int i = 0;
        for (T element: collection){
            result[i++] = element;
        }
        return result;
    }

    public static <T>  Class<?> getClass(Collection<T> collection) throws ClassNotFoundException{
        Class<?> tClass = null;
        Iterator<T> iterator = collection.iterator();

        if (iterator.hasNext()){
            try {
                tClass = Class.forName(iterator.next().getClass().getName()+"");

            }catch (ClassNotFoundException e){
                throw e;
            }
        }
        return tClass;
    }
}
