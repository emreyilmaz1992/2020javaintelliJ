package day10_Switch_Scanner;

import java.util.Scanner;

public class Numbers_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Your first number");
        int num1 = scan.nextInt();

        System.out.println("Please enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Please enter the third number");
        int num3 = scan.nextInt();

        int max = (num1 >= num2 && num1 >= num3)? num1: (num2 >= num1 && num2 >=num3)?num2:num3;
        int min = (num1 <= num2 && num1 <= num3)? num1: (num2 <= num1 && num2 <=num3)?num2:num3;

        System.out.println("Maximum number is:"+ max);
        System.out.println("Minumum number is:"+ min);













    }
}
