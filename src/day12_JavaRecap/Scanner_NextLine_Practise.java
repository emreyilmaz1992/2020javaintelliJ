package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practise {
    public static void main(String[] args) {

        // 7921 JonesBranch Dr, McLean VA, 22034
        String fullAdress= "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your  building number");
        int bNumber = input.nextInt();



        input.nextLine(); //used for taking out the enter from scanner

        System.out.println("Please enter your street name");
        String stName = input.nextLine();
        fullAdress = bNumber + " "+stName+ ", ";

        input.nextLine();

        System.out.println("Please enter city and state name");
        String ctName = input.nextLine();
        fullAdress+= ctName+", ";

        System.out.println("Please enter your zip code");

        int zipCode = input.nextInt();
        fullAdress+= zipCode;

        System.out.println("\nYour full adress is: "+fullAdress);

        input.close();





    }
}
