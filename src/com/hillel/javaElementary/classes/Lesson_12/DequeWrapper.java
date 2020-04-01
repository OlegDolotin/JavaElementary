package com.hillel.javaElementary.classes.Lesson_12;

import java.util.Deque;
import java.util.LinkedList;

public class DequeWrapper<T> {

    Deque<T> deque;

    public DequeWrapper(Deque<T> deque) {
        this.deque = deque;
    }

    public void add(T element, Flag flag){
        if (flag == Flag.FiFo){
            deque.offer(element);
        }else {
            deque.push(element);
        }
    }

    public void print(Flag flag){
        if (flag == Flag.FiFo){
            while (deque.peek() != null){
                System.out.println(deque.poll());
            }
        }else {
            while (deque.peek() != null){
                System.out.println(deque.pop());
            }
        }
    }

    public void clear(){
        deque = new LinkedList<>();
    }
}
