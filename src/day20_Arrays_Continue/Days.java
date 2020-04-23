package day20_Arrays_Continue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = input.nextInt();


        int attempt = 1;
        while(num>7 || num <1){
            System.out.println("Invalid Entry, please re-enter");
            num = input.nextInt();
            attempt++;

            if(attempt == 3 && (num>7 || num <1)){
                System.out.println("You have exceeded 3 attemps. Please try 2 hours later");
                System.exit(0);
            }

        }


        String result = days[num-1];

        System.out.println(result);






    }
}
