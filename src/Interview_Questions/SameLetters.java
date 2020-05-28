package Interview_Questions;

import java.util.Arrays;

public class SameLetters {
    /*
    Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {

        String a = "abc";
        String b = "acb";

        System.out.println(sameLattes(a,b));













    }

    public static boolean sameLattes(String a, String b){

        char []ch1 = a.toCharArray();
        char []ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String c ="";
        String d ="";


        for (int i = 0; i <ch1.length ; i++) {

            c+= ""+ch1[i];
        }
        for (int i = 0; i <ch2.length ; i++) {
            d+= ""+ch2[i];
        }







        return c.equals(d);



    }

}
