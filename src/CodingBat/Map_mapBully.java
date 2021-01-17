package CodingBat;

import java.util.Map;

public class Map_mapBully {
    public static void main(String[] args) {

        String word = "Naber";

        StringBuilder builder = new StringBuilder(word);





    }

    public static void  bully(Map<String,String>map){

    if(map.containsKey("a")){
        map.put("b",map.get("a"));
        map.put("a","");
    }





    }

}
