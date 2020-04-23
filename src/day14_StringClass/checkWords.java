package day14_StringClass;

import java.util.Scanner;

public class checkWords {
    public static void main(String[] args) {
        /*Write a program CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st word");
        String word1= input.next();

        System.out.println("Enter the 2nd word");
        String word2 =input.next();

        System.out.println("Enter the 3rd word");
        String word3 =input.next();

        int lenght1= word1.length();
        int lenght2= word2.length();
        int lenght3= word3.length();

        if(lenght1 == lenght2 && lenght2 == lenght3){
            System.out.println("All words are the same lenght");
        }else if  ( lenght1 != lenght2 && lenght1 != lenght3 && lenght2 != lenght3){
            System.out.println("All word are different");
        }else{
            System.out.println("Not same nor different lengths");
        }




    }
}
