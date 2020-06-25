package day52_Collection;

import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,2,4,1,9,10,4,2));

        Collections.sort(list1);


        // 1. remove the duplicates and print out in ascending order

//        TreeSet<Integer> list2 = new TreeSet<>();
//
//        list2.addAll(list1);

        list1 = new ArrayList<>(new TreeSet<>(list1));

        System.out.println(list1);


        System.out.println("====================");

        //2. Write a program that can remove the duplicates and keep the order as it is

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,6,6,6,5,5,5,5,4,4,4,4,4));

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("=======================");


        ArrayList<String> letters = new ArrayList<>();

        letters.addAll(Arrays.asList("A","A","B","C","B","D"));

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result);


        // Write a program that can identify if tho string are build out of the same letters

        String str = "ABABABCDEF";
        String[]arr = str.split("");

        LinkedHashSet<String>ls = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(ls);









    }
}
