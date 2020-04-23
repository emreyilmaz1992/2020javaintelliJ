package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _109_Arrays_3LettersOfEach {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        String result = "";
        for (int i = 0; i <arr.length ; i++) {

            arr[i] = arr[i].substring(0,3);
            result = arr[i];
            System.out.println(result);


        }







    }
}
