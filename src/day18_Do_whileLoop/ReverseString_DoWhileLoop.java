package day18_Do_whileLoop;

import java.util.Scanner;

public class ReverseString_DoWhileLoop {
    public static void main(String[] args) {

        String str = "I like Java";
        String reverse = "";
        int max = str.length()-1;


        do {

            reverse += ""+str.charAt(max);
            max--;
        }while (max >= 0);
        System.out.println(reverse);









    }
}
