package Repl_It0001;

import java.util.Scanner;

public class _114_Arrays_NonDuplicate {
    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


       int nums[] = {1, 1, 2, 3, 4, 3, 4};
        String result = "";

        for (int i = 0; i <nums.length ; i++) {

            int count = 0;

            for (int j = 0; j <nums.length ; j++) {

                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result += nums[i];
            }


        } System.out.println(result);







    }
}
