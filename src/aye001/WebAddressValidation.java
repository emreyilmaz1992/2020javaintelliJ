package aye001;

import java.util.Scanner;

public class WebAddressValidation {
    public static void main(String[] args) {
        /* write a program that can validate if the web address is valid
        - must starts with www.
        - must ends with .com, .edu, .net or .gov
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the web address that you'd like to validate");
        String webAddress = input.next();
        webAddress = webAddress.toLowerCase();

        boolean validStart = webAddress.startsWith("www.");
        boolean validEnds  = webAddress.endsWith(".com") || webAddress.endsWith(".edu") ||
                             webAddress.endsWith(".net") || webAddress.endsWith(".gov") ;

        if(validStart){
            if(validEnds || validStart){
                System.out.println("Your url is validated");

            }else{
                System.out.println("Your url must end with \".com, .edu, .net or .gov\".");
            }

        }else{
            System.out.println("Your url Must start with \"www.\". ");
        }








    }
}
