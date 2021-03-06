package aye001.Collections;

import java.util.*;

public class SortedSet {
    public static void main(String[] args) {


        java.util.SortedSet<Integer> longTreeSet = new TreeSet<>();
        Set<Integer> wer = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,5,4,3,2,1));
        System.out.println(wer.size());
        System.out.println("wer.stream().findFirst() = " + wer.stream().findFirst());




        longTreeSet.add(7);
        longTreeSet.add(8);
        longTreeSet.add(9);
        longTreeSet.add(7);
        longTreeSet.add(70);
        longTreeSet.add(70);

        System.out.println(longTreeSet);
        System.out.println(longTreeSet.stream().findFirst());
        System.out.println(longTreeSet.size());

        // System.out.println(longTreeSet.stream());

        // No duplication and sorted

        int[] arr= {1,2,3,3,4,4,5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,6));



        java.util.SortedSet<Integer> uniqueSorted = new TreeSet<>(list);
        // here must be SortedSet. otherwise we cannot apply the methods below
        System.out.println(uniqueSorted);

        System.out.println("count"+uniqueSorted.stream().count());
        System.out.println(uniqueSorted.first());
        System.out.println(uniqueSorted.last());

        System.out.println("subset"+uniqueSorted.subSet(3,6)); // returns everything before 4

        System.out.println(uniqueSorted.tailSet(2)); //returns everything after  2 . 2 included

        java.util.SortedSet<Integer> tailView = uniqueSorted.tailSet(3);
        System.out.println(tailView); // 3, 4, 5
        System.out.println(uniqueSorted); // 1, 2, 3, 4, 5





























    }
}
