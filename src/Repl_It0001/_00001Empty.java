package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _00001Empty {

        public static boolean isPalindrome(String check) {
            boolean b1 = true;
            String result = check.replace(" ", "").toLowerCase();
            String reverse = "";
            for (int i = result.length()-1; i >= 0; i--) {
                reverse += result.charAt(i);
            }


            if(result.equals(reverse)){
                return b1;
            }
            return !b1;
        }

            public static void main(String[] args) {

                System.out.println(isPalindrome("nusesrun"));


   }
}
