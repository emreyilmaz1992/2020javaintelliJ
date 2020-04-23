package day13_StringClass;
 /*2. write a program for the shipping info that, the program should ask:
         building number
         Street address (Assume it has more than one word)
         city name
         state name
         zip code
         full name of the person:
         and prints the ship to info in the following format:
         ex output:
         Ship To:  Jimmy joe
         7925 Jones Branch Dr
         MCLean, VA 22102

  */

import java.util.Scanner;

public class Shipping_aDRESS {
    public static void main(String[] args) {

        String fullAdress = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your building number");
        int bNumber = input.nextInt();

        input.nextLine();
        System.out.println("Please enter your street address");
        String stAddress = input.nextLine();
        fullAdress = bNumber+" "+stAddress+" ";

        System.out.println("Please enter your city");
        String cityName = input.next();
        fullAdress+=cityName+", ";

        System.out.println("Please enter your state");
        String stateName = input.next();
        fullAdress+=stateName+" ";

        System.out.println("Please enter your zip code");
        int zipCode = input.nextInt();
        fullAdress+=zipCode;

        input.nextLine();
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();


        System.out.println("Ship to  : "+fullName+"\n"+fullAdress);












    }
}
