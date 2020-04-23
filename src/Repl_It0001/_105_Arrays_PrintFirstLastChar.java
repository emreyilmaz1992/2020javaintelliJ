package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _105_Arrays_PrintFirstLastChar {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String result = "";
        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].substring(0,1)+words[i].substring(words[i].length()-1,words[i].length());






        }System.out.print(Arrays.toString(words));






    }
}
