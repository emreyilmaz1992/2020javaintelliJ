package aye001;

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {
       /* Write a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of
        first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your 2 words");
        String word1 = input.next();
        String word2 = input.next();

        int lengthW1 = word1.length();
        int lengthW2 = word2.length();

        boolean firstLastequals = word1.startsWith(word1.substring(0,2)) == word2.endsWith(word2.substring(4));




        if(lengthW1 == 5 && lengthW2 == 5 ){
            if(firstLastequals){
                System.out.println("Fizz - Matched!");

            }else{
                System.out.println(" Buzz - did not match!");
            }

        }else{
            System.out.println("Needs to be exactly 5 characters long");
        }








    }
}
