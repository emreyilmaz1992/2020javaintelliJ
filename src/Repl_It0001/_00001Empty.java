package Repl_It0001;

import java.util.Scanner;

public class _00001Empty {
    public static void next3 (int num1){


        System.out.println((num1+1)+" "+(num1+2)+" "+(num1+3));

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();


        next3(num);

    }
}
