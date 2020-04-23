package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number");

        byte num1 =  input.nextByte();

        System.out.println("The number I entered is: "+ num1);

        if(num1 % 2 ==0){
            System.out.println(num1 +" is even number");
        }else{
            System.out.println("\n"+num1+" is odd number");
        }





    }
}
