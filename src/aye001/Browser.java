package aye001;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String result = "";
        while(true){

        int i = 1;

        while (i<=3) {
            System.out.println("Enter your favorite browsers:");
            String browser = scan.nextLine();
            i++;
            if (i == 3) {
                break;

        }


            while (true) {

                boolean validbrowsers = (browser.equalsIgnoreCase("mozilla") || browser.equalsIgnoreCase("safari") ||
                        browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("explorer"));
                if (validbrowsers == true) {
                    System.out.println("Your favorite browsers: " + browser);
                    break;
                } else {
                    System.out.println("Enter valid browser: 'Mozilla, Safari, Chrome ,Explorer");
                }
            }

            while (true) {
                System.out.println("Would you like enter another browser");
                String answer = scan.next();
                if (answer.equalsIgnoreCase("Yes")) {
                    scan.nextLine();
                } else if (answer.equalsIgnoreCase("No")) {
                    System.out.println("Thanks for using the browsers picker!");
                    System.exit(0);
                } else {
                    System.out.println("Please enter Yes or No!");
                }
            }



}
        }
    }
}
