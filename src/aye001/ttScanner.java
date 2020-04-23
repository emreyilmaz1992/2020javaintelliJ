package aye001;

import java.util.Scanner; // you need this line up here before you start using Scanner

public class ttScanner {


    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        int integerNumber;
        String stringName = "Emre";
        double doubleNumber;

        System.out.println("Enter any integer: ");

        if (keyboardInput.hasNextInt() == true) {
            integerNumber = keyboardInput.nextInt();

            System.out.println("You entered the number: " + integerNumber);

        } else if (keyboardInput.hasNextDouble() == true) {
            doubleNumber = keyboardInput.nextDouble();
            System.out.println("\"" + doubleNumber + "\"" + " is not an integer number. Please only use integer number!");

        } else {
            System.out.println("Do not use any Character rather than numbers!!");

        }







        /*
        System.out.println("\n\nEnter any decimal number: ");
        doubleNumber = keyboardInput.nextDouble();

        System.out.println("You entered the number: "+doubleNumber);

         */


    }

}


