package day14_StringClass;
/*Warmup tasks:
        1. Ask user to enter two words. Print the first word, second word, second word, first word
        Input:
        one
        two
        Output:
        onetwotwoone
        DO NOT USE + OPERATOR
        2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana
        3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
        Input :
        elephant
        Output:
        The middle character in the string: ph

 */

import java.util.Scanner;

public class CombineTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 1st word.");
        String word1 = input.next();
        System.out.println("Please enter the 2nd word.");
        String word2 = input.next();

        String result = word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result);
        System.out.println("=============================================");

        //input.close();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 3rd word.");
        String word3 = input.next(); //Apple
        word3        = word3.substring(1, word3.length()); //pple

        System.out.println("Please enter the 4th word.");
        String word4 = input.next(); //Banana
        word4        = word4.substring(1, word4.length()); //anana

        String result2 = word3+word4;
        System.out.println(result2);













    }
}
