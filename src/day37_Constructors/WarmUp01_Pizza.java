package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp01_Pizza {

    String size;
    int pepperoniQ;
    int cheeseQ;

    public WarmUp01_Pizza(String size, int pepperoniQ, int cheeseQ) {
        this.size = size;
        this.pepperoniQ = pepperoniQ;
        this.cheeseQ = cheeseQ;

    }

    public double calcCost() {
        double total = 0;
        total += cheeseQ * 1;
        total += pepperoniQ * 1.5;

        return (size.equalsIgnoreCase("small")) ? total += +10
                : (size.equalsIgnoreCase("medium")) ? total += 12
                : (size.equalsIgnoreCase("large")) ? total += 14 : total;

    }

    public String toString() {

        return "Pizza size is: " + size + " - Cheese  X " + cheeseQ + " - Pepperoni X " + pepperoniQ +
                " - Total cost: $" + calcCost();

    }
}

    class Order{

        public static void main(String[] args) {

        WarmUp01_Pizza pizza1 = new WarmUp01_Pizza("Large",3,2);
        WarmUp01_Pizza pizza2 = new WarmUp01_Pizza("Small",2,3);
        WarmUp01_Pizza pizza3 = new WarmUp01_Pizza("Medium",2,3);
        WarmUp01_Pizza pizza4 = new WarmUp01_Pizza("Large" , 5,5);
        WarmUp01_Pizza pizza5 = new WarmUp01_Pizza("Small", 2,1);

            ArrayList<WarmUp01_Pizza> list = new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));




        for(WarmUp01_Pizza each : list){
          each.calcCost();
            System.out.println(each);
        }



        }



    }




