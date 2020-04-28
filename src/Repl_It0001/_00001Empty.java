package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _00001Empty {

    public static void main(String[] args) {

        int[] nums = {1,3,5};

        System.out.println(isSort(nums));








   }

   public static boolean isSort(int[] nums){

        int[] arr2 = new int[nums.length];

        for (int i = 0; i <arr2.length ; i++) {

            arr2[i] = nums[i];
        }
        Arrays.sort(arr2);

        boolean b1 = Arrays.equals(nums,arr2);


        return b1;
    }
}
