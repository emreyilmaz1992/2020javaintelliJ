package aye001;

import java.util.Scanner;

public class NestedIFstatement {
    public static void main(String[] args) {

        // You can have If statement inside an other if statement. As many as you want.

        int tempeture = 86;
        boolean sunny = false;

        if (tempeture > 90) {
            System.out.println("It is hot outside");
            if (sunny == true)
                System.out.println("It is also sunny outside");
            else System.out.println("It is also cloudy outside");

        } else {
            System.out.println("It is not hot outside");
            if (sunny == true)
                System.out.println("It is also sunny outside");
            else System.out.println("It is also cloudy outside");
        }
        // first if statement(ln 11) paired with else(ln 17), second if statement (ln13) paired with else(ln15)

        // if the line 11 is true then compiler checks ln13 or 15. But, if line11 is false compiler jumps to line 17
        // and execute that line.

/*
        int drinkType = 1;
        int drinkSelection = 1;
        boolean purchaseIcedTea = false;

        if (drinkType == 1) {
            System.out.println("Choose your hot beverage");
            if (drinkSelection == 1)
                System.out.println("You purchased Tea for $2!");
            else System.out.println("You purchased Coffee for $4!");
        } else {

            if (drinkType == 2)
                System.out.println("Choose your cold beverage");
            if (purchaseIcedTea)
                System.out.println("You purchased IcedTea for $3.2");
            else System.out.println("You purchased Lemonade for $3.5");
        }
*/

        int typeSelection = 1;
        int drinkSelection = 2;
        double price;
        String drink;

        if(typeSelection == 1){
            System.out.println("Hot Drinks: Select 1 for Tea. 2 for Coffee");
            if (drinkSelection == 1){
                price = 2.0;
                drink = "Tea";
            }else if (drinkSelection == 2){
                price = 3.2;
                drink = "Coffee";

            }else{
                System.out.println("Invalid Hot Drink Selection");
            }
        }else  if(typeSelection == 2){
            System.out.println("Cold  Drinks: Select 1 for Iced Tea. 2 for Lemonade");
            if (drinkSelection == 1){
                price = 4.0;
                drink = "Iced Tea";
            }else if (drinkSelection == 2){
                price = 5.2;
                drink = "Lemonade";

            }else{
                System.out.println("Invalid Hot Drink Selection");
            }

        }else{
            System.out.println("Invalid Selection");

        }




























    }
}
