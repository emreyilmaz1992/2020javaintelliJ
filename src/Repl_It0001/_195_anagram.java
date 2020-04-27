package Repl_It0001;

import java.util.Arrays;

public class _195_anagram {
    public static boolean isAnagram(String word1, String word2) {
        boolean result = true;

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        String[] check1 = word1.split("");
        Arrays.sort(check1);

        String[] check2 = word2.split("");
        Arrays.sort(check2);


        if(Arrays.equals(check1,check2)){

           return result;
        }
        return !result;
    }

    public static void main(String[] args) {

        System.out.println( isAnagram("earth","heart"));








    }
}
