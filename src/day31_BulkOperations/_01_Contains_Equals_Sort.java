package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class _01_Contains_Equals_Sort {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();
                    list1.add("A");
                    list1.add("B");
                    list1.add("C");
                    list1.add("D");


                boolean b1 =    list1.contains("A"); //true
        System.out.println(b1);


        ArrayList<String> list2 = new ArrayList<>();
                   list2.add("A");
                   list2.add("B");
                   list2.add("D");
                   list2.add("C");

        Collections.sort(list1); // ABCD
        Collections.sort(list2); // ABCD

        boolean b2 = list1.equals(list2);

        System.out.println(b2); // true -> has to be same order too
        System.out.println("=============================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.add(10);    //sort them in descending order
                    list3.add(100);
                    list3.add(30);
                    list3.add(-10);


        Collections.sort(list3);

        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = list3.size()-1; i >=0 ; i--) {

            list4.add(list3.get(i)); // never use +=. doesn't work

        }
        list3 = list4;
        System.out.println(list3);





    }
}
