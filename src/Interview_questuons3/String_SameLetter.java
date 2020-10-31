package Interview_questuons3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_SameLetter {
    public static void main(String[] args) {

        String a = "abc";
        String b = "cba";

        System.out.println(sameLetters(a,b));

        String c = "aabbccdd";
        String[]strings = c.split("");
        Set<String>set = new HashSet<>();
        set.addAll(Arrays.asList(strings));
        System.out.println(set);



    }
    public static boolean sameLetters(String a, String b){

        String [] str1 = a.split("");
        Arrays.sort(str1);
        String[] str2 = b.split("");
        Arrays.sort(str2);

        String c =""; String d ="";

        for (String each : str1){
            c+=each;
        }
        for (String each : str2){
            d+=each;
        }

        return c.equals(d);


    }


}
