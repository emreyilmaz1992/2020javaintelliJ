package day20_Arrays_Continue;

public class Warmup_AvarageNumber {
    public static void main(String[] args) {
       /* 1. write a program that can return the average number from an array of integers
        ex:
				[1,2,3]
        average: 2
                [10, 15, 5, 6]
        average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
        average: 10

        */


       int[]arr = {10,20,30,40,50};


        int total = 0 ;
        int result = 0 ;
        for (int i = 0; i <arr.length ; i++) {

            total+= arr[i];


        }result = (total/arr.length);

        System.out.println(result);


    }
}
