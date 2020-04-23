package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num =input.nextInt();
        System.out.println(num);

        input.nextLine(); //used for taking out the "Enter"

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);









    }
}
