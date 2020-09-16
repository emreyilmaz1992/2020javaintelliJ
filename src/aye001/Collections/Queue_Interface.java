package aye001.Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Interface {

    public static void main(String[] args) {


        Queue<Integer> numQue = new LinkedList<>();
        numQue.offer(1);
        numQue.offer(3);
        numQue.offer(4);
        numQue.offer(6);
        numQue.offer(8);
        numQue.addAll(Arrays.asList(4,9,66));

        // the purpose of queue is managing the data first in first out manner

        System.out.println(numQue);

        System.out.println(numQue.remove(4));


        System.out.println(numQue.remove());
        System.out.println(numQue.poll());
        // the both will delete the first numbers that are added
        System.out.println(numQue.peek()); // returns the next value that will be gone . it only displays it
        // does not do anything else

        System.out.println(numQue.element());// does the same thing with peek
        // difference between them is if there is no element left
        // element will throw an exception , peek will return a null value

       while(!numQue.isEmpty()){

           System.out.println("Done with "+numQue.poll());
       }
        System.out.println(numQue.size());



        System.out.println(numQue);


    }

}
