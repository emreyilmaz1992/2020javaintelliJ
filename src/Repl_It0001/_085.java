package Repl_It0001;

import java.util.Scanner;

public class _085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        int i = 1;
        while(i<=10){
            System.out.println("Enter Item"+(i)+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice+= price;
            shoppingListReport+= "Item"+(i)+": "+item+" Price: "+price+", ";

            System.out.println("Add one more item?");
            countinue = scan.next();

            if(countinue.equalsIgnoreCase("Yes")){

            }else if(countinue.equalsIgnoreCase("no")){

                shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);
                System.out.println(shoppingListReport);
                System.out.println("Total Price: "+totalPrice);
                break;

            }




            i++;
        }


    }
}
