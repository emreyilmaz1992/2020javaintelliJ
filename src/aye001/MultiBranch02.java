package aye001;

import java.util.Scanner;

public class MultiBranch02 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if(number >= 0 && number <=100){
            System.out.println("Number is between 0 - 100");
        }else if(number > 100 && number <=1000){
            System.out.println("Number is between 100 - 1000");
        }else if( number > 1000 && number < 1000000){
            System.out.println("Number is between 1001 - 10000000");
        }else{
            System.out.println("Number is either negative or more than 1000000");
        }






    }
}
