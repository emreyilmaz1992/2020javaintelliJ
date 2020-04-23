package day18_Do_whileLoop;

import java.util.Scanner;

public class Hotel_Room_Practise {
    public static void main(String[] args) {
         /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */

        Scanner input = new Scanner(System.in);
        int kingBed   = 120;
        int queenBed  = 200;
        int singleBed = 80 ;
        int total =0;

                while(true) {
                    while (true) {
                        System.out.println("Which bedroom would you like to reserve?");

                        String room = input.nextLine();



                        if (room.equalsIgnoreCase("King Bed")) {
                            total += kingBed;
                            break;
                        } else if (room.equalsIgnoreCase("Queen Bed")) {
                            total += queenBed;
                            break;
                        } else if (room.equalsIgnoreCase("Single Bed")) {
                            total += singleBed;
                            break;
                        } else {
                            System.out.println("Your answer is invalid! Please enter 'King Bed, Queen Bed or Single Bed");
                        }
                    }


                    while (true) {
                        System.out.println("Would you like to reserve another room?");
                        String answer = input.next();

                        if (answer.equalsIgnoreCase("yes")) {
                            input.nextLine();
                            break;
                        } else if (answer.equalsIgnoreCase("no")) {
                            System.out.println("Your total price is: " + total + "$");
                            System.exit(0);

                        } else {
                            System.out.println("Please enter valid answer! (Yes or No)");
                        }

                    }
                }














    }
}
