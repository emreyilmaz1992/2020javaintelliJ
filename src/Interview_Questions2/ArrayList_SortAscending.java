package Interview_Questions2;

import java.util.*;

public class ArrayList_SortAscending {
    public static void main(String[] args) {

        //Write a method that can sort the ArrayList in Ascending order without using the sort method

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(100,12,33,14,54,16,7,8,9,101,200,300));
        SortedSet<Integer> reverse = new TreeSet<>(list1);
        System.out.println(reverse);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(100,12,33,14,54,16,7,8,9,101,200,300));

        Collections.sort(list2, Collections.reverseOrder());




    }
    public static void ascendingOrder(ArrayList arr){



    }


}
