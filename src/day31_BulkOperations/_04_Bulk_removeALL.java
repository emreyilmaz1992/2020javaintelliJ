package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_Bulk_removeALL {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,3,2,2,2,2,2,2,3,3));

        // remove 1,3,5,8

        Integer a  =1;
        list.remove(a);
        list.remove(a); // to delete both  "1"

        list.removeAll(Arrays.asList(2,3));
        System.out.println(list);








    }
}
