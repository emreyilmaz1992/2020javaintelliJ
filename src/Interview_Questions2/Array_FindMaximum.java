package Interview_Questions2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_FindMaximum {

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6,7,8,100};

        System.out.println(maxValue1(arr));
        System.out.println(maxValue2(arr));



    }
    public static int maxValue1(int [] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>max){
                max = arr[i];
            }

        }

        return max;


    }
    public static int maxValue2(int[]arr){

        Arrays.sort(arr);

        return arr[arr.length-1];

    }


}
