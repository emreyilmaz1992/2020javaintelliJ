package aye001.Collections.Map_Interface;

import java.util.*;

public class FrequencyWithMap {
    public static void main(String[] args) {

        String [] strings = {"emre","michael","michael","ricardo"};
        strings[1] = strings[2]+strings[3];
        strings[1]= strings[1]+strings[3];
        System.out.println(strings[1]);


        System.out.println(map(strings));

        String str = "granular";

        System.out.println(map(str));






    }
    public static Map<String, Integer>map(String [] strings){

       SortedMap<String,Integer> map = new TreeMap<>();

        for (String each : strings){

            if(map.containsKey(each)){

                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }

        }


        return map;
    }

    public static Map<String , Integer> map(String str){
        Map<String, Integer>map = new HashMap<>();

        String [] strings = str.split("");

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
