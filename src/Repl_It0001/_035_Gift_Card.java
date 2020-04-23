package Repl_It0001;

import java.util.Scanner;

public class _035_Gift_Card {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you buy");
        String item = scan.next();

        if(item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-25)+"$");
        }else if(item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-15)+"$");
        }else if(item.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-10)+"$");
        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-30)+"$");
        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-50)+"$");
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-5)+"$");
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-60)+"$");
        }else if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-40)+"$");
        }else{
            System.out.println("Invalid item");
        }









    }
}
