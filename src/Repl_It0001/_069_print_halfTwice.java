package Repl_It0001;

import java.util.Scanner;

public class _069_print_halfTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int oddHalf  = (word.length())/2; //even

        System.out.println(word.substring(0,oddHalf)+word.substring(0,oddHalf));







    }
}
