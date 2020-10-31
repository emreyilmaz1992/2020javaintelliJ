package CodingBat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_wordAppend {

    public static void main(String[] args) {


        String [] strings = {"a", "b",  "c","a","a", "d", "a","c","d","a","a","d","d"};
        System.out.println(wordAppend(strings));


    }
    public static String wordAppend(String[] strings) {

        Map<String,Integer> map = new HashMap<>();
        String result="";

        int count = 0;
        for(String each : strings) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
                if(map.get(each) % 2 ==0){
                    result+=each;
                }
            } else {
                map.put(each, 1);
            }
        }
        return result;

            }


        }


