package com.hillel.javaElementary.classes.Lesson_10.ContactTable;

public class Pair<T, P> implements Comparable{
    private T object;
    private P count;

    public Pair(T object, P count) {
        this.object = object;
        this.count = count;
    }

    public T getObject() {
        return object;
    }

    public P getCount() {
        return count;
    }

    @Override
    public int compareTo(Object o) {
        Pair other = (Pair)o;
        if (other == this){
            return 0;
        }else{
            Integer temp = (Integer)count;
            return temp.compareTo((Integer)other.getCount());
        }
    }

    @Override
    public String toString() {
        Contact contact = (Contact)this.object;
        return contact.getName() + " " + count;
    }
}
