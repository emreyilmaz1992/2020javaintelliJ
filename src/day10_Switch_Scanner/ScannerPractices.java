package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a first number");
        byte num1 = input.nextByte();

        System.out.println("Please enter the second number ");
        byte num2 = input.nextByte();

        System.out.println("\nThe sum of the numbers that you have entered is: "+(num1+num2));






    }
}
