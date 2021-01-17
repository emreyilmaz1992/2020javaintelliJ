package Interview_questuons3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_RemoveDuplicates {
    public static void main(String[] args) {


        //removeDup("AAABBBCCC")  ==> ABC

        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));



    }
    public static String removeDuplicates(String str){

        String[]strings = str.split("");

        Set<String>set = new HashSet<>();
        set.addAll(Arrays.asList(strings));

        String result = "";
        for (String each: set){
            result+=each;
        }



        return result;

    }
}
