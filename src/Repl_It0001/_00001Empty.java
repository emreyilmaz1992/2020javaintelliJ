package Repl_It0001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class _00001Empty {


    public static void main(String[] args) {

        String item1 ,item2,item3,report;
        int count1 , count2 , count3;
        double price1, price2, price3, totalPrice;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

       // report = "Item 1: "+item1+" Price "+price1+", "+"Item 2: "+item2+" Price "+price2+", "+"Item 3: "+item3+" Price "+price3;

        if(count1 == 0 ){
           report = "Item 2: "+item2+" Price "+price2*count2+", "+"Item 3: "+item3+" Price "+price3*count3;
           totalPrice = price2*count2+price3*count3;

        }else if(count2 == 0){
            report = "Item 1: "+item1+" Price "+price1*count1+", "+"Item 3: "+item3+" Price "+price3*count3;
            totalPrice = price1*count1+price3*count3;
        }else if(count3 == 0){
           report=  "Item 1: "+item1+" Price "+price1*count1+", "+"Item 2: "+item2+" Price "+price2*count2;
           totalPrice= price1*count1+price2*count2;
        }else {
            report = "Item 1: "+item1+" Price "+price1*count1+", "+"Item 2: "+item2+" Price "+price2*count2+", "+"Item 3: "+item3+" Price "+price3*count3;
            totalPrice = price1+count1+price2*count2+price3*count3;
        }

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);







    }
}