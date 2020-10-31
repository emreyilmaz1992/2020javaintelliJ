package Interview_questuons3;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Map_UniqueChars {
    public static void main(String[] args) {

        String str = "accbbcd";
        System.out.println(uniqueChars(str));



    }
    public static Map<Character,Integer> uniqueChars(String str ){

        Map<Character,Integer>map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                map.put(str.charAt(i),count);
            }


        }


        return map;

    }


}
