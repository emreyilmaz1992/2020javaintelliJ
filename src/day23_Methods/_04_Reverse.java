package day23_Methods;

import java.util.Scanner;

public class _04_Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = input.nextLine(); // emre
        String str2 = input.nextLine();

        reverseString(str);           // erme
        reverseString(str2);



    }









    public static void reverseString (String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+= str.charAt(i);


        }
        System.out.println(reverse);


    }
}
