package day10_Switch_Scanner;


import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
       /* write a program for the rate calculater: rateCalculator
        1. asks the user to enter salary (as integer)
        2. asks the user how many hours does she/he works in a week
        3. print the hourly rate
        4.assume one year is 52 weeks

        */

        Scanner rateInput = new Scanner(System.in);
        System.out.println("What is your salary?");
        int salary = rateInput.nextInt() ;

        System.out.println("\nHow many hours you work in a week?");
        short hourWeek = rateInput.nextShort();

        System.out.println("\nHow many weeks you work in a year?");
        byte weekYear = rateInput.nextByte();

        System.out.println("\nYour hourly rate is: "+ (salary/(hourWeek*weekYear))+"$");





    }
}
