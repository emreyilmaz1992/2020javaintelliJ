package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _06_WarmUp_EvenNumbers {
    public static void main(String[] args) {
        /*
        Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
         */

        int[] numbers = new int[100];

        for (int i = 0; i <100 ; i++) {

            numbers[i] = i+1;

        }
        System.out.println(Arrays.toString(numbers));

        for( int eachNumbers  :numbers){

            if(eachNumbers%2 ==1){
               continue;
            } System.out.print(eachNumbers+" ");

        }



    }
}
