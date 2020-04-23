package day11_Scanner;

import java.util.Scanner;

public class NextLine_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name");
        String fullName = input.nextLine();

        System.out.println("Your full name is: "+fullName);
        // when its asked the question if I press the enter without typing anything it accepts that


        System.out.println("\nEnter your sentence   ");
        String sentence = input.nextLine();

        System.out.println("You entered: "+sentence);








    }
}
