package Interview_Questions2;

import java.util.Arrays;

public class Array_FindMinimum {


    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6,7,8,100};

        System.out.println(minValue(arr));
        System.out.println(minValue2(arr));






    }
    public static int minValue(int[]arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]<min){
                min = arr[i];
            }


        }
        return min;

    }

    public static int minValue2(int[]arr){

        Arrays.sort(arr);

        return arr[0];


    }



}
