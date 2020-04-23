package aye001;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        /*3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
        Input :
        elephant
        Output:
        The middle character in the string: ph

 */
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter your word");
       String word1 = input.next();

       String middleChar = "";

       int middle = word1.length();
       int midChar = middle/2;

       if(middle % 2 != 0){
          middleChar = middleChar+word1.charAt(midChar);
       }else{
           middleChar = middleChar+word1.charAt(midChar-1)+word1.charAt(midChar);
       }

        System.out.println(middleChar);

























    }
}
