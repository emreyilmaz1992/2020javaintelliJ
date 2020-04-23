package day14_StringClass;

import java.util.Scanner;

public class String_Manipulation3 {
    public static void main(String[] args) {


        //equalsIgnoreCase

        String str1 = "CYBERTEK";
        String str2 = "cybertek";
        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true

        // CONTAINS

        String s1 = "Cybertek School";
        String s2 = "School";
        boolean b1 =s1.contains(s2);

        System.out.println("================================");
        /*
        valid password MUST contain a special characters
        valid password should not contain space
         */

        String Password = "mmasd 1235";

        if(Password.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("Valid Password");
        }

        // STARTS WITH

        String s3 = "United States";
        System.out.println(s3.startsWith("U")); //TRUE

        System.out.println("================================");
         /*
         every website has "www." at the beginning of the web address
          */

         String webAddress = "Www.amazon.com";
         webAddress = webAddress.toLowerCase(); //  we convert it to lower case in order to ignore case sensetivity.

         if(webAddress.startsWith("www.")){
             System.out.println("valid");
         }

         //ENDS WITH

        String s4 = "Cybertek School";

        System.out.println(s4.endsWith("l")); //true
        System.out.println(s4.endsWith("School")); //true
        System.out.println(s4.endsWith("Cybertek")); //false

        System.out.println("================================");

        /* every single gmail adress ends with @gmail.com

         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

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
