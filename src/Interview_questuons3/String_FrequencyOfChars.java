package Interview_questuons3;

import java.util.*;

public class String_FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBCDD";

        System.out.println(frequency(str));





    }
    public static Map<String, Integer> frequency(String str){

        Map<String,Integer> map  = new HashMap<>();
        String[]strings = str.split("");

        for (String each : strings){

           if(map.containsKey(each)){

               map.put(each,map.get(each)+1);
           }else{
               map.put(each,1);
           }


        }
        return map;

    }



}
