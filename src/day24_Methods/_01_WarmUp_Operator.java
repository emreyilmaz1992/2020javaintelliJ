package day24_Methods;
/*1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false



 */

import java.util.Scanner;

public class _01_WarmUp_Operator {
    public static void main(String[] args) {

        calculation(10,20,'*');

        int n1 = 100;
        int n2 = 10;

        calculation(n1,n2,'/');

        Scanner scan = new Scanner(System.in);
        System.out.println("num1");
        int num1 = scan.nextInt();
        System.out.println("num2");
        int num2 = scan.nextInt();
        System.out.println("operator");
        char operator = scan.next().charAt(0);

        calculation(num1,num2,operator);


    }










public static void calculation(double num1 , double num2 , char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid");
        }

}

}
