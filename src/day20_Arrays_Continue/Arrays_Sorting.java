package day20_Arrays_Continue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1 = {9,8,5,6,4,7,1,3,2};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is:  "+ arr1[0]);
        System.out.println("Second min number is: "+ arr1[1]);

        System.out.println("First max number is:  "+ arr1[arr1.length-1]);

        System.out.println("===============================================");

        char[] ch ={'Z','D','W','Y','A','V'};

        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        String[] names = {"Ahmet","Mehmet","Yasin","atakan","Huseyin","Akin","Eren","Murat"}; // in ascii table order

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));


        System.out.println("===========================");

        int[] arr2 = {9,8,5,6,4,7,1,3,2};

        Arrays.sort(arr2);

        int[] descending = new int[arr2.length];


        int j = 0;
        for (int i = arr2.length-1; i >=0 ; i--) {

            descending[j] = arr2[i];

            j++;



        }
        System.out.println(Arrays.toString(descending));







    }
}
