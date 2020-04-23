package aye001;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        int integerNumber;
        String stringName;
        String securityQ1 = "Atakan";
        String securityQ2 = "Gebze";
        int validAge = 27;
        double doubleNumber;

        System.out.println("Enter your best friend's name: ");

        if (keyboardInput.hasNext(securityQ1) == true) {
            stringName = keyboardInput.next();
            System.out.println("\nPlease answer the second security question!");
        }










    }
}
