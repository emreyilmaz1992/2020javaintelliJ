package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(); // this is has to be arrayList in order to create object.cuz list is interface.
        //list1 here is the object

      //  List<Integer>list20 = new Lis

        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("====================");

        ArrayList<Integer>arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        System.out.println("====================="); // when u hear last in first out  know that its  stack


        Stack <String> names = new Stack<>();

        names.add("Orhan");
        names.add("Yasin");
        names.add("Ali");
        names.add("Atakan");
        names.add("Emre");
        System.out.println(names);

        String s1 = names.pop(); // "Emre"
        System.out.println(s1);
        System.out.println(names);

        String s2 = names.pop(); // Atakan
        System.out.println(names);




    }

}
