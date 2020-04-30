package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        // add 30,20,40,50,45,35,200

        list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
        System.out.println(list1);

        Integer[] data = {30,20,40,50,45,35,200};

        list1.addAll(Arrays.asList(data));
        System.out.println(list1);

        System.out.println("================================");

        String[]names = {"Ahmet","Mehmet","Ali","Veli","Kenan"};

        ArrayList<String > nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));
                        // collectionType

        System.out.println(nameList);

        nameList.add("Kazim");
        nameList.remove("Mehmet");
        System.out.println(nameList);
        System.out.println("==================================");

        Integer[]numbers ={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);





    }
}
