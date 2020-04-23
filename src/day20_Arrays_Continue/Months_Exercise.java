package day20_Arrays_Continue;

import java.util.Scanner;

public class Months_Exercise {
    public static void main(String[] args) {

       // String[] months  = new String[12];
       // months[0]= "Jan";



        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();



        int attemts = 0;

      while(num>12 || num<= 0){
           // System.out.println("invalid Entry");
            System.out.println("Please re-enter");
            num = input.nextInt();
            attemts++;

            if(attemts < 3 || (num > 12 || num <= 0)){
              System.out.println("Invalid entry, "+(3-attemts)+" left.");
              if(attemts == 3){
                  System.out.println("You have exceeded! Bye!");
                  System.exit(0);
              }

          }
        }
        String result = months[num-1];
        System.out.println(result);








    }
}
