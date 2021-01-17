package Interview_questuons3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_SameLetter {
    public static void main(String[] args) {

        String a = "abc";
        String b = "cba";

        System.out.println(sameLetters(a,b));





    }
    public static boolean sameLetters(String a, String b){

       String [] c = a.split("");
       String [] d = b.split("");

       String new1="";
       String new2="";

       for (String each : c){
           new1+=each;
       }
       for (String each : d){
           new2+=each;
       }

    return new1.equals(new2);

    }


}
