package day10_Switch_Scanner;

import java.util.Scanner;

public class SalartAfterTax {
    public static void main(String[] args) {

        Scanner salaryInput = new Scanner(System.in);
        System.out.println("What is your current salary?");

        int salary =  salaryInput.nextInt();

        System.out.println("What is your state tax?");
        double sTax = salaryInput.nextDouble();

        System.out.println("What is your federal tax?");
        double fTax = salaryInput.nextDouble();

        System.out.println("Your salary after tax is: "+ (salary*(1-(sTax+fTax))));





    }
}
