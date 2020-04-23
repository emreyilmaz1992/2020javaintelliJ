package day18_Do_whileLoop;

import java.util.Scanner;

public class WarmUp_Frequency {
    public static void main(String[] args) {

/*
Warm up task:
	1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
	2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
 */


        String str = "AABCCAAAKKKGKGGIIITTTJJRHANNNFNFHWE";
        String result = "";

        String nonDup = "";     //ABC




        for (int i = 0; i <=str.length()-1 ; i++) {

            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+= str.charAt(i);
            }

        }

       // System.out.println(nonDup); //ABC



        for (int j = 0; j <=nonDup.length()-1 ; j++) {
            char ch = nonDup.charAt(j);


            int count = 0; // count the total number of occurance for each char from the str

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;

                }

            }
            result += "" + ch + count+" ";
        }

        System.out.println(result);











        }



    }

