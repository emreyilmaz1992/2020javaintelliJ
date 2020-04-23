package day12_JavaRecap;

import java.util.Scanner;

public class SalaryReport {
    public static void main(String[] args) {

        /*
        ask the user enter salary
        ask the user full name
        ask user company name
        ask user SSN
        ask user enter Job tittle
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary");

        int salary = input.nextInt();

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        //input.nextLine();

        System.out.println("Please enter your company name");
        String companyName = input.nextLine();
       // input.nextLine(); // you should put it if the next entry is nextLine(). Otherwise don't put it

        System.out.println("Please enter your SSN");
        int ssn = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your job title");
        String jobTitle = input.nextLine();

        int number =10;

        if(--number >10){
            System.out.println("Hello Cybertek");
        }else if(number ==9){
            System.out.println("Murat");
        }



    }
}
