package Interview_Questions2;

import java.util.*;

public class Map_UniqueCharsFromString {
    public static void main(String[] args) {

       Map<Integer,Integer> map = new LinkedHashMap<>();





    }



    public static void UniqueChars(String str) {

       Map<Character,Integer>map = new LinkedHashMap<>();

       for(Character each : str.toCharArray()){

           if(!map.containsKey(each)){
               map.put(each,1);

           }

       }


    }

}
