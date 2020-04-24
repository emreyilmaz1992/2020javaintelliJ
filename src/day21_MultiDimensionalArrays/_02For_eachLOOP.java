package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _02For_eachLOOP {
    public static void main(String[] args) {

        int[]nums = {1,2,3,4};

        for(int eachElement : nums ){
            System.out.print(eachElement);
        }
        System.out.println();

        String[] students = {"Ahmet","Mehmet","Kemal","Shorty"};

        for(String eachStudent : students){

            System.out.println(eachStudent);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int eachNumber : arr1 ){
            if(eachNumber < 5){
                continue;
            }

            System.out.println(eachNumber);

        }

        System.out.println("=========================");


        String sentence = "I like Java";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));









    }
}
