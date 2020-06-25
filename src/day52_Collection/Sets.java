package day52_Collection;

import java.util.*;

public class Sets {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("Orhan");
        names.add("Ayhan");
        names.add("Kenan");
        names.add("Kerim");
        names.add("Kerim");
        names.add("Kerim");
        names.add("Kerim");
        System.out.println(names);// does not accept duplicates also list is not in order


        String[]arr = {"A","A","C","B","A"};//

        LinkedHashSet<String > set1 = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println("====================");

        Set<Integer> numbers = new TreeSet<>(); //TreeSet does not accept duplicates and has sorted order

                    numbers.addAll(Arrays.asList(10,9,10,8,7,7,5,6));

        System.out.println(numbers);

        System.out.println("====================");



        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(null);
        System.out.println(treeSet); // it does not allow null. but hashset  does accept the null





    }
}
