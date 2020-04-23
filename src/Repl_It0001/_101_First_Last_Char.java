package Repl_It0001;

import java.util.Scanner;

public class _101_First_Last_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for (int j = 0; j <words.length ; j++) {

            words[j] = words[j].substring(0,1)+words[j].substring(words[j].length()-1,words[j].length());
            System.out.println(words[j]);


        }










    }
}
