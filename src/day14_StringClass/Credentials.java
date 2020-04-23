package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        // username = cybertek
        // password = cybertekschool

        String validUsername = "cybertek";
        String validPassword = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = input.next();

        if(validUsername.equals(username)){

            System.out.println("Please enter your password");
            String password = input.next();

            if (validPassword.equals(password)){

            }else{
                System.out.println("Invalid password");
            }

        }else{
            System.out.println("Invalid username");
        }






    }
}
