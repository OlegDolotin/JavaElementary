package com.hillel.javaElementary.classes.Lesson_11;

import com.hillel.javaElementary.classes.Lesson_10.ContactTable.Pair;

import java.util.*;

public class Functional {




    public static <T> void uniqElements(List<T> input){
        Set<T> result = new HashSet<>(input);
        System.out.println(result);
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

