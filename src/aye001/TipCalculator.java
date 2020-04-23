package aye001;
import java.util.Scanner;


public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String split=input.next();

        System.out.println("Number of people:");
        int people = input.nextInt();

        System.out.println("Check amount:");
        double amount = input.nextDouble();

        System.out.println("Service quality:");
        String sQuality = input.next();







        if(split.equals("Yes")) {

            System.out.print("Number of people entered: ");
            for (int i = 1; i <= people; i++)
                System.out.print("&");
            System.out.println();




        switch (sQuality) {
            case ("Poor"):
                System.out.println("Total to pay: " + (amount + (amount * 0.05)));
                System.out.println("Total tip: " + (amount * 0.05));
                System.out.println("Total per person: " + ((amount + (amount * 0.05)) / people));
                System.out.println("Tip per person: " + ((amount * 0.05) / people));
                break;
            case ("Fair"):
                System.out.println("Total to pay: " + (amount + (amount * 0.1)));
                System.out.println("Total tip: " + (amount * 0.1));
                System.out.println("Total per person: " + ((amount + (amount * 0.1)) / people));
                System.out.println("Total per person: " + ((amount * 0.1) / people));
                break;
            case ("Good"):
                System.out.println("Total to pay: " + (amount + (amount * 0.15)));
                System.out.println("Total tip: " + (amount * 0.15));
                System.out.println("Total per person: " + ((amount + (amount * 0.15)) / people));
                System.out.println("Total per person: " + ((amount * 0.15) / people));
                break;
            case ("Great"):
                System.out.println("Total to pay: " + (amount + (amount * 0.2)));
                System.out.println("Total tip: " + (amount * 0.20));
                System.out.println("Total per person: " + ((amount + (amount * 0.20)) / people));
                System.out.println("Total per person: " + ((amount * 0.20) / people));
                break;
            case ("Excellent"):
                System.out.println("Total to pay: " + (amount + (amount * 0.25)));
                System.out.println("Total tip: " + (amount * 0.25));
                System.out.println("Total per person: " + ((amount + (amount * 0.25)) / people));
                System.out.println("Total per person: " + ((amount * 0.25) / people));
                break;

        }


        }


    }
}
