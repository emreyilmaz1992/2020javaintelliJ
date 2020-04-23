package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // String str = scan.next();  // next method only takes the 1st word of the sentence.

        //== 7921 JonesBranch Dr, McLean VA, 22034
        String fullAdress= "";
        System.out.println("Enter number of the building");
        int bNumber = scan.nextInt();
        fullAdress+= bNumber+" ";

        System.out.println("Enter the Street name");
        String streetName = scan.next();
        fullAdress+= streetName+" ";

        System.out.println("Enter type of the road");
        String roadType = scan.next();
        fullAdress+=roadType+", ";

        System.out.println("Please enter the city,state and zipcode ");
        String cityName = scan.next();
        fullAdress+=cityName+" ";

        String stateName = scan.next();
        fullAdress+= stateName+" ";

        int zipCode = scan.nextInt();
        fullAdress+= zipCode;

        System.out.println(fullAdress);













    }
}
