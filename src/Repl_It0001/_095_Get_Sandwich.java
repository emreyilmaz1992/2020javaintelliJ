package Repl_It0001;

import java.util.Scanner;

public class _095_Get_Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        // breadjambread

        int firstBread = str.indexOf("bread");

        int secondBread = str.lastIndexOf("bread");

        if (firstBread == -1 || secondBread == -1) {// jambread  breadjam
            System.out.println("nothing");

        } else if (firstBread == secondBread) {
            System.out.println("nothing");

        } else {
            System.out.println(str.substring(firstBread + 5, secondBread));


        }

    }
}
