package day14_StringClass;

import java.util.Scanner;

public class WebAdress {
    public static void main(String[] args) {
        /* write a program that can validate if the web address is valid
        - must starts with www.
        - must ends with .com, .edu, .net or .gov
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the web address");

        String Address = input.next();
        Address = Address.toLowerCase();


        if(Address.startsWith("www.") && ( Address.endsWith(".com") || Address.endsWith(".edu") ||
                Address.endsWith(".net") || Address.endsWith(".gov"))) {
            System.out.println("Valid web address");

        }else{
            System.out.println("Invalid web address");
        }

    }
}
