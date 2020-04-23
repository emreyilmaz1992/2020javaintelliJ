package aye001;

import java.util.Scanner;

public class MultiBranchIfStatements {
    public static void main(String[] args) {

        char grade = 'C';

        if (grade == 'A'){
            System.out.println("Excellent");
        }
        else if(grade== 'B'){
            System.out.println("Good");
        }else if(grade == 'C'){
            System.out.println("Not bad");
        }else{
            System.out.println("Could be better");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your shoe size:");
        int size = scan.nextInt();

        // shoe size available between 6-12

        if(size > 12){
            System.out.println("Sorry , your shoe size is out of stock");
        }else if (size >= 6){
            System.out.println("Your shoe is in stock!");
        }else{
            System.out.println("Sorry, this store does not have shoes smaller than size of 6");
        }
        /* the order of the conditions are very important. For example if put the "size >= " in the first condition and
        and enter the size as "15" then, first condition will be executed and java will never check the second condition.
         */










    }
}
