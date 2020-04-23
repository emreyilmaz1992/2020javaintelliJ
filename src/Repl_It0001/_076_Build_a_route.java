package Repl_It0001;

import java.util.Scanner;

public class _076_Build_a_route {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("A")){
            System.out.println("A found");
        }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")){
            System.out.println("right: B found");
        }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")){
            System.out.println("right > down: C found");
        }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")){
            System.out.println("right > down > left: D found");}


        if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("B")){
            System.out.println("B found");
        }else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")){
            System.out.println("down: C found");
        }else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")){
            System.out.println("down > left: D found");
        }else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")){
            System.out.println("down > left > up: A found");}

        if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("C")){
            System.out.println("C found");
        }else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")){
            System.out.println("left: D found");
        }else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")){
            System.out.println("left > up: A found");
        }else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")){
            System.out.println("left > up > right: B found"); }


        if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("D")){
            System.out.println("D found");
        }else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")){
            System.out.println("up: A found");
        }else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")){
            System.out.println("up > right: B found");
        }else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C")){
            System.out.println("up > right > down: C found");}

    }
}
