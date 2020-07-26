package aye001;

import java.util.Scanner;

public class Scanner_Exception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            int i = 0;
            while (i<=4) {
                System.out.println("Put a goddamn number here");
                try {
                    int number = scan.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("I said number goddamn it!!!!!");
                    i++;
                }

            }
        }





    }
}
