package Interview_questuons3;

import java.util.Arrays;
import java.util.Collections;

public class String_FindUniques {
    public static void main(String[] args) {

    String str  = "AAABBCCCDEF";
        System.out.println(unique(str));


    }
    public static String unique(String str){

        String result = "";

        for(String each:str.split("")){


            result+= (  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        }

        return result;

    }
}
