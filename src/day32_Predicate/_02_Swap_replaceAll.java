package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _02_Swap_replaceAll {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1,2,3,4,5)); //1,2,3,4,5 -> 5,2,3,4,1

        Collections.swap(list,0,4);
        System.out.println(list);

        System.out.println("=============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet","Ahmet","Mehmet","Kerim","Ahmet"));
        /*
        names.set(0,"cabbar");
        names.set(1,"cabbar");
        names.set(4,"cabbar");

         */
        Collections.replaceAll(names,"Ahmet","Cabbar");
        System.out.println(names);










    }
}