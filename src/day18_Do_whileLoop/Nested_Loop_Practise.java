package day18_Do_whileLoop;

import java.util.Scanner;

public class Nested_Loop_Practise {
    public static void main(String[] args) {

        /*
        Write a program that calculates addition of any given 2 numbers
         */

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue?");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, do you wanna continue?");
                answer = input.next();
            }

            if(answer.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using calculator");
                break;
            }

        }






    }
}
