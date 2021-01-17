package aaCollections.List_;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class _03List_Iterator {
    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>(Arrays.asList(3d, 4d, 27d, 66d, 3d, 3d, 44d));

        //list iterator
        ListIterator<Double> lstIter = lst.listIterator();

        System.out.println(lstIter.hasNext());

        while (lstIter.hasNext()) {
            System.out.println(lstIter.nextIndex());
            double item = lstIter.next();
            System.out.println(item + " ");

            if (item < 10) {
                lstIter.remove();
            }
        }
        System.out.println(lst);

        System.out.println(lstIter.hasPrevious());
        System.out.println(lstIter.previousIndex());


        while (lstIter.hasPrevious()){
            System.out.println("lstIter.previousIndex() "+lstIter.previousIndex());
            double item  =lstIter.previous();
            System.out.println("| Item is "+item);
        }


    }
}

