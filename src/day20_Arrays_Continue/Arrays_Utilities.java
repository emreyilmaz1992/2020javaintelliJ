package day20_Arrays_Continue;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);


        System.out.println(r);

        System.out.println(arr); // Array MUST be converted to a string before printing.

        String names[] = {"Ahmet", "Mehmet"," Kerim"};
        System.out.println(Arrays.toString(names));


        double[]nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]+1);
        nums[0] = 15;
        System.out.println(Arrays.toString(nums));
        System.out.println("++++++++++++++++++");


        /*
        write a program that can combine two arrays of any lengths, return the third array
        arr1 ===>[1,2,3];
        arr2 ===>[4,5,6,7];

        arr3 ===>[1,2,3,4,5,6,7
         */

        int[]arr1 = {1,2,3};
        int[]arr2= {4,5,6,7};

        int[]arr3 = new int[arr1.length+arr2.length]; // have enough space to contain all

        for (int i = 0; i <arr1.length ; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i <arr2.length ; i++) {

                arr3[arr1.length+i]  = arr2[i];

        }
        System.out.println(Arrays.toString(arr3));











    }
}
