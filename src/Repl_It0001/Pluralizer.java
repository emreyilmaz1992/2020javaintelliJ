package Repl_It0001;

import java.util.Scanner;

public class Pluralizer {


    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();


        word = word.toLowerCase();
        String result = "";
        if(amt!=1 && amt>=0) {
            if (word.endsWith("fe")) {
                result = amt+" "+word.replace(word.substring(word.length() - 2), "ves");
            }else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                result = amt+" "+word + "s";
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                result =  amt+" "+word + "es";
            } else if (word.endsWith("us")) {
                result = amt+" "+word.replace(word.substring(word.length() - 2), "i");
            } else if (word.endsWith("y") ) {
                result = amt+" "+word.replace(word.substring(word.length() - 1), "ies");
            } else {
                result = amt+" "+word + "s";
            }
        }else {

            result = amt+" "+word;

        }

        System.out.println(result);















    }
}
