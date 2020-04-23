package day16_ForLoop;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {

        // Enter a  number five times and return the maximum number


        Scanner input = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE; // any number user provided will be greater tha this
                    // first user entered variable will be initialized to this

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
        int num = input.nextInt();

        if(num > maxNumber){
            maxNumber = num;    //Whenever we entered number the condition will be right since we put to lowest number far maxNumber.
                                //eg. when we put 0 first maxNumber will be 0.then we put 1 maxNumber will be 1.but if we put -1 the condition
                                //will be false. So it won't be replaced.1 will be remained as maxNumber.
                                // And in the end , we'll be having the max number
        }
    }
        System.out.println("Max number is "+maxNumber);

        // Enter a  number five times and return the maximum number

        int minNumber= Integer.MAX_VALUE;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int num1 = input.nextInt();

            if(num1<minNumber){
                minNumber=num1;
            }

        }
        System.out.println("Min number is: "+minNumber);









    }
}
