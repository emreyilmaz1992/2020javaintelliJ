package Repl_It0001;

import java.util.Scanner;

public class _056_Laptop_Price {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Select screen size: ");
        double screenSize = scan.nextDouble();

        System.out.println("Select CPU type: ");
        String cpu = scan.next();

        System.out.println("Select ram size: ");
        double rams = scan.nextDouble();

        System.out.println("Select storage size: ");
        String storage = scan.next();

        System.out.println("Enter memory size");
        double memory = scan.nextDouble();

        System.out.println("Enter screen resolution");
        String resolution = scan.next();




        double price = 0;



        if(screenSize == 13.3){
            price+= 200;
        }else if(screenSize ==15){
            price+= 300;
        }else if(screenSize ==17.3){
            price+=400;
        }

        if(cpu.equalsIgnoreCase("i3")){
          price+= 150;
        }else if(cpu.equalsIgnoreCase("i5")){
            price+=250;
        }else if(cpu.equalsIgnoreCase("i7")){
            price+=350;
        }


       if(rams == rams){
           price+= rams*12.5;
       }

       if(storage.equalsIgnoreCase("SSD")){
           price+= memory*0.2;
       }else if(storage.equalsIgnoreCase("HDD")){
           price+= memory*0.1;
       }

       if(resolution.equalsIgnoreCase("FULLHD")){
           price+= 100;
       }else if(resolution.equalsIgnoreCase("4K")){
           price+= 200;
       }


       System.out.println("Laptop price is: $"+price);
















    }
}
