package Repl_It0001;

import java.util.Scanner;

public class _100_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for (int j = 0; j <arr.length ; j++) {

            arr[j] = arr[j].substring(0,3);
            System.out.println(arr[j]);



        }











    }
}
