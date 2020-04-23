package aye001;

import java.util.Scanner;
/*Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name. Display message:
 "Enter full name:". Then take input from user.
  If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!".
   Otherwise,  display message: "User not found!". Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User fo

 */

public class MaxPayne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter full name");
        String fullname = input.next();
    }
}
