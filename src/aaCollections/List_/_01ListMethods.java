package aaCollections.List_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class _01ListMethods {

    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));
        System.out.println(lst);

        lst.add(1,5d); // adds it to index number you want
        System.out.println(lst);

        lst.set(0,90d);
        System.out.println(lst);

        System.out.println(lst);
        System.out.println(lst.indexOf(3d)); // first occurred

        System.out.println(lst.lastIndexOf(3d)); //last occurred

        //if not found , returns -1

        lst.addAll(2,Arrays.asList(99d,89d)); // will added 2 elements at index 2
        System.out.println(lst);

        lst.replaceAll(each -> each+5);
        System.out.println(lst); // everything will be increased by value 5

        lst.sort(null); // this sorts ascending without using the collection.sort
        System.out.println(lst);

        lst.sort(Comparator.reverseOrder()); // in descending order
        System.out.println(lst);

        lst.sort(Comparator.naturalOrder()); // in ascending order
        System.out.println(lst);












    }

}
