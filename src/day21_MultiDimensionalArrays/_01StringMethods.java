package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _01StringMethods {
    public static void main(String[] args) {

        String name = " Java"; // 'J','a','v','a'


        char[]chars = name.toCharArray();

        System.out.println(chars[0]); // J


        String str = "I like Java";

        String[]arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        /*
        reverse sentece = day great is Today
         */

        String sentence = "Today is great day";

        String []arr2 = sentence.split(" ");
        String result = "";

       // String []reverse = new String[arr2.length];

        for (int i = arr2.length-1; i >=0 ; i--) {
            String eachWords = arr2[i];
            //System.out.print(eachWords+" ");
            result += eachWords+" ";


        }
        System.out.println(result);


        String str2 = "ABCD";

         String [] arr3 =  str2.split("");
        System.out.println(Arrays.toString(arr3));




    }
}
