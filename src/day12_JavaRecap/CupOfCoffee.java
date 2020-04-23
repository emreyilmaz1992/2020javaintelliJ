package day12_JavaRecap;

import java.util.Scanner;

public class CupOfCoffee {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("How many cups of coffees you've drunken?");
        int coffee = input.nextInt();

        System.out.println("How many cans of coke you've drunken?");
        int coke = input.nextInt();

        double overdose = 10*1000;
        int cofCaffeine = coffee*160;
        int cokeCaffeine = coke*34;

        if(cofCaffeine+cokeCaffeine >= overdose){
            System.out.println("You're gonna die in 10 seconds!");
        }else if(cofCaffeine+cokeCaffeine <= overdose){
            System.out.println("You are "+((overdose-(cofCaffeine+cokeCaffeine))/160)+" cup of coffee away from dying!");
        }





    }
}
