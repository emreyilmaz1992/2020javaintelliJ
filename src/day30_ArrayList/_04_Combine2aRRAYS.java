package day30_ArrayList;

import java.util.ArrayList;

public class _04_Combine2aRRAYS {
    public static void main(String[] args) {

/* write a program that combine 2 array list

 */

        String[] arr1 = {"A", "B", "C"};
        String[]  arr2 = {"D", "E", "F", "G", "H", "I"};

        ArrayList<String> list = new ArrayList<>();  //  {"A", "B", "C", "D", "E", "F", "G"}

        for(int i=0; i < arr1.length ; i++ ){
            String eachElement = arr1[i];
            list.add( eachElement );  //arr1[i];
        }

        for(String eachElement : arr2  ){
            list.add(eachElement);
        }



        System.out.println(list);



    }
}
