package day20_Arrays_Continue;

import java.util.Arrays;

public class Arrays_Equals {
    public static void main(String[] args) {

        int[]arr  = {1,2,3};
        int[]arr2 = {1,2,3}; // if the order is not the same, boolean result would be false

        boolean result1 = Arrays.equals(arr,arr2); //true
        System.out.println(result1);


        int[]arr3  = {1,2,3};
        int[]arr4 =  {1,3,2}; // each index number must have the same numbers.

        boolean result2 = Arrays.equals(arr3, arr4);
        System.out.println(result2); //false

        int[]arr5  = {1,2,3};
        int[]arr6 =  {1,3,2};

        Arrays.sort(arr5);
        Arrays.sort(arr6);

        boolean result3 = Arrays.equals(arr5, arr6);
        System.out.println(result3); //true









    }
}
