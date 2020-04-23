package day17_While_Loop;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        /*
        warmup tasks:
	1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators(assume that 1st number is greater
	2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */






        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int sum = 1;


        while(number>=1){
            sum*=number;
            number--;
        }
        System.out.println(sum);


        int a = 10;
        int b = 3;
        if(b == 0){
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }

        int count = 0; // count the execution of the loop

        while (a >= b){
            a-= b;
            count++;
        }


        if(a == 0){
            System.out.println("The result is "+count);
        }else{
            System.out.println("The result is "+count+" with a remainder "+a);
        }




    }
}
