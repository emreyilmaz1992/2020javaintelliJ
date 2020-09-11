package Interview_Questions2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_SortAscending {
    public static void main(String[] args) {





        int[] number = {10, 9, 8, 7};
        SortAscending(number);
    }
    public static void SortAscending(int []number){

        int temp;
        boolean fixed = false;

        while(fixed==false){
            fixed=true;
            for (int i = 0; i <number.length-1 ; i++) {

                if(number[i]>number[i+1]) {
                    temp = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = temp;
                    fixed = false;
                }
            }
        }
        System.out.println(Arrays.toString(number));

    }
}