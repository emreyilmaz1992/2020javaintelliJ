package aye001.Collections.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_FirstChar {
    public static void main(String[] args) {

        String[]strings = {"salt", "tea", "soda", "toast","coffee"};
        System.out.println(firstChar(strings));





    }

    public static Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<>();


        for (int i = 0; i <strings.length ; i++) {
            String result = "";

            for (int j = 0; j <strings.length ; j++) {

                if(strings[i].substring(0,1).equals(strings[j].substring(0,1))){

                    result+= strings[j];
                    map.put(strings[i].substring(0,1),result);
                }else{

                }

            }

        }

        return map;


}

}
