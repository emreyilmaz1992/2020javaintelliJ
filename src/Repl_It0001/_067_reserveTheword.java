package Repl_It0001;

import java.util.Scanner;

public class _067_reserveTheword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        int lastIndex = word.length()-1;
        String reverse = "";


         if(word.length()==5) {
             for (int i = lastIndex; i >= 0; i--) {
                 reverse += (word.charAt(i));
             }
             System.out.println(reverse);
         }else if(word.length() >5){
             System.out.println("Too long!");
         }else{
             System.out.println("Too short!");
         }







        }
}
