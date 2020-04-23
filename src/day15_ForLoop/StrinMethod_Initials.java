package day15_ForLoop;

import java.util.Scanner;

public class StrinMethod_Initials {
    public static void main(String[] args) {
        /*1. write a program that asks user's first and last name, then prints out the initials of the user
        Ex:
        input:
        cybertek
         batch12
        output:your initial is: CB

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String str1 = input.next();

        System.out.println("Enter your last name");
        String str2 = input.next();

        String c = str1.substring(0,1);
        c = c.toUpperCase();

        String b = str2.substring(0,1);
        b = b.toUpperCase();

        System.out.println("Your initial is: "+c+b);
        String initials = ""+ str1.charAt(0) + str2.charAt(0); // when we put empty space it returns us char when we concat
                                                                // rather then numbers








    }
}
