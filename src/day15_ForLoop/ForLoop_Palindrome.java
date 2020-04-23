package day15_ForLoop;

import java.util.Scanner;

public class ForLoop_Palindrome {
    public static void main(String[] args) {
        /*Write a program if string palindrome or not if yes -> true otherwise -> false

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word that you wanna check");
        String str = input.next();
        int lastIndexNum = str.length()-1;

        String reverse = "";
        for(int i = lastIndexNum ; i>= 0 ;i--){
            reverse+= (str.charAt(i));

        }
        System.out.println(reverse);

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("The word " + str +" is Palindrome");
        }else{
            System.out.println("The word " + str +" is NOT Palindrome");
        }


    }
}
