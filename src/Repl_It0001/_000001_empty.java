package Repl_It0001;

import java.util.Scanner;

public class _000001_empty {
    public static void main(String[] args) {
 /*
        write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
         */


        Scanner input = new Scanner(System.in);

        for (int i = 0; i <1 ;) {
            System.out.println("Drop the 1st number");
            int num1 = input.nextInt();
            System.out.println("Drop the 2nd number");
            int num2 = input.nextInt();
            System.out.println("Drop the operator");
            String operator = input.next();

            if(operator.equalsIgnoreCase("+")){
                System.out.println("Result is: "+(num1+num2));
            }else if(operator.equalsIgnoreCase("-")){
                System.out.println("Result is: "+(num1-num2));
            }else if(operator.equalsIgnoreCase("*")){
                System.out.println("Result is: "+(num1*num2));
            }else if(operator.equalsIgnoreCase("/")){
                System.out.println("Result is: "+(num1/num2));
            }else if (operator.equalsIgnoreCase("%")){
                System.out.println("Result is: "+(num1%num2));
            }else{
                for (int j = 0; j <1 ;) {
                    System.out.println("Invalid Operator.Please choose valid operator '+, -, * ,/, %");
                    String operatorr = input.next();
                    if (operatorr.equalsIgnoreCase("+")) {
                        System.out.println("Result is: " + (num1 + num2));
                        break;
                    } else if (operatorr.equalsIgnoreCase("-")) {
                        System.out.println("Result is: " + (num1 - num2));
                        break;
                    } else if (operatorr.equalsIgnoreCase("*")) {
                        System.out.println("Result is: " + (num1 * num2));
                        break;
                    } else if (operatorr.equalsIgnoreCase("/")) {
                        System.out.println("Result is: " + (num1 / num2));
                        break;
                    } else if (operatorr.equalsIgnoreCase("%")) {
                        System.out.println("Result is: " + (num1 % num2));
                        break;
                    }
                }
                }
                    System.out.println("Do you wanna continue?");
                    String answer = input.next();
                    if(answer.equalsIgnoreCase("no")){
                        System.out.println("Thanks for using the calculator");
                        break;
                    }






            }


















    }
}
