package aye001;

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

            String validPetName = "karabas";
            String validBestFriendatHighSchool = "engin";
            String validMomsMaidenName = "tonbul";

            Scanner securityinput = new Scanner(System.in);

            System.out.println("To reach your password please verify your security questions: \n1) Please enter your first pet name: ");

            if (securityinput.hasNext(validPetName) == true) {
                validPetName = securityinput.next();
                System.out.println("2) Please verify your best friends name at highschool: ");

                if (securityinput.hasNext(validBestFriendatHighSchool) == true) {
                    validBestFriendatHighSchool = securityinput.next();
                    System.out.println("3)Please verify your moms maiden name: ");


                    if (securityinput.hasNext(validMomsMaidenName) == true) {
                        validMomsMaidenName = securityinput.next();
                        System.out.println("Thank you for verifying your informations.\nYour password is: 'Murat.15751'.");
                    } else {
                        System.out.println("We are unable to verify your information.\nPleasse try again.");
                    }
                } else {
                    System.out.println("We are unable to verify your information.\nPleasse try again.");

                }

            } else {
                System.out.println("We are unable to verify your information.\nPleasse try again.");

            }
        }

}
