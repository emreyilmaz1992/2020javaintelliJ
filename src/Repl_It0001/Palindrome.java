package Repl_It0001;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
        System.out.println("Drop the damn word");
        String word = input.next();

        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= word.charAt(i);

        }
        System.out.println(reverse);
    }
}
