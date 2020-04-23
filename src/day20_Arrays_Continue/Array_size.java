package day20_Arrays_Continue;

import java.util.Arrays;

public class Array_size {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

       // System.out.println(arr1[100]); error -> array size is fixed

        int[] nums = new int[2]; // array size is fixed to 2. {0 ,0} 0~1

        nums[0] = 10;
        nums[1] = 20;

        System.out.println(nums[0]); // 10
        System.out.println(nums[1]); // 20
       // nums[2] = 30; // this exceeds the range of the array

        nums = new int[3];  // reset { 0,0,0}

        System.out.println(nums[0]); // 0
        System.out.println(nums[1]); // 0
        System.out.println(nums[2]); // 0

        System.out.println(Arrays.toString(nums));






    }
}
