package day17_While_Loop;

import java.util.Scanner;

public class While_Loop_Practise {
    public static void main(String[] args) {

        /*
        ask the user enter yes or no
            if the user enters other than yes or no, repeat the previous step
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Enter yes or no");
         String answer = input.next();

        boolean valid = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");

        while (!valid){
            System.out.println("Please re-enter");
            answer = input.next();

            if(valid){
                break;
            }

          }
         if(answer.equalsIgnoreCase("yes")){
            System.out.println("You entered yes");
            if(answer.equalsIgnoreCase("no")){
                System.out.println("You entered no");
            }
        }




    }
}
