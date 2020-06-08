package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Concat2Arrays {
    public static void main(String[] args) {


        int[]a = {1,2};
        int[]b = {3,4};

        System.out.println(Arrays.toString(Concat2Arrays(a,b)));





    }
    public static int[] Concat2Arrays(int[] arr, int[]arr2){
        int result[] = new int[arr.length+arr2.length];


        for (int i = 0; i <arr.length ; i++) {

            result[i]= arr[i];
        }
        int j =0;
        for (int i = arr.length; i <result.length ; i++) {

            result[i] = arr2[j];
        j++;
        }


        return result;


    }
}
