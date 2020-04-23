package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a long number: ");
        long a = input.nextLong();

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal number");
        float b = input.nextFloat();
        System.out.println("You have entered: "+b);

       // double c = input.nextFloat(); // we can assign float to double

      //  long d = (long) input.nextFloat(); //2.5 ->2

        System.out.println("Enter true or false");
        boolean bool =input.nextBoolean();

        System.out.println(bool);

        System.out.println("Enter your sentence");
        String str = input.next();

        System.out.println("You have entered:"+str); // I put "Today is great day" ==> "You have entered:Today










    }
}
