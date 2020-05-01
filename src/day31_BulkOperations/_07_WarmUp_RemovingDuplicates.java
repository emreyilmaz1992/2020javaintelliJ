package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _07_WarmUp_RemovingDuplicates {
    public static void main(String[] args) {
        ArrayList<String >list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","A","D","D"));

        ArrayList<String> result = new ArrayList<>();

       // int count = Collections.frequency(list,list.get(0));

        for (int i = 0; i <list.size() ; i++) {

            int count = Collections.frequency(list,list.get(i));

            if (count > 1) {
                if(!result.contains(list.get(i)))
                result.add(list.get(i));
            }
        }
        System.out.println(result);




    }
}
