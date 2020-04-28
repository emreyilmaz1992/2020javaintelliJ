package Repl_It0001;

import java.util.Scanner;

public class Assesstment_5_1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();



        String result = "";

        char [] vowels ={'a','e','i','o','u'};

        for (int i = 0; i <word.length() ; i++) {


            for (int j = 0; j <vowels.length ; j++) {
                if(word.charAt(i) == vowels[j]){
                    result+= word.charAt(i);
                }

            }

        }
        System.out.println(result);





    }
}
