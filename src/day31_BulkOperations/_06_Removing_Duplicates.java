package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_Removing_Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer>result = new ArrayList<>();
                // expected result 1,2,3

        for(Integer each : list){
            if(!result.contains(each)){
                result.add(each);
            }

        }
        System.out.println(result);




    }
}
