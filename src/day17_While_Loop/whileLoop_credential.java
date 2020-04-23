package day17_While_Loop;

import java.util.Scanner;

public class whileLoop_credential {
    public static void main(String[] args) {

        //user : cybertek
        //pass : cybertek123

        Scanner input = new Scanner(System.in);


        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter password");
        String passWord = input.next();

        int count = 1;

        while ( !(userName.equals("cybertek") && passWord.equals("cybertek123") ) ){
            System.out.println("Invalid username or password");

            System.out.println("Enter username");
            userName = input.next();
            System.out.println("Enter password");
             passWord = input.next();



             if(count ==3){
                 System.out.println("Your account is blocked after 3 failed attempts");

                 break;
             }

            count++;





        }
        if((userName.equals("cybertek") && passWord.equals("cybertek123") )){
            System.out.println("Logged in!");
        }









    }
}
