package Repl_It0001;

import java.util.Scanner;

public class _075_Without_X {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


       String f = ""+word.charAt(0);
       String l = ""+word.charAt(word.length()-1);



       if(f.equalsIgnoreCase("x") && l.equalsIgnoreCase("x")){
           System.out.println(word.substring(1,word.length()-1));

        }else if(f.equalsIgnoreCase("x")) {
            System.out.println(word.substring(1));
        }else if(l.equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
           System.out.println(word);
       }









    }
}
