package day37_Constructors;
/*
create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        double total = 0;
        total = quantity * unitPrice;
        return total;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice $= " + unitPrice +
                ", quantity= " + quantity + " Total cost $" + calcCost() +
                '}';
    }

}
    class ShoppingList{
        public static void main(String[] args) {

            Item item1 = new Item("Gloves",3,4);
            Item item2 = new Item("Mask",4,2);
            Item item3 = new Item("Hand sanitizer",10,2);
            Item item4 = new Item("Bread",2,10);
            Item item5 = new Item("Monito",200,1);

            ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
            double totalCost = 0;
            for(Item each : list){
                totalCost+= each.calcCost();
                System.out.println(each);
            }
            System.out.println("Grand Total is: "+totalCost);








        }





    }

