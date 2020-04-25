package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _00001Empty {
    public static int wordCount(String words) {
        String[] arr = words.split(" ");

        int x = arr.length;

        return x;



    }
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String words = input.nextLine();



        int x =wordCount(words);
        System.out.println(x);










    }


}
