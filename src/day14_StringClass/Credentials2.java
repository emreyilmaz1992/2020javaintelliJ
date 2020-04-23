package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        /*
        valid credentials are:
            username: cybertek
            password: cybertekschool

         precondition = username and password cannot be empty
                        if they are empty - > please enter the credentials
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the username");

        String userName = input.next();
        userName = userName.toLowerCase();




        System.out.println("Enter your password");
        String password = input.next();

        boolean loggedIn = userName.equals("Cybertek") && password.equals("cybertekschool");
        boolean InvalidUsername = !userName.equals("Cybertek") && password.equals("cybertekschool");
        boolean InvalidPassword = userName.equals("Cybertek") && !password.equals("cybertekschool");


        if(!userName.isEmpty() && !password.isEmpty()){
            if(loggedIn) {
                System.out.println("Logged in");
            }else if(InvalidUsername){
                System.out.println("Invalid Username");
            }else if(InvalidPassword){
                System.out.println("Invalid Password");
            }else{
                System.out.println("Both username and password invalid");
            }
        }else{
            System.out.println("Please enter the credentials");
        }













    }
}
