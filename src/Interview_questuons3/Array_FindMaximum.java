package Interview_questuons3;

import java.util.Arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {


        //Write a method that can find the maximum number from an int Array

        int arr[] = {1,2,3,4,5};

        System.out.println(maxNumber(arr));



    }
    public static int maxNumber (int[]arr){

        int min = Integer.MIN_VALUE;

        for (int each : arr){

            if(each>min){
                min=each;
            }
        }


   return min;

    }

}
