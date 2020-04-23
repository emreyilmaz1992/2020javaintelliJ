package Repl_It0001;

import java.util.Scanner;

public class _045_Chicken_Burger {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String in = s.next();



        float burger =10.0f;
        float chicken = burger;
        float soda = 2.0f;

        if(in.equalsIgnoreCase("burger")|| in.equalsIgnoreCase("chicken")){

            System.out.println(burger);
        }
        if (in.equalsIgnoreCase("soda")){
            System.out.println(soda);
        }






    }
}
