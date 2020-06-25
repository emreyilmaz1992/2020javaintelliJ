package day52_Collection;

import java.util.Arrays;

public class null_keyword {

    static String str; // =>null

    public static void main(String[] args) {

        String number = "123"; // means empty there is no object

        int num1 = Integer.parseInt(number);

        System.out.println(num1);

        System.out.println("==================");

        String[]arr  = {null,"Cybertek", "ABC"};

        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        System.out.println(name1);








    }
}
