package Interview_Questions2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_SameLetters {
    public static void main(String[] args) {

        String one = "abc";
        String two = "ab";


        System.out.println(sameLetters(one, two));



    }
    public static boolean sameLetters(String one , String two){

        String [] arr1 = one.split("");
        String [] arr2 = two.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String a = "";
        String b = "";

        for(String each : arr1){
            a+= each;
        }
        for(String each : arr2){
            b+= each;
        }


    return  a.equals(b);

    }




}
