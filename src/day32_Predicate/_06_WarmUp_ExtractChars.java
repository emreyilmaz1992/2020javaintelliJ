package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_WarmUp_ExtractChars {
    public static void main(String[] args) {

        /*
    3. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
     */

        String str = "ABCD123$%#@&456EFG!";

        char [] ch = str.toCharArray();





        ArrayList<String> alpha = new ArrayList<>();
        ArrayList<Integer>number = new ArrayList<>();
        ArrayList<String >special = new ArrayList<>();


        for (int i = 0; i <ch.length ; i++) {

           if(Character.isDigit(ch[i])){
               number.add(Integer.parseInt(""+ch[i]));
           }else if(Character.isLetter(ch[i])){
               alpha.add(String.valueOf(ch[i]));
           }else{
               special.add(""+ch[i]);
           }


        }
        System.out.println(alpha);
        System.out.println(number);
        System.out.println(special);








    }
}
