package aye001.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Interface {

    public static void main(String[] args) {


        Deque<Integer> dque = new ArrayDeque<>();

        dque.push(1);
        dque.push(3);
        dque.push(4);
        dque.push(6);
        dque.push(8);
        dque.push(20);
        System.out.println(dque);

        //the last item that pushed will be the first item show up when we print the queue

        System.out.println(dque.pop()); //20
        // last in first out

        while (!dque.isEmpty()){
            System.out.println("Removing items "+dque.pop());
        }


    }
}
