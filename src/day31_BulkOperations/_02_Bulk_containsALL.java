package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_Bulk_containsALL {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
                 list1.add(10);
                 list1.add(20);
                 list1.add(30);
                 list1.add(40);

        // if 10,20,60 if all objects are exist in arrayList - > true , otherwise -> false

       boolean b1 = list1.containsAll(Arrays.asList(10,20,60));
       System.out.println(b1); // false


        Integer[] data = {10, 30, 40};

        boolean b2 = list1.containsAll(Arrays.asList(data)); // true
        System.out.println(b2);







    }
}
