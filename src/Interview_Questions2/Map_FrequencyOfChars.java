package Interview_Questions2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfChars {
    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        map.put('j',2);
        map.put('a',1);
        map.put('j',1);
        //map.put('j',map.get());

        System.out.println(map.get('j'));

        System.out.println(map);


        String str ="java";
        FrequencyTesting(str);





    }
    public static void FrequencyTesting(String str) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(Character each : str.toCharArray()){

            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);

            }else{
                map.put(each,1);
            }


        }
        System.out.println(map);


    }
}
