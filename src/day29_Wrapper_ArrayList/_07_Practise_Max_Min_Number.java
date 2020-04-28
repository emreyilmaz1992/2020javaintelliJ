package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class _07_Practise_Max_Min_Number {
    public static void main(String[] args) {

    /*
    1. create a list of Integers
    2. add 5 Integers to it
    3. return the maximum from the list
     */


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(90);
        list.add(800);
        list.add(3);
        list.add(-10);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <list.size() ; i++) {

            if(list.get(i) > max){
                max = list.get(i);
            }

        }
        System.out.println(max);


    }
}
