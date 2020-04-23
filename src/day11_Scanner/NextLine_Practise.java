package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt(); //27 + enter
        System.out.println("Your age is: "+age);

        // after I put the age then press the enter. That's because it executes the nextLine method, so
        // we don't get to put any typing .We fix this by putting empty nextLine method below.

        input.nextLine(); // this executes the enter command and allows us the put our fullName  below.

        System.out.println("\nEnter your full name");
        String fullName = input.nextLine();
        System.out.println("Your full name is: "+fullName);







    }
}
