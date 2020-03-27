package com.hillel.javaElementary.classes.Lesson_10;

import com.hillel.javaElementary.classes.Lesson_10.ContactTable.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("Piter", "0964284532");
        Contact contact2 = new Contact("Olegator", "0982424242");
        Contact contact3 = new Contact("Olegator", "0982424242");
        Contact contact4 = new Contact("Sasha", "0156798462");
        Contact contact5 = new Contact("Juke", "0654168754");
        Contact contact6 = new Contact("Juke", "0654168754");
        Contact contact7 = new Contact("Mike", "0654568754");
        Contact contact8 = new Contact("Call", "0654164554");
        Contact contact9 = new Contact("Pak", "0654163254");


        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);
        contacts.add(contact9);


        List<Message> messages = new ArrayList<>();

        Message message1 = new Message(contact1, "aaaaaaaaaaaaaaaaa");
        Message message6 = new Message(contact1, "dsfsfsdsfsdfsdfds");
        Message message10 = new Message(contact1, "dhdsdfgasdgasdsdg");
        Message message7 = new Message(contact1, "sdgs,dgmsdlgssdgl");
        Message message5 = new Message(contact5, "aaaaaaaaaaaaaaaaa");
        Message message2 = new Message(contact2, "bbbbbbbbbbbbbbbbb");
        Message message8 = new Message(contact2, "ererdgdfgergdgrdd");
        Message message9 = new Message(contact2, "bdsfsfsstsdstssts");
        Message message3 = new Message(contact3, "ccccccccccccccccc");
        Message message4 = new Message(contact4, "ddddddddddddddddd");
        Message message11 = new Message(contact7, "sdsgdgdsgdsgdsds");
        Message message12 = new Message(contact8, "sdgsdgdsdsgsddsg");
        Message message13= new Message(contact9, "sdgsdks;gdsd;lgdg");

        messages.add(message1);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);
        messages.add(message5);

        List<CallLog> callLogs = new ArrayList<>();

        CallLog callLog1 = CallLog.call(contact1, new Date(536543252), CallType.incoming);
        CallLog callLog2 = CallLog.call(contact2, new Date(484634314), CallType.canceled);
        CallLog callLog3 = CallLog.call(contact3, new Date(231654464), CallType.outcoming);
        CallLog callLog4 = CallLog.call(contact4, new Date(348965498), CallType.outcoming);
        CallLog callLog5 = CallLog.call(contact5, new Date(348965498), CallType.incoming);

        callLogs.add(callLog1);
        callLogs.add(callLog2);
        callLogs.add(callLog3);
        callLogs.add(callLog4);
        callLogs.add(callLog5);

        Collection<Contact> contacts1 = findC(contacts, "Olegator");
        System.out.println(contacts1.toString());
        Collection<Message> messages1 = findM(messages, "Olegator");
        System.out.println(messages1.toString());
        Collection<CallLog> callLogs1 = findL(callLogs, "Olegator");
        System.out.println(callLogs1.toString());
        Map<String, Contact> map1 = new HashMap<>();
        map1.put(contact1.getName(), contact1);
        map1.put(contact2.getName(), contact2);
        map1.put(contact3.getName(), contact3);
        map1.put(contact4.getName(), contact4);
        map1.put(contact5.getName(), contact5);
        System.out.println(map1.toString());

        Map<String, List<CallLog>> map2 = new HashMap<>();
        List<CallLog> callLogList1 = new ArrayList<>();

        callLogList1.add(CallLog.call(contact1, new Date(536543252), CallType.incoming));
        callLogList1.add(CallLog.call(contact1, new Date(536543321), CallType.outcoming));
        callLogList1.add(CallLog.call(contact1, new Date(536543544), CallType.outcoming));
        callLogList1.add(CallLog.call(contact1, new Date(536543345), CallType.incoming));
        callLogList1.add(CallLog.call(contact1, new Date(536543945), CallType.canceled));
        callLogList1.add(CallLog.call(contact1, new Date(536543245), CallType.incoming));
        callLogList1.add(CallLog.call(contact1, new Date(536543732), CallType.incoming));

        List<CallLog> callLogList2 = new ArrayList<>();

        callLogList2.add(CallLog.call(contact2, new Date(657899678), CallType.outcoming));
        callLogList2.add(CallLog.call(contact2, new Date(657899541), CallType.incoming));
        callLogList2.add(CallLog.call(contact2, new Date(657899765), CallType.incoming));
        callLogList2.add(CallLog.call(contact2, new Date(657899854), CallType.outcoming));
        callLogList2.add(CallLog.call(contact2, new Date(657899543), CallType.canceled));

        map2.put(contact1.getName(), callLogList1);
        map2.put(contact2.getName(), callLogList2);
        System.out.println(map2.toString());

        List<Pair<Contact, Integer>> pairs = new ArrayList<>();

        Pair<Contact, Integer> pair1 = new Pair<>(contact1, 5);
        Pair<Contact, Integer> pair2 = new Pair<>(contact2, 1);
        Pair<Contact, Integer> pair3 = new Pair<>(contact3, 8);
        Pair<Contact, Integer> pair4 = new Pair<>(contact4, 31);
        Pair<Contact, Integer> pair5 = new Pair<>(contact5, 13);
        Pair<Contact, Integer> pair6 = new Pair<>(contact6, 20);

        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);
        pairs.add(pair4);
        pairs.add(pair5);
        pairs.add(pair6);

        topFive(pairs);

        List<Message> messageList1 = new ArrayList<>();
        messageList1.add(message1);
        messageList1.add(message6);
        messageList1.add(message10);
        messageList1.add(message7);

        List<Message> messageList2 = new ArrayList<>();
        messageList2.add(message2);
        messageList2.add(message8);
        messageList2.add(message9);


        Map<Contact,List<Message>> messagesByContact = new HashMap<>();
        messagesByContact.put(contact1, messageList1);
        messagesByContact.put(contact2,messageList2);

        System.out.println(messagesByContact);

        List<Message> messageList = new ArrayList<>();
        messageList.add(message1);
        messageList.add(message2);
        messageList.add(message3);
        messageList.add(message4);
        messageList.add(message5);
        messageList.add(message6);
        messageList.add(message7);
        messageList.add(message8);
        messageList.add(message9);
        messageList.add(message10);
        messageList.add(message11);
        messageList.add(message12);
        messageList.add(message13);

        topFiveContactsByMessageCount(messageList);

    }

    public static <T> List<Pair<T, Integer>> topFive(List<Pair<T, Integer>> pairs){
        Pair<T, Integer> temp;
        for (int i = 0; i < pairs.size()-1; i++){
            for (int j = i+1; j < pairs.size(); j++){
                if (pairs.get(i).compareTo(pairs.get(j)) < 0){
                    temp = pairs.get(i);
                    pairs.set(i, pairs.get(j));
                    pairs.set(j, temp);
                }
            }
        }
        for (int i = 5; i < pairs.size(); i++){
            pairs.remove(i);
        }
        System.out.println(pairs.toString());
        return pairs;
    }

    public static void topFiveContactsByMessageCount(List<Message> messages){
        Map<Contact, Integer> result = new HashMap<>();

        Integer count;
        Integer test;
        for (Message message: messages){
            test = result.get(message.getContact());
            count = test == null ? 0 : test;
            result.put(message.getContact(), count+1);
        }



        Map<Contact, Integer> sortedResult = new TreeMap<>(result);
        System.out.println(sortedResult.toString());
    }



    public static Collection<Contact> findC(Collection<Contact> contacts, String text){
        Collection<Contact> result = new ArrayList<>();
        for (Contact tempContact: contacts){
            if (tempContact.getName().equals(text) || tempContact.getNumber().equals(text)){
                result.add(tempContact);
            }
        }
        return result;
    }

    public static Collection<Message> findM(Collection<Message> messages, String text){
        Collection<Message> result = new ArrayList<>();
        for (Message tempMessage: messages){
            if (tempMessage.getContact().getName().equals(text) ||
                    tempMessage.getContact().getNumber().equals(text) ||
                    tempMessage.getMessage().contains(text)){
                result.add(tempMessage);
            }
        }
        return result;
    }

    public static Collection<CallLog> findL(Collection<CallLog> logs, String text){
        Collection<CallLog> result = new ArrayList<>();
        for (CallLog tempLog: logs){
            if (tempLog.getContact().getName().equals(text) ||
                    tempLog.getContact().getNumber().equals(text)){
                result.add(tempLog);
            }
        }
        return result;
    }


}
