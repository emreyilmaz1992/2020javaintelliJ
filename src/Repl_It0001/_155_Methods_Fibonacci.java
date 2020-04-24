package Repl_It0001;

import java.util.Scanner;

public class _155_Methods_Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);







    }

    public static void fib (int num){

        int total = 0 ;

        int [] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;


        for (int i = 0; i <=num-3 ; i++) {


            arr[i+2] = arr[i]+arr[i+1];



        } total = arr[arr.length-1]+arr[arr.length-2];
        System.out.println(total);
    }



}
